/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.figures;

/**
 *
 * @author evers
 */
public class Triangle extends Figure {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return base * height / 2;
    }

    @Override
    public double calculatePerimeter() {
        return (2 * Math.sqrt((Math.pow(base / 2, 2)) + Math.pow(height, 2))) + base;
    }

   
}
