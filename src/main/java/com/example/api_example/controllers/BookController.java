package com.example.api_example.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api_example.services.BookService;

import java.util.*;

import com.example.api_example.domain.Book;

@RestController
@RequestMapping("/api/books")
public class BookController {

   /*Para quando recebemos uma variável como parâmetro na URL
   @GetMapping("/{id}")
   public static void getBooks(@PathVariable String id) {}*/

   private final BookService service;

   public BookController(BookService service) {
      this.service = service;
   }

   @GetMapping("")
   public ResponseEntity<List<Book>> getBooks() {
      List<Book> books = this.service.getBooksFromLibrary();
      System.out.println(books);
      return ResponseEntity.ok().body(books);
   }
}
