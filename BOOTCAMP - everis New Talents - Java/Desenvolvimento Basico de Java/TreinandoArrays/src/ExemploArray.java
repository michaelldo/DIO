
public class ExemploArray {
    public static void main(String[] args) {

        //Declarando o Array
        int[] meuArray = new int[7];
        int[] meuArray2 = {12,32,54,6,8,89,64};
        System.out.println(meuArray[1]);
        System.out.println(meuArray2[3]);

        //alterando o valor de um elemento
        meuArray2[2] = 10;
        System.out.println(meuArray2[2]);


        //comprimeito do array
        System.out.println(meuArray.length);

    }
}
