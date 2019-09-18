package io.javabrains.springbootsecurity;

import io.javabrains.springbootsecurity.model.User;
import io.javabrains.springbootsecurity.model.UserDetailsImpl;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author Nazar Lelyak.
 */
@Service
@AllArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        Optional<User> user = userRepository.findUserByUserName(userName);

        /*return UserDetailsImpl.builder()
                .userName(userName)
                .build();*/
        user.orElseThrow(() -> new UsernameNotFoundException("User not found: " + userName));

        return user.map(UserDetailsImpl::new).get();
    }
}
