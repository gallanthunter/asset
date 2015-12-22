package pers.zhangzhijun.amp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import pers.zhangzhijun.amp.domain.User;
import pers.zhangzhijun.amp.dto.UserDTO;
import pers.zhangzhijun.amp.repository.SubscriptionRepository;
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

    @Autowired
    SubscriptionRepository subscriptionRepository;

    public void createUser(UserDTO userDTO){
        User user = new User();
        user = userRepository.findByUid(userDTO.getUid());
        if (user != null){
            logger.debug("User " + user.getUid() + " already exist!");
        }
        user = convertUserDTOToUser(userDTO);
        userRepository.save(user);
        logger.debug("User {} created successfully!",user.toString());
    }

    public void updateUser(UserDTO userDTO) {
        User user = new User();
        user = userRepository.findByUid(userDTO.getUid());
        if (user == null) {
            logger.debug("User {} not exist!", userDTO.getUid());
        }
        user = convertUserDTOToUser(userDTO);
        userRepository.save(user);
    }

    public UserDTO getUserByUid(String uid) {
        User user = new User();
        UserDTO userDTO = new UserDTO();
        user = userRepository.findByUid(uid);
        if (user == null) {
            return null;
        }
        userDTO = convertUserToUserDTO(user);

        return userDTO;
    }

    public void deleteUser(UserDTO userDTO) {
        User user = new User();
        user = userRepository.findByUid(userDTO.getUid());
        if (user == null) {
            logger.debug("User {} not exist!", userDTO.getUid());
        }
        if (subscriptionRepository.findBySid(userDTO.getUid()) != null) {
            logger.debug("User {} associate with a asset!",userDTO.getUid());
        }
        userRepository.delete(user);
        logger.debug("User {} delete successfully!");
    }

    public User convertUserDTOToUser(UserDTO userDTO) {
        User user = new User();
        user.setUid(userDTO.getUid());
        user.setUsername(userDTO.getUsername());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());
        user.setProjectGroupId(userDTO.getProjectGroupId());
        user.setRoleId(userDTO.getRoleId());

        return user;
    }

    public UserDTO convertUserToUserDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUid(user.getUid());
        userDTO.setUsername(user.getUsername());
        userDTO.setEmail(user.getEmail());
        userDTO.setPassword(user.getPassword());
        userDTO.setProjectGroupId(user.getProjectGroupId());
        userDTO.setRoleId(user.getRoleId());

        return userDTO;
    }
}
