public class Funcionario {
    
    /*Faça um programa para criar N (fornecido pelo usuário) objetos do tipo Funcionário
    (matrícula, nome e salário) e solicitar ao usuário que entre com dados para os N funcionários criados.
    Ao final imprima os valores fornecidos para estes funcionários, juntamente com a média salarial.*/

    private int Matrícula;
    private String Nome;
    private double Salario;
    public Funcionario(){

    }

    public Funcionario(int Matrícula, String Nome , double Salario){
        this.Matrícula = Matrícula;
        this.Nome = Nome;
        this.Salario = Salario;
    }


    public int getMatrícula() {
        return Matrícula;
    }
    public void setMatrícula(int Matrícula) {
        this.Matrícula = Matrícula;
    }
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        this.Nome = nome;
    }
    public double getSalario() {
        return Salario;
    }
    public void setSalario(double salario) {
        this.Salario = salario;
    }


}
