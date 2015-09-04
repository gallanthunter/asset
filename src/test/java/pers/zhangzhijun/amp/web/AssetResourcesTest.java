package pers.zhangzhijun.amp.web;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import pers.zhangzhijun.amp.Application;
import pers.zhangzhijun.amp.repository.AssetRepository;
import pers.zhangzhijun.amp.service.AssetService;

import javax.annotation.PostConstruct;

/**
 * Created by ZhangZhijun on 2015/9/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
@WebAppConfiguration
@IntegrationTest
public class AssetResourcesTest {

    @Autowired
    AssetRepository assetRepository;

    @Autowired
    AssetService assetService;

    @Autowired
    AssetResources assetResources;

    public MockMvc restMockMvc;

    @PostConstruct
    public void postConstruct() {


    }

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testCreateAsset() throws Exception {

    }
}