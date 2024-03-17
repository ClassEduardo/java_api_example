package com.example.api_example.services;


import com.example.api_example.domain.Book;
import com.example.api_example.feign.BookClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

   private final BookClient bookClient;

   public BookService(BookClient client) {
      this.bookClient = client;
   }

   public List<Book> getBooksFromLibrary() {
      return this.bookClient.getBooks();
   }
}
