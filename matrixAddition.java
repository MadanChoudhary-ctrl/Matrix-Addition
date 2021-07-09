import java.util.Scanner;

class matrixAddition {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rows : ");
        int row = sc.nextInt();
        System.out.println("Columns : ");
        int col = sc.nextInt();       
        int arr1[][] = new int[row][col];
        int newArr[][] = new int[row][col];

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("The elements in first array are : ");

        for(int x[]: arr1) {
            for(int y : x) {
                System.out.println(y);
            }
        }

        System.out.println("Enter the elements in second array : ");
        int arr2[][] = new int[row][col];
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("The elements in second array are : ");
        for(int x[] : arr2) {
            for(int y : x) {
                System.out.println(y);
            }
        }
        
        System.out.println("The newly formed matrix after the addition operation is : \n");

        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr2.length; j++) {
                newArr[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(newArr[i][j] + " " + " ");
            }
            System.out.println("\n");
        }
    }
}