package com.news.service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class NewsService {
    @Value("${gnews.api.key}")
    private String apiKey;
    RestTemplate rt = new RestTemplate();
    public String getNews(String cat) {
        if (cat == null || cat.isEmpty()) {
            cat = "general";
        }
        String url = "https://gnews.io/api/v4/top-headlines?category=" + cat +
                "&lang=en&max=10&apikey=" + apiKey;

        try {
            return rt.getForObject(url, String.class);
        } catch (Exception e) {
            return "{\"error\":\"Failed to fetch news: " + e.getMessage() + "\"}";
        }
    }

public String search(String keyword){

    String url =
            "https://gnews.io/api/v4/search?q="+keyword+"&lang=en&max=10&apikey="
                    + apiKey;
try {
    return rt.getForObject(url, String.class);
}catch(Exception e){
    return "{\"error\":\"Failed to fetch news: " + e.getMessage() + "\"}";
}
}
}
