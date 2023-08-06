import java.util.Scanner;
class WordCounter1{
    public  WordCounter1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String:");
        String s = sc.nextLine();
         int count = 1;
         for(int i =0;i<s.length();i++){
             if(s.charAt(i)==' '&&s.charAt(i+1)!=' ')
                 count = count+1;
         }
        System.out.println("Total Words :"+count);

    }
}
public class WordCounter {
    public static void main(String[] args) {
    WordCounter1 ww = new WordCounter1();
    }
}
