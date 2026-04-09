public class question4 {
    public static void main(String[] args) {
        float[][] A = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };
        float[][] B = {
                { 7, 8, 9 },
                { 1, 2, 3 }
        };

        float[][] result = new float[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {

                result[i][j] = A[i][j] + B[i][j];
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }

    }
}
