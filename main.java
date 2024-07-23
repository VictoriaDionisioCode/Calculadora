import java.util.Scanner;

class MeuPrimeiroPrograma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuarPrograma = true;

        int valor1;
        int valor2;
        char operador;

    while (continuarPrograma) {
        
        System.out.println("Digite um valor:");
        valor1 = scanner.nextInt();
        System.out.println("Digite outra valor:");
        valor2 = scanner.nextInt();

        while (true){
        System.out.println("Escolha um operador + ou -");
        operador = scanner.next().charAt(0);

        if (operador == '+' || operador == '-') {
            break;
        }else {
              System.out.println("Operador inválido. Por favor, escolha entre + ou -.");
           }
        }
        if (operador == '+'){
            System.out.println("Resultado: " + (valor1 + valor2));
        } else if (operador == '-'){
            System.out.println("Resultado: " + (valor1 - valor2));
        }

        System.out.println("Deseja fazer outra conta? sim ou não");
        char continuar = scanner.next().charAt(0);
       
        if (continuar != 's' && continuar !='S') {
            continuarPrograma = false;

        }
    }
        System.out.println("Programa encerrado.");
        scanner.close();
    
    }

}