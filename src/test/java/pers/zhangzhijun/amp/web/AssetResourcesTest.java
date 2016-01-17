package pers.zhangzhijun.amp.web;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.test.context.web.ServletTestExecutionListener;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import pers.zhangzhijun.amp.Application;
import pers.zhangzhijun.amp.domain.AssetStatus;
import pers.zhangzhijun.amp.dto.AssetDTO;
import pers.zhangzhijun.amp.repository.AssetRepository;
import pers.zhangzhijun.amp.service.AssetService;

import javax.annotation.PostConstruct;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static pers.zhangzhijun.amp.util.DateConvert.toByteArray;

/**
 * Created by ZhangZhijun on 2015/9/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
@DirtiesContext
//@Transactional
@WithMockUser(username = "admin", password = "admin", roles = "ROLE_ADMIN")
@TestExecutionListeners({
        ServletTestExecutionListener.class,
        DependencyInjectionTestExecutionListener.class,
        DirtiesContextTestExecutionListener.class,
        TransactionalTestExecutionListener.class,
        SqlScriptsTestExecutionListener.class
})
public class AssetResourcesTest {

    @Autowired
    WebApplicationContext webApplicationContext;

    @Autowired
    AssetRepository assetRepository;

    @Autowired
    AssetService assetService;

    @Autowired
    AssetResources assetResources;

    AssetDTO assetDTO;

    public MockMvc restMockMvc;

    @PostConstruct
    public void postConstruct() {
        this.restMockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Before
    public void setUp() throws Exception {
        if (assetDTO == null) {
            assetDTO = new AssetDTO();
        }
        assetDTO.setName("水滴传感器");
        assetDTO.setManufacturerId("1");
        assetDTO.setModel("WL-123");
        assetDTO.setProtocolId("Zigbbe");
        assetDTO.setTypeId("1");
        assetDTO.setStatus(AssetStatus.ABNORMAL);
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testCreate() throws Exception {
        //assertThat(assetRepository.findAll().size() == 0);
        assertThat(assetRepository.findByName(assetDTO.getName()).size() == 0);
        ResultActions resultActions = restMockMvc.perform(post("/asset/create")
                .accept(MediaType.parseMediaType("application/json;charset=UTF-8"))
                .content(toByteArray(assetDTO))
        );

        resultActions.andExpect(status().isCreated())
                //.andExpect(jsonPath("$.name").value(equals(assetDTO.getName())))
        ;

        System.out.println("Request message: " + resultActions.andReturn().getRequest().getRequestURL().toString());
        System.out.println("Response message: " + resultActions.andReturn().getResponse().getContentAsString());
    }
}