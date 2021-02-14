package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ArticleController {

    @Autowired
    private ArticleRepository articleRepository;

    @GetMapping("articles/from")
    public String newArticleFrom(Model model) {
        return "articles/new";
    }

    @PostMapping("articles/create")
    public String createArticle(ArticleForm form) {
        log.info(form.toString());
        // System.out.println(form.toString());

        // 1. dto를 변환! Entity!
        Article article = form.toEntity();
        log.info(article.toString());
        // System.out.println(article);

        // 2. Repository에게 Entity를 DB안에 저장하기
        Article saved = articleRepository.save(article);
        log.info(saved.toString());
        // System.out.println(saved);
        return "";
    }

}
