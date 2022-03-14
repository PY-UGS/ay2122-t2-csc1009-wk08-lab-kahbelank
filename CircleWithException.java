import java.util.Scanner;

public class CircleWithException{

    private int radius;

    public int getRadius(){
        return radius;
    }

    public void setRadius(int radius) throws IllegalArgumentException{
        
        if(radius < 0){
            throw new IllegalArgumentException("The Radius cannot be Negative");
        }else{
            this.radius = radius;
        }
    }

    public double getArea() throws Exception{
        
        double area = Math.PI * radius * radius;

        if(area >1000){
            throw new Exception("Area cannot be more than 1000");
        }
        return area;
    }

    public double getDiameter(){
        return 2 * radius;
    }

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the Radius of the Circle: ");
            int radius = scan.nextInt();

            try {

                CircleWithException circle = new CircleWithException();
                
                circle.setRadius(radius);
                
                System.out.println("Radius: " + circle.getRadius());
                System.out.println("Area: " + circle.getArea());
                
            }catch(IllegalArgumentException e){
                System.out.println(e);
            }catch(Exception e){
                System.out.println(e);
            }
        }

    }


}