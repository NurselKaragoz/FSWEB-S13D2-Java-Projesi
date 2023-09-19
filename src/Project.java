public class Project {
    public static void main(String[] args) {
        isPalindrome(128);
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
    System.out.println(originalNumber+ " is Palindrome");
}
else {
    System.out.println(originalNumber + " is not Palindrome");
}
    }
}