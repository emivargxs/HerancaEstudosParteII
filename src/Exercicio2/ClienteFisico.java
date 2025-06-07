package Exercicio2;

public class ClienteFisico extends EmpresaDeSeguros {
    private int idade;
    private double salario;
    private double mensalidade;


    public ClienteFisico(String nome, int idade, double salario, double mensalidade){
    super(nome);
    this.idade = idade;
    this.salario = salario;
    }
    
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int novaIdade){
        this.idade = novaIdade;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double novoSalario){
        this.salario = novoSalario;
    }

    @Override
    public double getMensalidade(){
        return mensalidade;
      }

}



