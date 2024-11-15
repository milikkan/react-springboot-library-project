package dev.milikkan.springbootlibrary.dao;

import dev.milikkan.springbootlibrary.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
