import java.util.Scanner;
public class cbsemarks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       
        System.out.println("enter the total mark per subject");
        float t=sc.nextFloat();
        float totalmarks=t*5;
        System.out.println("TOTAL MARKS:"+totalmarks);
        System.out.println("enter mark of 1 suject");
        float a=sc.nextFloat();
        System.out.println("enter mark of 2 suject");
        float b=sc.nextFloat();
        System.out.println("enter mark of 3 suject");
        float c=sc.nextFloat();
        System.out.println("enter mark of 4 suject");
        float d=sc.nextFloat();
        System.out.println("enter mark of 5 suject");
        int e=sc.nextInt();
        float sum=a+b+c+d+e;
        System.out.println("TOTAL OBTAINED MARKS"+sum);
        float percentage=(sum/totalmarks)*100;
        System.out.println("percentage is:"+percentage);
    }
}
