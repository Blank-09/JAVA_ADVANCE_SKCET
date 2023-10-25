class Parent {
    public void m1() {
        System.out.println("From parent m1()");
    }
    
    public void m2(int a) {
        System.out.println(a);
    }
}

class Child extends Parent {
    public void m1() {
        System.out.println("From child m1()");
    }
}
