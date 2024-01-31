package hanghae.inky0.newsfeed.service;

import lombok.RequiredArgsConstructor;
import hanghae.inky0.newsfeed.domain.User;
import hanghae.inky0.newsfeed.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserDetailService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public User loadUserByUsername(String username) {
        return userRepository.findByUsername(username)
                .orElseThrow(() -> new IllegalArgumentException((username)));
    }
}
