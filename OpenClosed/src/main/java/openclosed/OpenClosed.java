package openclosed;

import java.util.Scanner;

public class OpenClosed {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            FormaGeometrica formaGeometrica;
            Integer comando;
            
            do {
                System.out.println("Entre com uma das opções:");
                System.out.println("1 - Circulo \t 2 - Quadrado \t 3 - Retangulo \t 0 - Sair");
            
                comando = Integer.parseInt(scanner.nextLine());
                Double primeiro, segundo;
                
                switch(comando) {
                    case 1:
                        System.out.println("Entre com o tamanho do raio:");
                        primeiro = Double.parseDouble(scanner.nextLine());
                        
                        formaGeometrica = new Circulo(primeiro);
                        break;
                    case 2:
                        System.out.println("Entre com o tamanho dos lados:");
                        primeiro = Double.parseDouble(scanner.nextLine());
                        
                        formaGeometrica = new Quadrado(primeiro);
                        break;
                    case 3:
                        System.out.println("Entre com o tamanho horizontal:");
                        primeiro = Double.parseDouble(scanner.nextLine());
                        
                        System.out.println("Entre com o tamanho vertical:");
                        segundo = Double.parseDouble(scanner.nextLine());
                        
                        formaGeometrica = new Retangulo(primeiro, segundo);
                        break;
                    default: 
                        scanner.close();
                        return;
                }
                
                System.out.println("A area da forma geometrica é: " + formaGeometrica.calcularArea());
            } while(comando != 0);
        }
    }
}
