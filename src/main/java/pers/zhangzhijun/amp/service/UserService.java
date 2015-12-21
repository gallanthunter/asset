package pers.zhangzhijun.amp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import pers.zhangzhijun.amp.domain.User;
import pers.zhangzhijun.amp.dto.UserDTO;
import pers.zhangzhijun.amp.repository.UserRepository;

/**
 * Function :
 * Author   : ZhangZhijun
 * Date     : 22:16
 * Since    : v1.0.0
 */
public class UserService {
    private Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    UserRepository userRepository;

    public void createUser(UserDTO userDTO){
        User user = new User();
        user = userRepository.findByUid(userDTO.getUid());
        if (user != null){
            logger.debug("User " + user.getUid() + " already exist!");
        }
        userRepository.save(user);
        logger.debug("User " + user.getUid() + " created successfully!");
    }
}
