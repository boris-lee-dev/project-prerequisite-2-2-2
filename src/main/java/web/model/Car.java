package web.model;


public class Car {

    private String name;
    private int series;
    private String color;

    public Car() {
    }

    public Car(String name, int series, String color) {
        this.name = name;
        this.series = series;
        this.color = color;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getSeries() {
        return series;
    }
    public void setSeries(int series) {
        this.series = series;
    }



}
