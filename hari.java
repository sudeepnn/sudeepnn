public class assignment2a {
    public  static void main(String args[])
    {
        float a[]={4,7,2,9};
        float sum=0;
        for(float i:a)
        {
            sum+=i;
        }
        float avg=(float)sum/4;
        System.out.println("average is"+avg);
        System.out.println();
{
            int x[]={1,2,3,4,5,6,7,8,9,10};
            for(int i:x)
            {
                if(i%4!=0)
                {
                    System.out.println("the numbers which are not multiples of 4 : "+i);   
                }
            }
                  System.out.println();
        }
           int n[]={3,6,9,12,15,18,21,27,30};
            int cnt=0;
            for(int i:n)

                       {
                        if(i%3==0);
                        System.out.println("the numbers which are multiples of 3 : "+i);
                        cnt++;      
                    if(cnt>=5)
                    break;
                }
                
    }
}
