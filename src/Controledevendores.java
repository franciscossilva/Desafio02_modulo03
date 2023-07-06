import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controledevendores {
    private List<Vendedor> vendedores;
    public Controledevendores(){
        vendedores=new ArrayList<>();}
    public void cadastrarVendedor(Scanner scanner){
        System.out.println("Digite o ID para o vendedor: ");
    int id = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Digite o nome do Vendedor: ");
    String nome = scanner.nextLine();
    Vendedor vendedor = new Vendedor(id,nome);
    vendedores.add(vendedor);
    System.out.println("Vendedor Cadastrado!");}
    public void listarvendedores(){
        System.out.println("-----Vendedores Cadastrados-----");
        for (Vendedor vendedor: vendedores){
            System.out.println("ID: "+ vendedor.getId());
            System.out.println("Nome: "+vendedor.getNomevendedor());
            System.out.println("----------");
        }
    }

}
