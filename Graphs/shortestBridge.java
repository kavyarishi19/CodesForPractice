import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class shortestBridge {

  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[][] arr = new int[n][n];

    for (int i = 0; i < n; i++) {
      String[] st = br.readLine().split(" ");
      for (int j = 0; j < n; j++) {
        arr[i][j] = Integer.parseInt(st[j]);
      }
    }

    System.out.println(shortestBridge(arr));

  }

  public class Pair{
    int row;
    int col;
  }

  public static int shortestBridge(int[][] A) {

  }
}

