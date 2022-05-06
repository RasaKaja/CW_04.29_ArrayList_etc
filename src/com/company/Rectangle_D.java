package com.company;

public class Rectangle_D {
    int a, b;

    Rectangle_D(int a, int b){
        this.a = a;
        this.b = b;
    }

    int getArea() {
        return a*b;
    }

    int getPerimeter(){
        return 2*(a+b);
    }
}
