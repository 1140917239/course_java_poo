package models;

public class Class {

    private int num_1;
    private int num_2;
    private int res;

    public Class() {
    }

    public Class(int num_1, int num_2, int res) {
        this.num_1 = num_1;
        this.num_2 = num_2;
        this.res = res;
    }

    public int getNum_1() {
        return num_1;
    }

    public void setNum_1(int num_1) {
        this.num_1 = num_1;
    }

    public int getNum_2() {
        return num_2;
    }

    public void setNum_2(int num_2) {
        this.num_2 = num_2;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public int sumar() {
        return num_1 + num_2;
    }

    public int restar() {
        return num_1 - num_2;
    }

    public int multiplicar() {
        return num_1 * num_2;
    }

    public int dividir() {
        if (num_2 > 0) {
            return num_1 / num_2;
        }
        System.out.print("el numero ingresado tiene que ser diferente a 0");
        return 0;
    }

}
