package com.library.book.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Setter
@Getter
public class BookDto {

    @NotBlank
    @Length(max = 10)
    public String name;

}
