import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControledeVendas controledeVendas = new ControledeVendas();
        ControledeClientes controledeClientes = new ControledeClientes();
        Controledevendores controledevendores = new Controledevendores();
        int opcao = 0;
        do {
            System.out.println("-----Menu-----");
            System.out.println("1. Cadastrar vendas");
            System.out.println("2. Cadastrar Clientes");
            System.out.println("3. Cadastrar Vendedores");
            System.out.println("4. Mostrar as vendas já realizadas");
            System.out.println("5. Mostrar Clientes Cadastrados");
            System.out.println("6. Mostrar lista de  Vendedores");
            System.out.println("7. Sair");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    controledeVendas.cadastrarVenda(scanner);
                    break;
                case 2:
                    controledeClientes.cadastrarClientes(scanner);
                    break;
                case 3:
                    controledevendores.cadastrarVendedor(scanner);
                    break;
                case 4:
                    controledeVendas.ListarVendas();
                    break;
                case 5:
                    controledeClientes.listarclientes();
                    break;
                case 6:
                    controledevendores.listarvendedores();
                    break;
                case 7:
                    System.out.println("Encerrando o programa");
                    break;
                default:
                    System.out.println("Opção nao valida");
                    break;
            }
        }while (opcao !=7);
        }
    }