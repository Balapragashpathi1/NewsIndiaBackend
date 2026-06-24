package com.news.service;

import com.news.entity.History;
import com.news.repository.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoryService {
@Autowired
    private HistoryRepository hr;
    public History addHr(History history) {
        return hr.save(history);
    }
    public List<History> getHr() {
        return hr.findAll();
    }
    public void delete(Long id){
        hr.deleteById(id);
    }
    public void deleteAll(){
        hr.deleteAll();
    }
}
