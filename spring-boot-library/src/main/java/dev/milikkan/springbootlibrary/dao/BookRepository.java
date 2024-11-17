package dev.milikkan.springbootlibrary.dao;

import dev.milikkan.springbootlibrary.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.RequestParam;

public interface BookRepository extends JpaRepository<Book, Long> {

    @RestResource(rel = "booktitle")
    Page<Book> findByTitleContaining(@RequestParam("title") String title, Pageable pageable);
}
