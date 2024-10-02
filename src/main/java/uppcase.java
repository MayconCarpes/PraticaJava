
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class uppcase {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Informe uma string: ");
        String input = scanner.nextLine();
        
        
        int count = contarLetraA(input);
        
        
        if (count > 0) {
            System.out.println("A letra 'a' (ou 'A') aparece " + count + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' (ou 'A') não está presente na string.");
        }

        scanner.close();
    }

    
    public static int contarLetraA(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'A') {
                count++;
            }
        }
        return count;
    }
}
