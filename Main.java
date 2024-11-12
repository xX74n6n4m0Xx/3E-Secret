import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter Something lul");
      String wew = x.nextLine();
String palabra = wew;
        String beans = "just a test to see the lul";
        //this is to add the lul
        int j = 0;
        char[] abc = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ ".toCharArray();
        String txt = "";
        while (true) {
            if (j >= palabra.length()) {
                break; 
            }
            for (int i = 0; i < abc.length; i++) {
                System.out.println(txt + abc[i]);
               
                if (abc[i] == palabra.charAt(j)) {
                    txt += abc[i];
                    j += 1; 
                    break; 
                }
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (txt.equals(palabra)) {
                System.out.println("You Entered : "+wew);
                break;     
            }
        }
    }
}
