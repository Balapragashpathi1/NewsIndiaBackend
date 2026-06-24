package com.news.controller;

import com.news.entity.History;
import com.news.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/history")
public class HistoryController {
    @Autowired
    private HistoryService hs;
    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody History h){
        return ResponseEntity.ok().body(hs.addHr(h));
    }
    @GetMapping("/get")
    public ResponseEntity<?> get(){
        return ResponseEntity.ok().body(hs.getHr());
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        hs.delete(id);
        return  ResponseEntity.ok().body("deleted");
    }
    @DeleteMapping("/delete/all")
    public ResponseEntity<?> deleteAll(){
        hs.deleteAll();
        return ResponseEntity.ok().body("all history deleted");
    }
}
