package com.bit.operation;

import com.bit.book.BookList;

public class Exit {
    public class Exit implements IOperation{
        @Override
        public void work(BookList bookList) {
            System.out.println("byebye!");
            System.exit(0);
        }
    }
