import java.util.Scanner;
class VowelProgram{
   public static void main(String Args[]){
   Scanner scan = new Scanner(System.in);
   System.out.println("Enter a Vowel Character Letter: ");
   char vowel = scan.next().charAt(0);
   switch(vowel){
            case 'a':
                System.out.println("Its a Vowel Letter");
                break;
            case 'e':
                System.out.println("Its e Vowel Letter");
                break;
            case 'i':
                System.out.println("Its i Vowel Letter");
                break;
            case 'o':
                System.out.println("Its o Vowel Letter");
                break;
            case 'u':
                System.out.println("Its u Vowel Letter");
                break;
            default:
                System.out.println("Invaild vowel Letter:");
      }

   }

}
