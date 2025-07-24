import java.util.Scanner;
public class studentmarks {
    public static void main(String[] args){

        int telugu;
        int hindi;
        int english;
        int maths;
        int science;
        int social;
        int totalmarks;
        String grade=" ";
        double average=0;

        System.out.println("===============");
        System.out.println("ABZ HIGH SCHOOL");
        System.out.println("===============");
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your marks Respectively for 100");
        System.out.print("Telugu:");
        telugu=scanner.nextInt();
        System.out.print("hindi:");
        hindi= scanner.nextInt();
        System.out.print("English:");
        english=scanner.nextInt();
        System.out.print("maths:");
        maths=scanner.nextInt();
        System.out.print("Science:");
        science=scanner.nextInt();
        System.out.print("Social:");
        social=scanner.nextInt();
        if(telugu>100 || hindi>100 || english>100 || maths>100 || science>100 || social>100)
        {
            System.out.println("marks cannot be grater than 100");

        }
         else{
            totalmarks=telugu+hindi+english+maths+science+social;
            System.out.println("your total marks out of 600 are "+totalmarks);

            average=totalmarks/6;
            System.out.printf("your average is %.2f \n",average);

        }
         if (average>90){
             System.out.println("‖A‖ Grade");
         } else if (average>80) {
             System.out.println("‖B‖ Grade");

         } else if (average>70) {
             System.out.println("‖C‖ Grade");

         } else if (average>60) {
             System.out.println("‖D‖ Grade");

         } else if (average>50) {
             System.out.println("Just Pass");

         }
         else{
             System.out.println("‖FAILED‖");
         }


    }

}
