public class ExemploArrayDimensional {
    public static void main(String[] args) {
        int[][] meuArray = {{1,2,3,4}, {56,63,73}};

        for (int i = 0; i < meuArray.length; i++){
            for (int j = 0; j < meuArray[i].length; j++){
                System.out.println(meuArray[i][j]);
            }
        }
    }
}
