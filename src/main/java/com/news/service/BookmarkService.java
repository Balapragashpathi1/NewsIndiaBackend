package com.news.service;

import com.news.entity.Bookmark;
import com.news.repository.BookmarkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class BookmarkService {
@Autowired
    private BookmarkRepository br;
public void add(Bookmark b){
    br.save(b);
}
public List<Bookmark> getBookmark(){
    return  br.findAll();
}
public Bookmark delete(Long id){
    Bookmark b=br.findById(id).orElse(null);
    br.deleteById(id);
    return b;
}

}
