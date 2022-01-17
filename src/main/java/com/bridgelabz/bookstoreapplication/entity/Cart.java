package com.bridgelabz.bookstoreapplication.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class Cart {
    @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String userName;
    private int bookId;
    private int bookQuantity;
}
