import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class App {
    
    public static void main(String[]args){
        ArrayList <String> nomeAlunos = new ArrayList<>();
        Integer op; // Variável que armazena a opçao
        do{   
            limpaConsole();
            menu(args);
            System.out.print("Selecione uma das opções acima: ");
            Scanner opSc = new Scanner(System.in);
            op = opSc.nextInt();
            limpaConsole();
            //Switch case que analisa a opção do usuário e chama a devida função
            switch (op) {
                case 1:
                    
                    break;
                case 0:
                    System.out.println("Sistema finalizado");
                    break;
                default:
                    System.out.println("Selecione uma opção válida");
                    break;
            }
        }while(op != 0);    

        }
    //Função que imprime o menu
    public static void menu(String[]args){
        System.out.println("____________________");
        System.out.println("1. Cadastrar alunos |");
        System.out.println("2. Cadastrar notas  |");
        System.out.println("3. Visualizar alunos|");
        System.out.println("0. Sair             |");
        System.out.println("____________________|");
    }
    //Função que "limpa a tela". Procurar solução melhor posteriormente
    public static void limpaConsole() {
        for(int x = 0; x < 25; x++) {
            System.out.println("\n");
        }
    }
    
}
