package com.news.controller;

import com.news.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("/api/news")
    public class NewsController {

        @Autowired
        private NewsService ns;

        @GetMapping
        public String getNews(@RequestParam(required = false) String cat) {
            return ns.getNews(cat);
        }
        @GetMapping("/search")
public String search(@RequestParam  String keyword){
            return ns.search(keyword);
        }
    }
