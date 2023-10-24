import java.util.*;

interface Rotate {
  void leftRotate(int arr[], int d, int n);
  void leftRotatebyOne(int arr[], int n);
  void printArray(int arr[], int n);
}

class Main implements Rotate {
  public void leftRotate(int arr[], int d, int n) {
    for (int i = 0; i < d; i++) {
      leftRotatebyOne(arr, n);
    }
  }

  public void leftRotatebyOne(int arr[], int n) {
    int num = arr[0];
    for (int i = 1; i < n; i++) {
      arr[i - 1] = arr[i];
    }
    arr[n - 1] = num;
  }

  public void printArray(int arr[], int n) {
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    Main m = new Main();

    m.leftRotate(arr, 1, n);
    m.printArray(arr, n);
  }
}