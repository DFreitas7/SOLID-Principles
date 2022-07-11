package interfacesegregation;

public class InterfaceSegregation {

    public static void main(String[] args) {
        ClientePresencial clientePresencial = new ClientePresencial();
        ClienteTelefone clienteTelefone = new ClienteTelefone();
        ClienteOnline clienteOnline = new ClienteOnline();
        
        clientePresencial.fazerPedido();
        clientePresencial.realizarPagamento();
        
        clienteTelefone.fazerPedido();
        clienteTelefone.realizarPagamento();
        
        clienteOnline.fazerPedido();
        clienteOnline.realizarPagamento();
    }
}
