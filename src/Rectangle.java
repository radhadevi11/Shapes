public class Rectangle implements Shape{
   private double width;
   private double height;

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public Rectangle(double width, double height) {

        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return this.width * this.height;
    }

    @Override
    public double calcPerimeter() {
        return 2*(width+height);
    }
    public boolean equals(Object other) {
        if (other instanceof Rectangle) {
            Rectangle otherRectangle = (Rectangle) other;
            if (this.width == (otherRectangle.width) && this.height == (otherRectangle.height)) {
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }



}
