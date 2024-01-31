package hanghae.inky0.newsfeed.repository;

import hanghae.inky0.newsfeed.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}