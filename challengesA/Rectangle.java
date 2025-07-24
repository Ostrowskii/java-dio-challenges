package challengesA;
public class Rectangle {
    private double height;
    private double length;

    public void setHeight (double height){
        this.height = height;
    }
    public void setLength (double lenght){
        this.length = lenght;
    }

    public double getHeight(){
        return this.height;
    }
    public double getLength(){
        return this.length;
    }


    public double getArea(){
        double size = this.height * this.length;
        return size;
    }
}
