import java.util.*;

class CharacterFrequency extends Thread {
    String str;
    
    CharacterFrequency(String str) {
        this.str = str;
    }
    
    public void run() {
        char arr[] = str.toCharArray();
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            int t = 0;
            for (int j = i; j >= 0; j--) {
                if (arr[i] == arr[j]) {
                    t++;
                }
            }
            
            if (t == 1) {
                int x = 0;
                for (int k = 0; k < n; k++) {
                    if (arr[i] == arr[k]) {
                        x++;
                    }
                }
                
                System.out.println(arr[i] + "" + x);
            }
        }
        
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        CharacterFrequency ch[] = new CharacterFrequency[n];
        for (int i = 0; i < n; i++) {
            ch[i] = new CharacterFrequency(s.next());
        }
        
        for(int i = 0; i < n; i++) {
            ch[i].start();
        }
    }
}