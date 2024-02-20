package LP1.Array;

public class MatrizSomaIndices {
    public static void main(String[] args) {
        int [][]m = new int[3][3];
        for(int i = 0;i<3;i++){
            for(int j = 0; j<3 ; j++){
                m[i][j] = i + j;
                System.out.print(m[i][j]+"   ");
            }
            System.out.println();
        }
    }
}
