public class Computador {
    // Atributos
    // Características do computador
    //Usamos o 'private' para progetger os dados(encapsulamento)

    private String marca;
    private String modelo;
    private String processador;
    private int memoriaRAM; 
    private int armazenamento; 
    //Construtores
     /* Construtor Default (sem parametros) 
       Cria um objeto Computador com valores padrão (nulos ou zero)
       */

    public Computador(){

    }
       
    /**
     * Construtor com Parâmetros.
     * Cria um objeto Computador e já atribui os valores iniciais aos atributos.
     * @param marca A marca do computador.
     * @param modelo O modelo do computador.
     * @param processador O processador do computador.
     * @param memoriaRAM A quantidade de memória RAM em GB.
     * @param armazenamento A capacidade de armazenamento em GB.
     */


    public Computador(String marca, String modelo, String processador, int memoriaRAM, int armazenamento){
        //A palavra 'this' faz referencia ao atributo da classe
        this.marca = marca;
        this.modelo = modelo;
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
    }

    //Métodos Acessores (Getters e Setters)
    //Métodos especiais para acessar e modificar os atributos armazenados em uma propriedade

    public String getMarca(){
        return this.marca;
    }
    
    public String getModelo(){
        return this.modelo;
    }

    public String getProcessador(){
        return this.processador;
    }

    public int getMemoriaRAM(){
        return this.memoriaRAM;
    }

    public int getArmazenamento(){
        return this.armazenamento;
    }

    //Setters para definir ou modificar os valores de um atributo

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setProcessador(String processador){
        this.processador = processador;
    }

    public void setMemoriaRAM(int memoriaRAM){
        this.memoriaRAM = memoriaRAM;
    }

    public void setArmazenamento(int armazenamento){
        this.armazenamento = armazenamento;
    }

    //Método para exibir as informações do computador
    public void imprimir(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Processador: " + this.processador); 
        System.out.println("Memória RAM: " + this.memoriaRAM + "GB");
        System.out.println("Armazenamento: " + this.armazenamento + "GB");
    }
}