/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Fibonacci {



    
    public static List<Integer> generateFibonacci(int n) {
        List<Integer> fibSequence = new ArrayList<>();
        fibSequence.add(0);
        fibSequence.add(1);
        
        while (true) {
            int nextFib = fibSequence.get(fibSequence.size() - 1) + fibSequence.get(fibSequence.size() - 2);
            if (nextFib > n) {
                break;
            }
            fibSequence.add(nextFib);
        }
        
        return fibSequence;
    }

   
    public static boolean isInFibonacci(int num) {
        List<Integer> fibSequence = generateFibonacci(num);
        return fibSequence.contains(num);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Informe um número: ");
        int number = scanner.nextInt();
        
        
        if (isInFibonacci(number)) {
            System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + number + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}

   
