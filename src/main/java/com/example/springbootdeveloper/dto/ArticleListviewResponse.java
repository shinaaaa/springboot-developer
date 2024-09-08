package com.example.springbootdeveloper.dto;

import com.example.springbootdeveloper.domain.Article;
import lombok.Getter;

@Getter
public class ArticleListviewResponse {

    private final Long id;
    private final String title;
    private final String content;

    public ArticleListviewResponse(Article article) {
        this.id = article.getId();
        this.title = article.getTitle();
        this.content = article.getContent();
    }
}
