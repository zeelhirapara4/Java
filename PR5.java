/**
 * PR5
 */
class Matrix {
    int a1[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
    int a2[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };

    void addition() {
      System.out.println("----Adition----");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a1[i][j]+a2[i][j]);
            }
            System.out.println();
        }
    }

    void display() {
        int i;
        System.out.println("Matrix 1");
        for (i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(a1[i][j]);
            }
            System.out.println();
        }
        System.out.println("Matrix 2");
        for (i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(a1[i][j]);
            }
            System.out.println();
        }
    }
    void substraction() {
        System.out.println("----Substraction----");
          for (int i = 0; i < 3; i++) {
              for (int j = 0; j < 3; j++) {
                  System.out.print(a1[i][j]-a2[i][j]);
              }
              System.out.println();
          }
      }

}

public class PR5 {

    public static void main(String[] args) {
        System.out.println("Hello word");
        Matrix m1 = new Matrix();
        m1.display();
        m1.addition();
        m1.substraction();
    }
}