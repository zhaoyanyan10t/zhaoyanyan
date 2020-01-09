package com.bitedu.main;

import com.bitedu.data.Student;
import com.bitedu.db.DatabaseOperator;

public class CourseSystem {
    public static void main(String[] args) {

        for (int i=0; i < 100; ++i) {
            Student stu = new Student();
            stu.setSn(20190005+i);
            stu.setName("亚索"+i);
            if (i % 2==0)
                stu.setClassid(1);
            else
                stu.setClassid(2);


            DatabaseOperator.insertStudent(stu);
        }

        Student stu_querey =
                DatabaseOperator.selectStudent(20190003);

        System.out.println(stu_querey);

        DatabaseOperator.selectStudentCount();
    }
}
