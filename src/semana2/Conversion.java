/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana2;

/**
 *
 * @author enrique
 */
public class Conversion {
    public static void main(String[] args) {
        byte valorByte = 127;
        long valorLong = 10L;
        float valorFloat = 3.14F;
        char valorChar = 'c';
        int valorEntero = 200;
        double valorDouble = 5.6766665653232141697912;
       
        // Conversion implicita
        int representacionEntera = valorChar;
        System.out.println(representacionEntera);
        
        int enteroByte = valorByte;
        System.out.println(enteroByte);
        
        float floatEntero = valorLong;
        
        double doubleFloat = valorFloat;
        
        // Conversion explicita: Casting/Casteo
        byte byteEntero = (byte)valorEntero;
        System.out.println("Generara 200?: " + byteEntero);
        
        long longFloat = (long)valorFloat;
        System.out.println("Generara 3.14?: " + longFloat);
        
        float floatDouble = (float)valorDouble;
        System.out.println("El double representa a -> 5.6766665653232141697912? " + valorDouble);
        System.out.println("El float representa a -> 5.6766665653232141697912?: " + floatDouble);
        
        // Situaciones especiales
        // El tipo booleano no puede convertirse a otro tipo.
        boolean valorBool = false;
        //int castEnteroBool = valorBool;
        //int castEnteroBool = (int)valorBool;
        
        // El tipo String no puede convertirse de forma directa.
        //int castEnteroString = "123";
        //int castEnteroString2 = (int)"123";
        int parseoEnteroString = Integer.parseInt("44");      
        System.out.println(parseoEnteroString);
        float parseoFloatString = Float.parseFloat("123.5");
        System.out.println(parseoFloatString);
        
        // Transformar un numero a String
        String str1 = "" + 10;
        String str2 = String.valueOf(10);        
        
        //int valorPotencia = 3^3;
        //System.out.println("Potencia" + valorPotencia);
        
    }
}

