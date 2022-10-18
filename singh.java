import java.util.Scanner;
public class findingthewebsite {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String website=sc.next();
        if(website.endsWith(".org")){
        System.out.println("This is an organization website");
        }
        else if(website.endsWith(".com")){
            System.out.println("This is an commercial website");
            }
            else if(website.endsWith(".in")){
                System.out.println("This is an indian website");
                }
    }
}
