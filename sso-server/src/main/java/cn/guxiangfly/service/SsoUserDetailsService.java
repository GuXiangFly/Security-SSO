package cn.guxiangfly.service;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * SsoUserDetailsService
 *
 * @author guxiang
 * @date 2017/10/23
 */
@Component
public class SsoUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return new User(username,
                "",AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER"));
    }
}
