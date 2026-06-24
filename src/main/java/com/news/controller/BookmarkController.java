package com.news.controller;
import com.news.entity.Bookmark;
import com.news.service.BookmarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bookmarks")
public class BookmarkController {
    @Autowired
    private BookmarkService bs;
    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody Bookmark b){
        bs.add(b);
        return ResponseEntity.ok().body("added to bookmarks");
    }
    @GetMapping("/get")
    public ResponseEntity<?> get(){
        return  ResponseEntity.ok().body(bs.getBookmark());
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        return  ResponseEntity.ok().body(bs.delete(id));
    }
}
