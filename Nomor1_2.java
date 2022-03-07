package main;

public class Nomor1 {
    public static void main(String[] args) {
        Nomor1 nomor1 = new Nomor1();
        System.out.println(nomor1.binaryToDecimal(1001));
        nomor1.decimalToBinary(19);
    }

    private int binaryToDecimal(int binary) {
        int decimal = 0, i = 0, rem;

        while (binary != 0) {
            rem = binary % 10;
            binary /= 10;
            decimal += rem * Math.pow(2, i);
            ++i;
        }
        return decimal;
    }

    private void decimalToBinary(int decimal) {
        int[] a = new int[10];
        int i;
        for (i = 0; decimal > 0; i++) {
            a[i] = decimal % 2;
            decimal = decimal/2;
        }
        for(i = i - 1 ; i >= 0 ; i--) {
            System.out.print(a[i]);
        }
    }
}
