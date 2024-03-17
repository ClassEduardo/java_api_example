package com.example.api_example.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.api_example.domain.Book;

@FeignClient(name = "book-client", url = "https://livros-example-api.s3.eu-north-1.amazonaws.com/books.json")
public interface BookClient {
   
   @GetMapping("")
   public List<Book> getBooks();
}
