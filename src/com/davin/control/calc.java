package com.davin.control;


import java.util.Arrays;
import java.util.Stack;

public class calc {
    public static float evaluasiAngka(String num){
        char[] array = num.toCharArray();
        Stack<Float> angka = new Stack<Float>();
        Stack<Character> operand = new Stack<Character>();

        for (int i=0; i<array.length;i++){
            if(array[i] == ' ')
                continue;

            if(array[i]>='0' && array[i]<='9'){
                StringBuffer temp = new StringBuffer();
                //Cek Digit
                while(i<array.length && array[i]>='0' && array[i]<='9')
                    temp.append(array[i++]);
                angka.push(Float.parseFloat(temp.toString()));
            }
            else if (array[i] == '('){
                //PUSH kurung buka
                operand.push(array[i]);
            }
            else if (array[i] == ')'){
                //PUSH Kurung tutup
                while (operand.peek() != '(')
                    angka.push(applyOP(operand.pop(),angka.pop(),angka.pop()));
                operand.pop();
            }
            else if (array[i] == '+' || array[i] == '-' || array[i] == '*' || array[i] == '/'){
                while(!operand.empty() && cekValue(array[i],operand.peek()))
                    angka.push(applyOP(operand.pop(),angka.pop(),angka.pop()));
                operand.push(array[i]);
            }
        }
        while(!operand.empty())
            angka.push(applyOP(operand.pop(),angka.pop(),angka.pop()));
        return angka.pop();
    }
    public static boolean cekValue(char op1 , char op2){
        if(op2 == '(' || op2 == ')')
            return false;
        if((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
            return false;
        else
            return true;
    }
    public static float applyOP(char op ,float b, float a){
        switch (op){
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
                if(b==0){
                    throw new UnsupportedOperationException("Tidak Bisa Membagi Angka 0");
                }
                return a/b;
        }
        return 0;
    }
    public static void getAngka(String a){

    }
    /*
    public static void main(String args[]){
        System.out.println(calc.evaluasiAngka("10 + 2 * 6"));
    }*/
}
