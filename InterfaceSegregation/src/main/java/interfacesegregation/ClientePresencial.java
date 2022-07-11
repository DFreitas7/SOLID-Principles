package interfacesegregation;

public class ClientePresencial implements InterfacePedido, InterfacePagamento {
    @Override
    public void fazerPedido() {
        System.out.println("Fazendo pedido presencialmente");
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Realizando o pagamento presencialmente");
    }
}
