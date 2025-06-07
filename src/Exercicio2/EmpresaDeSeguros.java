package Exercicio2;

public abstract class EmpresaDeSeguros{
  private String nome;
  
  public EmpresaDeSeguros(String nome){
    this.nome = nome;
  }

  public String getNome(){
    return nome;
  }

  public abstract double getMensalidade();

}