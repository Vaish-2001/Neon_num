class neonnum
 {
  /*A neon number is a number where the sum of digits 
   of square of the number is equal to the number.
   */
  public static void main(String[]args)
   {
    int num=9;
    int num1=0;
    int num2=num;
    int sum=0;
    num1 =num*num;
 
    while(num1>0)
    {
     int rem=num1%10;
     sum=sum+rem;
     num1=num1/10;
    }
     System.out.println(sum);
    
    if(num2==sum)
     {
      System.out.println("it is neon num");
     }
    else
     {
      System.out.println("it is not neon num");
     }
  }
 }
