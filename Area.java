import java.util.Scanner;
public class Area {
   Scanner sc=new Scanner(System.in);
   double length;
   double width;
   public void setDim(){
       System.out.println("Enter the length of rectangle: ");
       length=sc.nextInt();
       System.out.println("Enter the width of rectangle: ");
       width=sc.nextInt();
   }
   public double getArea(){
       return length*width;
   }

    public static void main(String[] args) {
        System.out.println("Enter the length of rectangle: ");
        Area area=new Area();
        area.setDim();
        area.getArea();
    }
}

