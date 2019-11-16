package com.bit.operation;

public class BorrowOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("BoorowOperation");
        System.out.println(("请输入需要借阅书籍的名称");
        String name=scanner.next();
    }
}
