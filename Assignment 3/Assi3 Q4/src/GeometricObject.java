public abstract class GeometricObject {

    private String color;

    private boolean filled;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public abstract double area();

    public abstract double perimeter();
}