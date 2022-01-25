import java.util.Scanner;


public class Main {    
    public static void main (String[] arg) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        int length = s.length();

        for(int i=0;i<=length;i++) {
            for(int j=i+1;j<=length;j++) {
                System.out.println(s.substring(i, j));
            }
        }   

    }
}

