public class Main {
    
    static class Welcome {
        Welcome() {
            System.out.print("Welcome ");
        }
    }
    
    static class Hello {
        Hello() {
            System.out.print("Hello ");
        }
        
    }
    
    public static void main(String[] args) {
        new Welcome();
        new Hello();
    }
}