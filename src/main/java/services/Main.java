/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import co.edu.unicauca.figures.Circle;
import co.edu.unicauca.figures.Figure;
import co.edu.unicauca.figures.Square;
import co.edu.unicauca.figures.Triangle;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author evers
 */
public class Main {

    public static void main(String[] args) {

        Figure fig1 = new Circle(3.0); //radio
        Figure fig2 = new Square(2.3); //lado
        Figure fig3 = new Triangle(12, 15); //base y altura

        List<Figure> figures = new ArrayList<>();
        figures.add(fig1);
        figures.add(fig2);
        figures.add(fig3);

        for (Figure fig : figures) {
            System.out.println("Area: " + fig.calculateArea());
            System.out.println("Perimeter: " + fig.calculatePerimeter());
        }
    }
}
