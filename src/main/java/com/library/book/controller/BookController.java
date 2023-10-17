package com.library.book.controller;

import com.library.book.dto.BookDto;
import com.library.book.entity.Book;
import com.library.book.repository.BookRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.SortDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@Controller
@RequestMapping("book")
public class BookController {

    private final BookRepository bookRepository;

    private final ModelMapper mapper;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("book", new BookDto());
        model.addAttribute("books", bookRepository.findAll());
        return "book/index";
    }

    @PostMapping("add")
    public String add(@Valid @ModelAttribute("book") BookDto book, BindingResult result) {

        if (result.hasErrors())
            return "book/form";

        bookRepository.save(mapper.map(book, Book.class));

        return "book/form";
    }

    @GetMapping("find")
    public String find(@SortDefault Sort sort, Model model) {
        model.addAttribute("books", bookRepository.findAll(sort));
        return "book/books";
    }
}
