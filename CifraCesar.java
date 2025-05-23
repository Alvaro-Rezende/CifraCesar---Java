import java.util.Scanner;

public class CifraCesar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== CIFRA DE CÉSAR ===");
        System.out.println("1. Criptografar mensagem");
        System.out.println("2. Descriptografar mensagem");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
        
        int opcao = scanner.nextInt();
        scanner.nextLine(); 
        
        if (opcao == 1) {
            System.out.print("Digite a mensagem para CRIPTOGRAFAR: ");
            String mensagem = scanner.nextLine();
            
            System.out.print("Digite o número de deslocamento (ex: 3): ");
            int deslocamento = scanner.nextInt();
            
            String mensagemCriptografada = criptografar(mensagem, deslocamento);
            System.out.println("Mensagem criptografada: " + mensagemCriptografada);
            
        } else if (opcao == 2) {
            System.out.print("Digite a mensagem para DESCRIPTOGRAFAR: ");
            String mensagem = scanner.nextLine();
            
            System.out.print("Digite o número de deslocamento usado (ex: 3): ");
            int deslocamento = scanner.nextInt();
            
            String mensagemDescriptografada = descriptografar(mensagem, deslocamento);
            System.out.println("Mensagem original: " + mensagemDescriptografada);
            
        } else if (opcao == 3) {
            System.out.println("Até logo!");
        } else {
            System.out.println("Opção inválida!");
        }
        
        scanner.close();
    }
    
    // Método para criptografar
    public static String criptografar(String texto, int deslocamento) {
        String resultado = "";
        
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            
            // Se for letra maiúscula
            if (letra >= 'A' && letra <= 'Z') {
                letra = (char) (letra + deslocamento);
                
                
                if (letra > 'Z') {
                    letra = (char) (letra - 26);
                }
            }
            // Se for letra minúscula
            else if (letra >= 'a' && letra <= 'z') {
                letra = (char) (letra + deslocamento);
                
                
                if (letra > 'z') {
                    letra = (char) (letra - 26);
                }
            }
            
            resultado += letra;
        }
        
        return resultado;
    }
    
    // Método para descriptografar
    public static String descriptografar(String texto, int deslocamento) {
        String resultado = "";
        
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            
            // Se for letra maiúscula
            if (letra >= 'A' && letra <= 'Z') {
                letra = (char) (letra - deslocamento);
                
                
                if (letra < 'A') {
                    letra = (char) (letra + 26);
                }
            }
            // Se for letra minúscula
            else if (letra >= 'a' && letra <= 'z') {
                letra = (char) (letra - deslocamento);
                
                
                if (letra < 'a') {
                    letra = (char) (letra + 26);
                }
            }
            
            resultado += letra;
        }
        
        return resultado;
    }
}