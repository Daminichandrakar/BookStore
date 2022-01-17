package com.bridgelabz.bookstoreapplication.dto;

import lombok.Data;

@Data
public class BookDto {
//    @NotNull(message = "Author name should not be empty")
//    @Pattern(regexp = "^[A-Z][a-z]{2,}[ ][A-z][a-z]{2,}$", message = "Name is invalid")
    private String bookAuthorName;

//    @NotNull(message = "Book name should not be empty")
    private String bookName;

    private String quantity;

//    @NotNull(message = "Image should not be empty")
    private String bookImage;

//    @NotNull(message = "Price should not be empty")
    private String bookPrice;

//    @NotNull(message = "Description should not be empty")
//    @Size(message = "Description should be within 10000 words", max = 10000)
    private String bookDescription;

}
