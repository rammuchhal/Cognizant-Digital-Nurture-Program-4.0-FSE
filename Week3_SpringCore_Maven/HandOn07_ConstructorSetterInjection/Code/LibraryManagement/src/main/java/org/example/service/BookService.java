package org.example.service;

import org.example.repository.BookRepository;

    public class BookService {
        private BookRepository bookRepository;

        // Constructor Injection
        public BookService(BookRepository bookRepository) {
            this.bookRepository = bookRepository;
            System.out.println("Constructor injection done.");
        }

        // Setter Injection
        public void setBookRepository(BookRepository bookRepository) {
            this.bookRepository = bookRepository;
            System.out.println("Setter injection done.");
        }

        public void addBook(String title) {
            bookRepository.saveBook(title);
        }
}
