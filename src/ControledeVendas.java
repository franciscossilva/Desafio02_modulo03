import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControledeVendas {
    private List<Venda> vendas;
    public ControledeVendas(){
        vendas= new ArrayList<>();}

    public void cadastrarVenda(Scanner scanner){
        System.out.println("Digite o Numero da venda: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o nome(produto) da venda: ");
        String nomedavenda = scanner.nextLine();
        Venda venda = new Venda(id,nomedavenda);
        vendas.add(venda);
        System.out.println("Venda Cadastrada!");}
    public void ListarVendas(){
        System.out.println("-----Vendas cadastradas-----");
        for (Venda venda: vendas){
            System.out.println(" ID: "+ venda.getId());
            System.out.println("Nome da Venda: "+ venda.getNomedavenda());
            System.out.println("---------");
        }

    }
}
