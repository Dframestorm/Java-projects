import java.util.Locale;
import java.util.Scanner;

/**
 * Classe principal para testar a hierarquia de classes Veiculo, Avião e Navio.
 */

 public class Aplicacao {
    public static void main(String[] args) {
        //Configura o Locale para usar o ponto como separador decimal no Scanner
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);

        //Criação de um vetor único da superclasse Veiculo para armazenar 20 objetos.
        //Este é o poliformismo: um vetor de Veiculo pode conter objetos Aviao e Navio.

        Veiculo[] frota = new Veiculo[20];

        System.out.println("Cadastro da Frota" );

        // Criando e preenchendo os 10 primeiros objetos para o Avião
        System.out.println("Cadastrando 10 Aviões: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Inserindo dados para o Avião #" + (i + 1));
            //Utilizar o construtor vazio para criar a instância
            frota[i] = new Aviao();
            //Chama o método de entrada para preencher os dados do objeto
            frota[i].entrada(scanner);
        }

        // Criando e preenchendo os 10 primeiros objetos para o Navio
        System.out.println("Cadastrando 10 Navios: ");
        for (int i = 10; i < 20; i++) {
            System.out.println("Inserindo dados para o Navio #" + (i - 9));
            //Utilizar o construtor vazio para criar a instância
            frota[i] = new Navio();
            //Chama o método de entrada para preencher os dados do objeto
            frota[i].entrada(scanner);
        }

        //Imprimindo os dados de todos os veículos cadastrados
        System.out.println("\n Relatório completo da Frota: ");

        //Imprimindo os dados de todos os veículos da frota
        for (Veiculo v : frota) {
            //O método imprimir() é chamado de forma polimórfica. Cada objeto responde de acordo com sua classe real (Aviao ou Navio)
            v.imprimir();
        }

        scanner.close();
        System.out.println("Programa encerrado." );
    }
 }