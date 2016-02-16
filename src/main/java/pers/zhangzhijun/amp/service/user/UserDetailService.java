package pers.zhangzhijun.amp.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import pers.zhangzhijun.amp.domain.User;
import pers.zhangzhijun.amp.repository.UserRepository;

/**
 * ClassName: pers.zhangzhijun.amp.service
 * Function :
 * Author   : ZhangZhijun
 * Date     : 2015/12/21 23:50
 * Since    : v1.0.0
 */
public class UserDetailService implements UserDetailsService {

    @Autowired
    UserService userService;

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(email); //code8
        if (user == null) {
            throw new UsernameNotFoundException("UserName " + email + " not found");
        }
        // SecurityUser实现UserDetails并将SUser的Email映射为username
        //return new SecurityUser(user);
        return null;
    }
}
