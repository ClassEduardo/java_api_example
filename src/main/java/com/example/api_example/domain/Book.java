package com.example.api_example.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
//notações do Lombok para gerar os constrututores automaticamente
@AllArgsConstructor
@NoArgsConstructor
public class Book {

   public String title;

   public String author;

   public String area;

   public String image;

   public String publisher;

   //Funciona da mesma forma que o @PathVariable String id mas para arquivo JSON
   @JsonProperty("year_of_publication")
   public Integer yearOfPublication;

   public String isbn;
}
