package com.news.web;

import com.news.service.news.NewsService;
import com.news.web.dto.NewsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class NewsApiController {

    private final NewsService newsService;

    @GetMapping("/api/v1/news/{id}")
    public NewsResponseDto findById (@PathVariable Long id){
        return newsService.findById(id);
    }
}
