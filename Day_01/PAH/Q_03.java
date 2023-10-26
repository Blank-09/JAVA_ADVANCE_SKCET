import java.io.*;
import java.util.*;

class Sample {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        FileWriter fw = new FileWriter("output.txt");
        fw.write(sc.nextLine());
        fw.close();
        
        FileReader fr = new FileReader("output.txt");
        int ch;
        
        int upper = 0;
        int lower = 0;
        
        while ((ch = fr.read()) != -1) {
            if (Character.isUpperCase(ch)) upper++;
            else if (Character.isLowerCase(ch)) lower++;
        }
        
        System.out.print(upper + "\n" + lower);
        
        fr.close();
        sc.close();
    }
}