import java.util.InputMismatchException;
import java.util.Scanner;

/**Superclasse que representa um veículo.
 * Contém atributos e metódos comuns a todos os veículos.
 */

 public class Veiculo {
    //Atributos protegidos para serem acessiveis pelas classes filhas (Subclasses).

    protected int capacidadeTanque;
    protected int numeroPassageiros;
    protected double preco;

    //Construtores

    /**Construtor vazio (padrão
     * Inicializa os atributos com valores padrão.
     */

    public Veiculo() {
        this.capacidadeTanque = 0;
        this.numeroPassageiros = 0;
        this.preco = 0.0;
    }

    /**Construtor com parametros
     * Recebe os valores de inicialização de todos os atributos que sejam cda classes
     * @param capacidadetanque Capacidade do tanque do veículo.
     * @param numeropassageiros Número de passageiros que o veículo pode transportar.
     * @param preco Preço do veículo.
     */

     public Veiculo(int capacidadeTanque, int numeroPassageiros, double preco) {
        this.capacidadeTanque = capacidadeTanque;
        this.numeroPassageiros = numeroPassageiros;
        this.preco = preco;
     }

     //Métodos de getters e setters

     public int getCapacidadeTanque() {
        return capacidadeTanque;
     }
     public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
     }
     public int getNumeroPassageiros() {
        return numeroPassageiros;
     }
     public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
     }
     public double preco() {
        return preco;
     }
     public void setPreco(double preco) {
        this.preco = preco;
     }

     //Métodos Principais
     /**São os métodos e dados comuns do veículo na tela */

     public void imprimir() {
        System.out.println("Capacidade do tanque: " + this.capacidadeTanque + " litros");
        System.out.println("Número de passageiros: " + this.numeroPassageiros);
        System.out.printf("Preço: R$ %2.f\n", this.preco); //Usando "printf" para exibir o preço com duas casas decimais
     }

     /**Realizando a entrada de dados dos atributos comuns do veículo via teclado. 
      * Utiliza o tratamento de exceções para garantir que os dados sejam válidos.
      * @param sc Objeto Scanner para ler a entrada do usuário
     */

     public void entrada(Scanner sc) {
        //Tratamento de exceções para garantir que os dados sejam válidos.
        while (true) {
            try {
                System.out.print("Digite a capacidade do tanque:");
                this.capacidadeTanque = sc.nextInt();
                break; //Sai do loop se a entrada for válida
            } catch (InputMismatchException e) {
                System.out.println("Erro! por favor, digite um número inteiro válido.");
                sc.next(); //Limpa o buffer do scanner
            }   
        }

     //Tratamento de exceção para Números de Passageiros
     while (true) {
        try {
            System.out.print("Digite o número de passageiros: ");
            this.numeroPassageiros = sc.nextInt();
            break;
        } catch (InputMismatchException e) {
            System.out.println("Erro! Por favor, digite um número inteiro válido.");
            sc.next(); // Limpa o buffer do scanner
        }
     }
     
     //Tratamento de exceção para Preço
      while(true) {
        try {
            System.out.print("Digite o preço: ");
            this.preco = sc.nextDouble();
            break;
        } catch (InputMismatchException e) {
            System.out.println("Erro! Por favor, digite um número válido! ");
            sc.next(); // Limpa o buffer do scanner
        }
      }
       sc.nextLine(); //Consome as quebras de linha pendentes para evitar erros na próxima leitura
    }
 }
 
 
