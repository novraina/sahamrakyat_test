package main;

public class Nomor1 {
    public static void main(String[] args) {
        Nomor1 nomor1 = new Nomor1();
        System.out.println(nomor1.binaryToDecimal("1001"));
        System.out.println(nomor1.decimalToBinary(19));
    }

    private int binaryToDecimal(String binary) {
        return Integer.parseInt(binary,2);
    }

    private String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }
}
