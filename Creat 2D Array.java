import java.util.*;

public class JavaBasics {

    public static boolean search(int matrix[][], int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("found at cell ("+ i + "," +j +")");
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;
    }
    
    public static void main(String[] args) {
        int matrix[][] = new int[4][4];
        int n = matrix.length, m = matrix[0].length;

        Scanner s = new Scanner(System.in);
        for(int i = 0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = s.nextInt();
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}