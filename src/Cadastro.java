//Aqui estarão as funções relacionadas ao cadastro dos alunos
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Cadastro {
    public static void cadastrarNomes(String alunos){
        System.out.print("Digite a quantidade de alunos a cadastrar: ");
        Scanner qtdScanner = new Scanner(System.in);
        int qtdAdicionar = qtdScanner.nextInt();

        //Laço que serve apenas para garantir que
        // o usuário não exceda o limite de alunos
        while(true){ 
        if (alunos.length() + qtdAdicionar <= 100) {
            for (int x = 0; x < qtdAdicionar; x++){
                System.out.print("Digite o nome do " + x + "° aluno: ");
                Scanner nomeScanner = new Scanner(System.in);
                
            }
        } else {
            System.out.print("Excedeu o limite de alunos (100), tente novamente com um valor inferior");
        }

        }
    }
}
    