public class Project {
    public static void main(String[] args) {
        isPalindrome(121);
        System.out.println(isPerfect(28));
        System.out.println(numberToWord(21));
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
    System.out.println(true);
}
else {
    System.out.println(false);
}
    }

    public static boolean isPerfect(int number) {
         if(number<0) {
             return false;
         }
        int sum= 0;
         for (int i=1; i<= number/2; i++)
         {
             if(number % i == 0)
               sum +=i;
         }

        return sum == number;



   }
        public static String numberToWord(int number){
        char[] newNum=String.valueOf(number).toCharArray();
        String numberToText= "";
        for (char digits: newNum){
            switch (digits){
                case '0':
                    numberToText+="Zero ";
                    break;
                case '1':
                    numberToText+="One ";
                    break;
                case '2':
                    numberToText+="Two ";
                    break;
                case '3':
                    numberToText+="Tree ";
                    break;
                case '4':
                    numberToText+="Four ";
                    break;
                case '5':
                    numberToText+="Five ";
                    break;
                case '6':
                    numberToText+="Six ";
                    break;
                case '7':
                    numberToText+="Seven ";
                    break;
                case '8':
                    numberToText+="Eight ";
                    break;
                case '9':
                    numberToText+="Nine ";
                    break;

            }


            }
            return numberToText.trim();
        }



}

