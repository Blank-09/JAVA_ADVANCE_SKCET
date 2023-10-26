import java.util.*;

class TelephoneIndex {
    
    String name, phone_no;
    
    TelephoneIndex(String n, String ph) {
        name = n;
        phone_no = ph;
    }
    
    public static void search(TelephoneIndex[] arr, String name) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i].name.startsWith(name)) {
                System.out.println(arr[i].name + " " + arr[i].phone_no);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        TelephoneIndex[] arr = new TelephoneIndex[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new TelephoneIndex(sc.nextLine(), sc.nextLine()); 
        }
        
        search(arr, sc.next());
    }
}