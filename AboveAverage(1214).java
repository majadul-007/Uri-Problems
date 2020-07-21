//import com.sun.tools.jdeprscan.scan.Scan;

import java.io.IOException;
import  java.util.Scanner;
/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
 class Main {

    public static void main(String[] args) throws IOException {

        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        int c;
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        while (c-->0){
            int n, x;
            float j=0;

            n = sc.nextInt();
            int total =0;
            int[] b = new int[100];
                for(int i =0; i<n; i++){
                    x = sc.nextInt();
                    b[i] = x;
                }
                for(int k : b){

                    total = total + k;
                }
                total = total/n;
                System.out.println(total);
                for (int i=0; i<n;i++){
                    if(b[i]>total){
                        j++;
                        System.out.println(j);
                        System.out.println(b[i]);
                    }
                }
                System.out.println((j/n)*100 +"%");
            }

        }

    }

