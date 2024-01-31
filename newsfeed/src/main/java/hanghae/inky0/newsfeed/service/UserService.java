package hanghae.inky0.newsfeed.service;

import lombok.RequiredArgsConstructor;
import hanghae.inky0.newsfeed.domain.User;
import hanghae.inky0.newsfeed.dto.AddUserRequest;
import hanghae.inky0.newsfeed.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public Long save(AddUserRequest dto) {
        return userRepository.save(User.builder()
                .username(dto.getUsername())
                .password(bCryptPasswordEncoder.encode(dto.getPassword()))
                .build()).getId();
    }
}