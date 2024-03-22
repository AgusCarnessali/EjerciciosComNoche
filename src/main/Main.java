package main;

import models.Rectangle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Inicializar un objeto estableciedno ancho y alto;
        Rectangle rect = new Rectangle(1.0, 1.0);

        //Imprimir por pantalla el ancho y alto del rectangulo
        System.out.println("Rectangle Height: " + rect.getHeight());
        System.out.println("Rectangle Width: " + rect.getWidth());

        //Modificando el alto y ancho de la instancia con los metodos setters
        rect.setHeight(2.5);
        rect.setWidth(3.2);

        //imprimer el area y el perimetro del rectangulo

        System.out.println("Area: " + rect.area());
        System.out.println("Perimeter: " + rect.perimeter());

        //Inicializar un objeto con el ancho y alto predeterminados
        Rectangle rectangle = new Rectangle();
        System.out.println("Ancho predeterminado: "+rectangle.getWidth() + ", Altura predeterminada: " + rectangle.getHeight());
    }
}