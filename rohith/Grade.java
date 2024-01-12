package com.javapoint;

import org.springframework.beans.factory.annotation.Autowired;

public class Grade {
    private int std;
   public void setStd(int std){
        this.std=std;
    }
    public int getStd(){
        return std;
    }

    Grade(){
        System.out.println("Grade created ");
  }
}
