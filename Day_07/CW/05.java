import java.util.*;

interface Move {
  int countFrontMoves(int[] arr);
}

class MoveImpl implements Move {
  @Override
  public int countFrontMoves(int[] arr) {
    int n = arr.length;
    int moves = 0;

    for (int i = n - 1; i >= 0; i--) {
      if (arr[i] == n) {
        n--;
      } else {
        moves++;
      }
    }

    return moves;
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }

    Move move = new MoveImpl();
    int minFrontMoves = move.countFrontMoves(arr);
    System.out.println(minFrontMoves);

    scanner.close();
  }
}
