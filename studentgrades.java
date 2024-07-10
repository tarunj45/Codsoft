import java.util.Scanner;

public class studentgrades {
    public static void main(String[] args) {
        
    

    Scanner sc = new Scanner(System.in);
    System.out.println("MARKS IN MATHS OUT OF 100");
    int maths = sc.nextInt();
    System.out.println("MARKS IN SCIENCE OUT OF 100");
    int science  = sc.nextInt();
    System.out.println("MARKS IN ENGLISH OUT OF 100");
    int english =  sc.nextInt();
    System.out.println("MARKS IN HINDI OUT OF 100");
    int hindi = sc.nextInt();
    System.out.println("MARKS IN EVS OUT OF 100");
    int evs =  sc.nextInt();

    System.out.println();

    float TOTALMARKS = (maths+science+english+hindi+evs);
    System.out.println(" TOTAL MARKS OBTAINED :  "+TOTALMARKS);

    float averagepercentage =  (TOTALMARKS/500)*100;
    System.out.println("AVERAGE PERCENTAGE:   "+  averagepercentage);

     
    if(averagepercentage>=90){
        System.out.println("TOTAL GRADES "  + "A+");
        
    }
    else if (averagepercentage<90 && averagepercentage>=80){
        System.out.println("TOTAL GRADES "  + "A");
    }
    else if(averagepercentage<80 && averagepercentage>=70){
        System.out.println("TOTAL GRADES "  + "B");
    }
    else if (averagepercentage<70 && averagepercentage>=60) {
        System.out.println("TOTAL GRADES "  + "C");

    }
    else if(averagepercentage<60 && averagepercentage>=50){
        System.out.println("TOTAL GRADES "  + "D");
    }
    else if (averagepercentage<50 && averagepercentage>=40) {
        System.out.println("TOTAL GRADES "  + "E");
    }
    else{
        System.out.println("TOTAL GRADES "  + "F");
    }
    sc.close();
}
}