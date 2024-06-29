class Shape{
    double height;
    double base;
    Shape(double height,double base){
        this.height=height;
        this.base=base;
    }
}
class Triangle extends Shape{
    Triangle(double radius,double height,double base){
        super(height,base);
    }
    public double calculateArea(){
        double a= Math.PI*base*height;
        System.out.println("area of trianle is:"+a);
        return a;
    }
    public void printinfo(){
        System.out.println("SUSHIIII");
    }
}
public class Area {
    public static void main(String[] args) {
        Triangle t1=new Triangle(20, 20, 20);
        t1.printinfo();
        t1.calculateArea();
        t1.printinfo();
        for(int i=0;i<=5;i++){
            t1.printinfo();
        }
       
    }

}