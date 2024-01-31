package hanghae.inky0.newsfeed.repository;

import hanghae.inky0.newsfeed.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}