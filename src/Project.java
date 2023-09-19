public class Project {
    public static void main(String[] args) {
        isPalindrome(121);
        isPerfect(6);
        numberToWord(12);
    }


    public static void isPalindrome(int number) {
 int reversedNum= 0;
 int remainder= 0;
 int originalNumber= number;
 while ( number!=0){
     remainder=number%10;
     reversedNum= reversedNum*10+ remainder;
     number/=10;

 }
if (originalNumber==reversedNum){
    System.out.println(originalNumber+"is Palindrome");
}
else {
    System.out.println(originalNumber + "is not Palindrome");
}
    }

    public static void isPerfect(int number) {
         if(number<0) {
             System.out.println(false);
         }
        int sum= 0;
         for (int i=1; i< number; i++)
         {
             if(number % i == 0)
                 sum =sum+1;
         }

         if (sum==number)
             System.out.println(true);
         else
             System.out.println(false);



   }
public static void numberToWord(int number){
        String newNum=String.valueOf(number);
        String[] array = newNum.split(" -");
       String x =array[0];


    System.out.println(x);

}
}
