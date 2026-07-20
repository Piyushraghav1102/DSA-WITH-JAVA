import java.util.*;

public class loopsadv {

  public static void X(int n) {
    for (int i = 1; i <= n; i++) {
      // for rows
      for (int j = 1; j <= n; j++) {
        // column
        if (i == j || i + j == n + 1) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  public static void pattern1(int n) {

    int var = 1;// just declare some variable

    for (int i = 1; i <= n; i++) {
      // for rows
      for (int j = 1; j <= n; j++) {
        // for columns to print
        if (i - j >= 0) {
          System.out.print(var);
          var++;
        }
      }
      System.out.println();
    }
  }

  public static void butterfly(int n) {

    for (int i = 1; i <= n; i++) {
      // for rows
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      for (int j = 1; j <= 2 * (n - 1); j++) {
        System.out.print("");
      }

      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      System.out.println();
    }

  }

  public static void solidrhom(int n) {
    // for row
    for (int i = 1; i <= n; i++) {

      // spaces
      for (int j = 1; j <= (n - i); j++) {
        System.out.print(" ");
      }

      // for star
      for (int j = 1; j <= n; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

  }

  public static void hollowrhom(int n) {
    // for row
    for (int i = 1; i <= n; i++) {

      // for spaces
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }

      // for stars
      for (int j = 1; j <= n; j++) {
        if (j == 1 || j == n || i == 1 || i == n) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }

  }

  public static void Diamondpatt(int n) {
    // for row(outer loop )
    for (int i = 1; i <= n; i++) {
      // first half spaces
      for (int j = 1; j <= (n - i); j++) {
        System.out.print(" ");
      }

      // first half (stars)
      for (int j = 1; j <= (2 * i - 1); j++) {
        System.out.print("*");
      }

      System.out.println();
    }
    // 2nd half
    for (int i = n; i >= 1; i--) {
      // Second half spaces
      for (int j = 1; j <= (n - i); j++) {
        System.out.print(" ");
      }

      // Second half (stars)
      for (int j = 1; j <= (2 * i - 1); j++) {
        System.out.print("*");
      }

      System.out.println();
    }
  }

  public static void pattern(int n) {
    for (int i = 1; i <= n; i++) {
      // for spaces
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }

      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void holoowpyramid(int n) {
    for (int i = 1; i <= n; i++) {
      // spaces
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }

      // for stars
      for (int j = 1; j <= (2 * i) - 1; j++) {
        if (j == 1 || j == (2 * i) - 1 || i == n) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }

      }
      System.out.println();
    }
  }

  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    // X(5);
    // pattern1(4);
    // pattern2(4);
    // solidrhom(4);
    // hollowrhom(5);
    // Diamondpatt(4);
    // pattern(5);
    holoowpyramid(5);
  }
}
