import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControledeClientes {
    private List<Cliente> clientes;
    public ControledeClientes(){
        clientes = new ArrayList<>();}
    public void cadastrarClientes(Scanner scanner){
        System.out.println("Digite o ID para o cliente: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o nome do cliente");
        String nome = scanner.nextLine();
        Cliente cliente = new Cliente(id,nome);
        clientes.add(cliente);
        System.out.println("Cliente Cadastrado");}
    public void listarclientes(){
        System.out.println("-----Cliente Cadastrados-----");
        for (Cliente cliente:clientes){
            System.out.println("ID: "+cliente.getId());
            System.out.println("Nome: "+cliente.getNomedocliente());
            System.out.println("----------");
        }
    }
}
