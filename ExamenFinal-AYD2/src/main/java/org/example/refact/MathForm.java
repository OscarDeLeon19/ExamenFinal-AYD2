package org.example.refact;

/**
 * Se creo la clase MathForm para manejar procesos de calculos matematics
 */
public class MathForm {

    public MathForm() {
    }

    public double calculateArea(String shape, double... dimensions) {
        switch (shape) {
            case "circle":
                return Math.PI * dimensions[0] * dimensions[0];
            case "rectangle":
                return dimensions[0] * dimensions[1];
            case "triangle":
                return dimensions[0] * dimensions[1] / 2;
            default:
                throw new IllegalArgumentException("Unknown shape");
        }
    }
}
