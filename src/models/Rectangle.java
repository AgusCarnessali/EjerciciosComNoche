package models;

public class Rectangle {
    private Double width = 1.0;
    private Double height = 1.0;

    public Rectangle(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
    }

    public Double getWidth() {
        return width;
    }

    public Double getHeight() {
        return height;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double area() {
        return width * height;
    }

    public Double perimeter() {
        return 2 * (width + height);
    }

}
