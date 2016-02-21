package pers.zhangzhijun.amp.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pers.zhangzhijun.amp.dto.UserDTO;
import pers.zhangzhijun.amp.exception.ServiceException;
import pers.zhangzhijun.amp.repository.UserRepository;
import pers.zhangzhijun.amp.service.UrlMap;
import pers.zhangzhijun.amp.service.user.UserService;

import javax.validation.Valid;

/**
 * ClassName: pers.zhangzhijun.amp.web
 * Function :
 * Author   : ZhangZhijun
 * Date     : 2016/2/21 22:36
 * Since    : v1.0.0
 */
@RestController
public class UserResources {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserResources.class);

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserService userService;

    @RequestMapping(value = UrlMap.URL_USER_CREATE, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ResponseEntity<UserDTO> create(@Valid @RequestBody UserDTO userDTO) throws ServiceException {
        userService.createUser(userDTO);
        return new ResponseEntity<UserDTO>(userDTO, HttpStatus.CREATED);
    }

}
