import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário.


public class Aplicacao {

    public static void main(String[] args) {
        // Cria um objeto Scanner para ler o que o usuário digita no console.
        Scanner leitor = new Scanner(System.in);

        // --- OBJETOS 1 E 2: USANDO CONSTRUTOR DEFAULT ---
        System.out.println("--- CADASTRO DO COMPUTADOR 1 (com construtor default) ---");
        Computador comp1 = new Computador(); // Cria o objeto usando o construtor sem parâmetros.

        System.out.print("Digite a marca: ");
        comp1.setMarca(leitor.nextLine());

        System.out.print("Digite o modelo: ");
        comp1.setModelo(leitor.nextLine());

        System.out.print("Digite o processador: ");
        comp1.setProcessador(leitor.nextLine());

        System.out.print("Digite a memória RAM (GB): ");
        comp1.setMemoriaRAM(leitor.nextInt());
        leitor.nextLine(); 

        System.out.print("Digite o armazenamento (GB): ");
        comp1.setArmazenamento(leitor.nextInt());
        leitor.nextLine(); 

        System.out.println("\n--- CADASTRO DO COMPUTADOR 2 (com construtor default) ---");
        Computador comp2 = new Computador();

        System.out.print("Digite a marca: ");
        comp2.setMarca(leitor.nextLine());

        System.out.print("Digite o modelo: ");
        comp2.setModelo(leitor.nextLine());

        System.out.print("Digite o processador: ");
        comp2.setProcessador(leitor.nextLine());

        System.out.print("Digite a memória RAM (GB): ");
        comp2.setMemoriaRAM(leitor.nextInt());
        leitor.nextLine();

        System.out.print("Digite o armazenamento (GB): ");
        comp2.setArmazenamento(leitor.nextInt());
        leitor.nextLine();

        // --- OBJETOS 3 E 4: USANDO CONSTRUTOR COM PARÂMETROS ---
        System.out.println("\n--- CADASTRO DO COMPUTADOR 3 (com construtor de parâmetros) ---");
        System.out.print("Digite a marca: ");
        String marca3 = leitor.nextLine();

        System.out.print("Digite o modelo: ");
        String modelo3 = leitor.nextLine();

        System.out.print("Digite o processador: ");
        String processador3 = leitor.nextLine();

        System.out.print("Digite a memória RAM (GB): ");
        int ram3 = leitor.nextInt();
        leitor.nextLine();

        System.out.print("Digite o armazenamento (GB): ");
        int armazenamento3 = leitor.nextInt();
        leitor.nextLine();

        // Cria o objeto passando as variáveis diretamente para o construtor.
        Computador comp3 = new Computador(marca3, modelo3, processador3, ram3, armazenamento3);


        System.out.println("\n--- CADASTRO DO COMPUTADOR 4 (com construtor de parâmetros) ---");
        System.out.print("Digite a marca: ");
        String marca4 = leitor.nextLine();

        System.out.print("Digite o modelo: ");
        String modelo4 = leitor.nextLine();

        System.out.print("Digite o processador: ");
        String processador4 = leitor.nextLine();

        System.out.print("Digite a memória RAM (GB): ");
        int ram4 = leitor.nextInt();
        leitor.nextLine();

        System.out.print("Digite o armazenamento (GB): ");
        int armazenamento4 = leitor.nextInt();
        leitor.nextLine();

        Computador comp4 = new Computador(marca4, modelo4, processador4, ram4, armazenamento4);

        // --- EXIBIÇÃO FINAL DOS DADOS ---
        System.out.println("\n--- DADOS DO COMPUTADOR 1 ---");
        comp1.imprimir();

        System.out.println("\n--- DADOS DO COMPUTADOR 2 ---");
        comp2.imprimir();

        System.out.println("\n--- DADOS DO COMPUTADOR 3 ---");
        comp3.imprimir();

        System.out.println("\n--- DADOS DO COMPUTADOR 4 ---");
        comp4.imprimir();

        // Fecha o leitor para liberar recursos do sistema.
        leitor.close();
    }
}
    

