/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_hexade;

/**
 *
 * @author ManaimTI
 */
public class Calculadora_Hexade {

    //DECIMAL PARA BINARIO
    public static String converteDecimalParaBinario(int valor) throws Exception{
        int resto = -1;
        StringBuilder sb = new StringBuilder();

        if (valor == 0) {
            return "0";
        }

        // enquanto o resultado da divisão por 2 for maior que 0 adiciona o resto ao início da String de retorno
        while (valor > 0) {
            resto = valor % 2;
            valor = valor / 2;
            sb.insert(0, resto);
        }

        return sb.toString();
    }

    //DECIMAL PARA HEXADECIMAL
    public static String converteDecimalParaHexadecimal(int valor) throws Exception{
        char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int resto = -1;
        StringBuilder sb = new StringBuilder();

        if (valor == 0) {
            return "0";
        }

        // enquanto o resultado da divisão por 16 for maior que 0 adiciona o resto ao início da String de retorno
        while (valor > 0) {
            resto = valor % 16;
            valor = valor / 16;
            sb.insert(0, hexa[resto]);
        }

        return sb.toString();
    }

    //DECIMAL PARA OCTAL
    public static String converteDecimalParaOctal(int valor) throws Exception{
        int resto = -1;
        StringBuilder sb = new StringBuilder();

        if (valor == 0) {
            return "0";
        }

        // enquanto o resultado da divisão por 8 for maior que 0 adiciona o resto ao início da String de retorno
        while (valor > 0) {
            resto = valor % 8;
            valor = valor / 8;
            sb.insert(0, resto);
        }

        return sb.toString();
    }

}
