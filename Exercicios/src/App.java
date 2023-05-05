import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos funcionarios você quer cadastrar?");
        int n = sc.nextInt();
        Funcionario[] lista = new Funcionario [n];
        double soma =0;

        for(int i=0; i<n; i++){

        Funcionario func = new Funcionario();

        System.out.println("Digite a matricula do funcionario: ");
        func.setMatrícula(sc.nextInt());

        System.out.println("Digite o nome do funcionario: ");
        func.setNome(sc.nextLine());

        System.out.println("Digite o Salario do funcionario: ");
        func.setSalario(sc.nextDouble());

        soma += func.getSalario();
        lista[1] = func;
    }
        for (Funcionario funcionario : lista) {
            System.out.println(funcionario.getNome());
        }
        System.out.println("A media salarial dos funcionario é de: " + soma);

          
       


    }

}



