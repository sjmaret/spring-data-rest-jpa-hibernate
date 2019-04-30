package com.spring.jpa.dao;

import com.spring.jpa.model.BookPublisher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookPublisherRepository extends JpaRepository<BookPublisher, Integer> {
}
