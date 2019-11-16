package com.bit.operation;

import com.bit.book.Book;
import com.bit.book.BookList;

public class AddOperation implements IOperation {

    @Override
    protected void work(BookList bookList){
        System.out.println("添加书籍");
        System.out.println("请输入图书的名字帕克");
        String name=scanner.next();
        System.out.println("请输入图书的作者");
        String author=scanner.next();
        System.out.println("请输入图书的价格");
        int price=scanner.nextInt();
        System.out.println("请输入图书的类型");
        String type=scanner.next();
        Book book=new Book(name,author,price,type);
    }

}
