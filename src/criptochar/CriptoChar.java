/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criptochar;

import java.util.Scanner;

/**
 *
 * @author amct2
 */
public class CriptoChar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char [] vowels = {'a','e','i','o','u'};
        char [] consonants = {'b', 'c', 'd', 'f', 'g',
            'h', 'j', 'k', 'l', 'm', 'n', 'ñ', 'p', 'q', 'r', 's', 't',
            'v', 'w', 'x', 'y', 'z'};
        Scanner sc = new Scanner(System.in);
        System.out.println("--------PROGRAMA PARA LA DESENCRIPTACIÓN DE MENSAJES UTILIZANDO UN CIFRADO CONOCIDO--------");
        System.out.println("Por favor, introduzca la cadena a desencriptar en la próxima línea: ");
        String cadena = sc.nextLine();
        char move;
        int count = -1;
        String transcription = "";
        for(int i = 0; i < cadena.length(); i++){
            
            if(cadena.charAt(i) == ':'){
                transcription += " ";
                continue;
            }
            
            if(cadena.charAt(i) == '-'){
                continue;
            }
            
            while(i < cadena.length() && cadena.charAt(i) == '*'){
                i++;
                count++;
            }
            
            if(count < 5 && count > -1){
                i--;
                transcription += vowels[count];
            }
            
            count = -1;
            
            while(i < cadena.length() && cadena.charAt(i) == '#'){
                i++;
                count++;
            }
            
            if(count < 22 && count > -1){
                i--;
                transcription += consonants[count];
            }
            
            count = -1;
            
            
        }
        
        System.out.println("--------MENSAJE DESENCRIPTADO--------");
        System.out.println(transcription);
        
        
    }
    
}
