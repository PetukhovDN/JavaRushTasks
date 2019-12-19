package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    int top;
    int left;
    int width;
    int height;

    public Rectangle(int top, int width) {
        this.top = top;
        this.width = width;
    }

    public Rectangle(int top, int width, int height) {
        this.left = top;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int top, int width, int left, int height) {
        this.top = top;
        this.width = width;
        this.left = left;
        this.height = height;
    }

    public Rectangle(Rectangle rectangle, int width) {
        this.top = rectangle.top;
        this.height = rectangle.height;
        this.left = rectangle.left;
        this.width = width;
    }

    public static void main(String[] args) {

    }
}
