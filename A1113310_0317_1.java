import java.util.Scanner;

public class A1113310_0317_1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Input n :");
        int n = sc.nextInt();

        System.out.print("Input m :");
        int m = sc.nextInt();

        int[][] isArray = new int[n][m];
        for(int i=0; i<n;i++){
            for(int j=0; j<m; j++){
                isArray[i][j]=(i+1)*(j+1);
             }
        }
        for(int[] array : isArray){
            for(int value : array){
                System.out.print(value+" ");
            }
            System.out.println();
        }
    }
}

