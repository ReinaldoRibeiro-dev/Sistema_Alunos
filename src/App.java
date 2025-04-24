import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class App{
    
    public static void main(String[]args){
        List <String> nomeAlunos = new ArrayList<>();
        List <Integer> notas = new ArrayList<>();
        Integer op; // Variável que armazena a opçao
        do{   
            limpaConsole();
            menu(args);
            System.out.print("Selecione uma das opções acima: ");
            try {
                Scanner opSc = new Scanner(System.in);
                op = opSc.nextInt();
            } catch (Exception e) {
                System.out.println("Digite um número válido!");
                try {
                    Thread.sleep(3500);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
                op = -1;
            }
            limpaConsole();
            //Switch case que analisa a opção do usuário e chama a devida função
            switch (op) {
                case 1:
                        cadastrarNomes(nomeAlunos);
                    break;
                case 2:
                        cadastrarNotas(notas, nomeAlunos);
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
        for(int x = 0; x < 50; x++) {
            System.out.println("\n");
        }
    }

    public static void cadastrarNomes(List <String> alunos){
        System.out.print("Digite a quantidade de alunos a cadastrar: ");
        Scanner qtdScanner = new Scanner(System.in);
        int qtdAdicionar = qtdScanner.nextInt();

        //Laço que serve apenas para garantir que
        // o usuário não exceda o limite de alunos
         
        if (alunos.size() + qtdAdicionar <= 100) {
            for (int x = 1; x <= qtdAdicionar; x++) {
            System.out.print("Digite o nome do " + ( x ) + "° aluno: ");
            Scanner nomeScanner = new Scanner(System.in);
            alunos.add(nomeScanner.nextLine());
            }
        } else {
            System.out.print("Excedeu o limite de alunos (100), tente novamente com um valor inferior");
            try {
                Thread.sleep(3500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        
    }
    // CONSERTAR ESSA FUNÇÃO. ERRO IndexOutOfBoundsException
    public static void cadastrarNotas(List <Integer> notas, List <String> alunos){
        while (true) {
            int x = 1;
            if (alunos.get(x) != null && notas.get(x) == null) {
                System.out.print("Digite a nota de " + alunos.get(x) + ": ");
                Scanner notaScanner = new Scanner(System.in);
                notas.add(notaScanner.nextInt());
                x++;
            }
        }
    }
}
