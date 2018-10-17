public interface Shape extends Comparable<Shape>{
    public double calcArea();
    public double calcPerimeter();
    public default int compareTo(Shape other) {
        if(this.calcArea() == other.calcArea()) {
            return 0;
        }
        else if (this.calcArea() > other.calcArea()) {
            return 1;

        }
        else {
            return -1;
        }
    }


}
