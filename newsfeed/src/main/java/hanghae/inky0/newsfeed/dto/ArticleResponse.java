package hanghae.inky0.newsfeed.dto;

import lombok.Getter;
import hanghae.inky0.newsfeed.domain.Article;

@Getter
public class ArticleResponse {

    private final String title;
    private final String content;

    public ArticleResponse(Article article) {
        this.title = article.getTitle();
        this.content = article.getContent();
    }
}
