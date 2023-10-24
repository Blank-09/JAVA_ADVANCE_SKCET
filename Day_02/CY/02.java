import java.util.*;

class Marks {
  int rollno, m1, m2, m3;
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    Marks[] marks = new Marks[n];

    for (int i = 0; i < n; i++) {
      marks[i] = new Marks();
      marks[i].rollno = sc.nextInt();
      marks[i].m1 = sc.nextInt();
      marks[i].m2 = sc.nextInt();
      marks[i].m3 = sc.nextInt();
    }

    // Total Marks & Highest Marks
    int hm = 0, hr = 0;
    for (Marks mark : marks) {
      int total = mark.m1 + mark.m2 + mark.m3;
      if (hm < total) {
        hm = total;
        hr = mark.rollno;
      }
      System.out.println(total);
    }

    // Highest Mark
    int i = marks[0].m1, j = marks[0].m2, k = marks[0].m3;
    int ii = 0, ji = 0, ki = 0, c = 0;

    for (Marks mark : marks) {
      if (i < mark.m1) {
        i = mark.m1;
        ii = c;
      }
      if (j < mark.m2) {
        j = mark.m2;
        ji = c;
      }
      if (k < mark.m3) {
        k = mark.m3;
        ki = c;
      }
      c++;
    }

    System.out.println(marks[ii].rollno + " " + i);
    System.out.println(marks[ji].rollno + " " + j);
    System.out.println(marks[ki].rollno + " " + k);
    System.out.println(hr + " " + hm);
  }
}