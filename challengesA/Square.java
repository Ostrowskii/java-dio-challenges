package challengesA;

public class Square {

    private double height;

    public void setHeight(double height){
        this.height = height;
    }

    public double getHeight(){
        return this.height;
    }

    public double getArea(){
        double area = this.height * this.height;
        return area;
    }

}
