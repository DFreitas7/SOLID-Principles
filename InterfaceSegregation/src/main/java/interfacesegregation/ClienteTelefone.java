package interfacesegregation;

public class ClienteTelefone implements InterfacePedido, InterfacePagamento {

    @Override
    public void fazerPedido() {
        System.out.println("Fazendo pedido pelo telefone");
    }
    @Override
    public void realizarPagamento() {
        System.out.println("Realizando pagamento online");
    }
    
}
