package com.news.repository;

import com.news.entity.Bookmark;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookmarkRepository extends JpaRepository<Bookmark,Long> {

}
