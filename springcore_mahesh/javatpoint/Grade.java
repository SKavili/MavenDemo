package com.javatpoint;

import org.springframework.beans.factory.annotation.Autowired;

public class Grade {
    private int grade;

    public int getGrade(){
        return grade;
    }
    public void setGrade(int grade){
        this.grade=grade;
    }

    Grade(){
        System.out.println("Grade bean created");
    }


}
