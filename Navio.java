import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Subclasse que representa um Navio.
 * Herda atributos, métodos e funcionalidades específicas.
 */

 public class Navio extends Veiculo {
    //Atributos específicos da classe Aviao
    private String nome;
    private int numeroTripulantes;
    private String dataLancamento;
    


    //Construtores

    /**
     * Construtor vazio (padrão)
     * Chama o construtor vazio da superclasse (veiculo) implicitamente.
     */

     public Navio() {
        super(); //Chama o construtor vazio da superclasse (veiculo)
        this.nome = "";
        this.numeroTripulantes = 0;
        this.dataLancamento = "";
     }

      public Navio(int capacidadeTanque, int numeroPassageiros, double preco, String nome, int numeroTripulantes, String dataLancamento) {
        super(capacidadeTanque, numeroPassageiros, preco); //Chama o construtor da superclasse (veiculo)
            this.nome = nome;
            this.numeroTripulantes = numeroTripulantes;
            this.dataLancamento = dataLancamento;
        }

      //Construtor apenas com os dados do navio
      public Navio(String nome, int numeroTripulantes, String dataLancamento) {
        super();
        this.nome = nome;
        this.numeroTripulantes = numeroTripulantes;
        this.dataLancamento = dataLancamento;
      }
        //Construtor com nome e dados herdados
        public Navio(int capacidadeTanque, int numeroPassageiros, double preco, String nome) {
            super(capacidadeTanque, numeroPassageiros, preco);
            this.nome = nome;
        }
        //Construtor apenas com o nome
        public Navio(String nome) {
            this.nome=nome;
        }

        //Métodos getters e setters
        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public int getNumeroTripulantes() {
            return numeroTripulantes;
        }
        public void setNumeroTripulantes(int numeroTripulantes) {
            this.numeroTripulantes = numeroTripulantes;
        }
        public String getDataLancamento() {
            return dataLancamento;
        }
        public void setDataLancamento(String dataLancamento) {
            this.dataLancamento = dataLancamento;
        }

        //Métodos sobrescritos e Específicos (Override)

        @Override
        public void entrada(Scanner sc) {
            super.entrada(sc); //Reutiliza o código da superclasse
            System.out.print("Digite o nome do navio: ");
            this.nome = sc.nextLine();
                while (true) {
                    try {
                        System.out.print("Digite o número de tripulantes: ");
                        this.numeroTripulantes = sc.nextInt();
                        break; //Sai do loop se a entrada for válida
                    } catch (InputMismatchException e) {
                        System.out.println("Erro! por favor, digite um número inteiro válido.");
                        sc.next(); //Limpa o buffer do scanner                    
                }
        }
         sc.nextLine(); //Consome a quebra de linha
            System.out.print("Digite a data de Lançamento: ");
            this.dataLancamento = sc.nextLine();
    }

    @Override
    public void imprimir() {
        System.out.println("Dados do Navio: ");
        super.imprimir(); //Reutiliza o código da superclasse
        System.out.println("Nome: " + this.nome);
        System.out.println("Número de tripulantes: " + this.numeroTripulantes);
        System.out.println("Data de Lançamento: " + this.dataLancamento);
        System.out.printf("Passageiros por Tripulantes: %2.f\n", passageirosPorTripulantes());
    }

    /**
     * Calcula a razão entre o número de passageiros e o número de tripulantes.
     * @return A divisão de passageiros por tripulantes, ou 0 se não houver tripulantes.
     */

     public double passageirosPorTripulantes() {
        if (this.numeroTripulantes == 0) {
            return 0; //Evita divisão por zero
        }
     
     //É necessário converter um dos inteiros para double para garaantir uma divisão real.
        return (double) this.numeroPassageiros / this.numeroTripulantes;
     }

 }

