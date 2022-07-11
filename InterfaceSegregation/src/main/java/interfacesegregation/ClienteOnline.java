package interfacesegregation;

public class ClienteOnline implements InterfacePedido, InterfacePagamento {
    @Override
    public void fazerPedido() {
        System.out.println("Fazendo pedido online");
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Realizando pagamento online");
    }
}
