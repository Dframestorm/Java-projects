import java.util.Scanner;

/**
 * Subclasse que representa um avião.
 * Herda atributos, métodos e funcionalidades específicas.
 */

 public class Aviao extends Veiculo {
    //Atributos específicos da classe Aviao
    private String prefixo;
    private String dataRevisao;

    //Construtores

    /**
     * Construtor vazio (padrão)
     * Chama o construtor vazio da superclasse (veiculo) implicitamente.
     */

     public Aviao() {
        super(); //Chama o construtor vazio da superclasse (veiculo)
        this.prefixo = "";
        this.dataRevisao = "";
     }

     /**
      * Constutor com parâmetros
      * @param capacidadeTanque Herda de Veiculo.
      * @param numeroPassageiros Herda de Veiculo.
      * @param preco Herda de Veiculo.
      * @param prefixo Prefixo do avião.
      * @param dataRevisao Data da última revisão do avião.
      */

      public Aviao(int capacidadeTanque, int numeroPassageiros, double preco, String prefixo, String dataRevisao) {
        super(capacidadeTanque, numeroPassageiros, preco); //Chama o construtor da superclasse (veiculo)
        this.prefixo = prefixo;
        this.dataRevisao = dataRevisao;
      }

      //Métodos getters e setters

      public String getPrefixo() {
        return prefixo;
      }
      public void setPrefixo(String prefixo ) {
        this.prefixo = prefixo;
      }
        public String getDataRevisao() {
            return dataRevisao;
        }
      public void setdataRevisao(String dataRevisao) {
        this.dataRevisao = dataRevisao;
      }

    //Método sobrescritos e Específicos (Override)
    /**
     * Sobrescerve o método de entrada da superclasse.
     * Primeiro chama o método da superclasse para ler os dados comuns,
     * depois lê os dados específicos do avião.
     * @param sc Objeto Scanner para ler a entrada do teclado.
     */
      @Override
      public void entrada(Scanner sc) {
        super.entrada(sc); //Chama o método entrada() de Veiculo para preencher os dados comuns
        System.out.print("Digite o prefixo do avião: ");
        this.prefixo = sc.nextLine();
        System.out.print("Digite a data da última revisão: ");
        this.dataRevisao = sc.nextLine();
      }

      /**
       * Sobrescreve o método imprimir da superclasse.
       * Primeiro chama o método da superclasse para imprimir os dados comuns,
       * depois imprime os dados específicos do avião.
       */

       @Override
       public void imprimir() {
        System.out.println("Dados do Avião: ");
        super.imprimir(); //Chama o método imprimir() de Veiculo para exibir os dados comuns
        System.out.println("Prefixo: " + this.prefixo);
        System.out.println("Data da última revisão: " + this.dataRevisao);
        System.out.println("------------------------------");
       }
    
    /**
     * Reajusta o preço do avião com base em um percentual. 
     * @param percentual 0 valor percentual a ser adicionado ao preço (ex: 20 para 20%
     */

     public void reajustarPreco(double percentual) {
        //this.preco é acessível porque foi declarado como 'protected' em Veiculo
        this.preco += this.preco * (percentual / 100.0);
     }
 }
