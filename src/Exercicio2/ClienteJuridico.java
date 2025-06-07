package Exercicio2;

public class ClienteJuridico extends EmpresaDeSeguros {
    private double mensalidade;

    public ClienteJuridico(String nome, double mensalidade){
    super(nome);
    this.mensalidade = mensalidade;
    }

    public void setMensalidade(double novaMensalidade){
        this.mensalidade = novaMensalidade;
    }

    public double getMensalidade(){
        return mensalidade;
    }

}
