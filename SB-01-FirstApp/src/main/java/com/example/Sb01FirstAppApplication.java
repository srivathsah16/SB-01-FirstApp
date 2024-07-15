package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.dao.ReportDao;
import com.example.dto.Book;

@SpringBootApplication
public class Sb01FirstAppApplication {
	@Bean
	public Book getBook() {
		return new Book();
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext ccontext = SpringApplication.run(Sb01FirstAppApplication.class, args);
		System.out.println(ccontext.getClass().getName());
		ReportDao dao = ccontext.getBean(ReportDao.class);
		System.out.println(dao.hashCode());
		System.out.println(ccontext.getBean(Book.class).hashCode());
	}
}
