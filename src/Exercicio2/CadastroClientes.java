package Exercicio2;

import java.util.ArrayList;

public class CadastroClientes {
    ArrayList<EmpresaDeSeguros> listaClientes = new ArrayList<>();
    public void adicionarCliente(EmpresaDeSeguros clientes ){
        listaClientes.add(clientes);
    }

public String listarClientes() {
    StringBuilder sb = new StringBuilder(); //cria um objeto do tipo StringBuilder chamado sb
    for (EmpresaDeSeguros cliente : listaClientes) { 
        sb.append("Nome: ").append(cliente.getNome())
        .append(" | Mensalidade: R$ ").append(cliente.getMensalidade())
        .append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
  CadastroClientes cadastro = new CadastroClientes();

        // Adicionando clientes físicos
        cadastro.adicionarCliente(new ClienteFisico("Ana", 25, 2500.0, 250.0));
        cadastro.adicionarCliente(new ClienteFisico("Bruno", 30, 3200.0, 320.0));
        cadastro.adicionarCliente(new ClienteFisico("Carlos", 28, 2800.0, 280.0));
        cadastro.adicionarCliente(new ClienteFisico("Daniela", 35, 3500.0, 350.0));
        cadastro.adicionarCliente(new ClienteFisico("Eduardo", 40, 4000.0, 400.0));
        cadastro.adicionarCliente(new ClienteFisico("Fernanda", 22, 2200.0, 220.0));
        cadastro.adicionarCliente(new ClienteFisico("Gabriel", 27, 2700.0, 270.0));
        cadastro.adicionarCliente(new ClienteFisico("Helena", 33, 3300.0, 330.0));
        cadastro.adicionarCliente(new ClienteFisico("Isabela", 29, 2900.0, 290.0));
        cadastro.adicionarCliente(new ClienteFisico("João", 31, 3100.0, 310.0));

        // Adicionando clientes jurídicos
        cadastro.adicionarCliente(new ClienteJuridico("Empresa A", 100000.0));
        cadastro.adicionarCliente(new ClienteJuridico("Empresa B", 200000.0));
        cadastro.adicionarCliente(new ClienteJuridico("Empresa C", 150000.0));
        cadastro.adicionarCliente(new ClienteJuridico("Empresa D", 300000.0));
        cadastro.adicionarCliente(new ClienteJuridico("Empresa E", 250000.0));

        // Imprimindo a listagem
        System.out.println(cadastro.listarClientes());
    }

}
