package pers.zhangzhijun.amp.service.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import pers.zhangzhijun.amp.domain.Role;
import pers.zhangzhijun.amp.repository.RoleRepository;

/**
 * Created by ZhangZhijun on 2015/9/11.
 */
public class RoleService {
    private static Logger logger = LoggerFactory.getLogger(RoleService.class);

    @Autowired
    RoleRepository roleRepository;

    public Role getRoleByName(String name){
        if (name == null) {
            logger.error("Role name cannot be null!");
        }

        Role role = roleRepository.findByName(name);
        if (role == null){
            logger.error("Cannot find role name: " + name);
        }

        return role;
    }
}
