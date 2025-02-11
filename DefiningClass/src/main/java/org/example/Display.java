package org.example;

public class Display {
    private double size;
    private int numberOfColors;

    public Display(double size, int numberOfColors) {
        this.size = size;
        this.numberOfColors = numberOfColors;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getNumberOfColors() {
        return numberOfColors;
    }

    public void setNumberOfColors(int numberOfColors) {
        this.numberOfColors = numberOfColors;
    }

    @Override
    public String toString(){
        return "Size: " + size + " - Number of Colors: " + numberOfColors;
    }
}
