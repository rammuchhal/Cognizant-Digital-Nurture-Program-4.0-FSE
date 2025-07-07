package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryApp {
    public static void main(String[] args) {
        // ✅ Load Spring container
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // ✅ Get the BookService bean
        BookService bookService = context.getBean("bookService", BookService.class);

        // ✅ Call method to test DI
        bookService.addBook("Clean Code by Robert C. Martin");
    }
}
