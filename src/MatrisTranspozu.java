public class MatrisTranspozu {
    static void transpoz(int[][] a) {
        int[][] transpoz = new int[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int k = 0; k < a[i].length; k++) {
                transpoz[k][i] = a[i][k];
            }
        }
        for (int i = 0; i < transpoz.length; i++) {
            for (int k = 0; k < transpoz[i].length; k++) {
                System.out.print(transpoz[i][k] + "   ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] array = {{7, 16, 28}, {4, 12, 36}};
        System.out.println("Matris");

        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                System.out.print(array[i][k] + "  ");
            }
            System.out.println();
        }
        System.out.println("==============================");
        System.out.println("Matris Transpozu");
        transpoz(array);
    }
}