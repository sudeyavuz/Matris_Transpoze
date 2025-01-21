package JAVA101;
import java.util.Arrays;
public class arrays_ornek6 {
    public static void main(String[] args) {
        int matris[][] =
                {
                        {1, 2, 3},
                        {4, 5, 6},
                };
        System.out.println("Matris: ");
        for (int i = 0; i < matris.length; i++) {
            System.out.print("{ ");
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println("}");
        }
        System.out.println("Transpoze: ");
        for (int j = 0; j < matris[0].length; j++) {
            for (int i = 0; i < matris.length; i++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }


    }
}