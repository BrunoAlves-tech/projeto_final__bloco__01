package projeto_final_bloco_01;

import projeto_final_bloco_01.controller.CardapioController;
import projeto_final_bloco_01.model.Cardapio;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        CardapioController controller = new CardapioController();

        int opcao, numero, tipo;
        String nome;
        float preco;

        do {
            System.out.println("====================================");
            System.out.println("       HAMBURGUERIA - MENU          ");
            System.out.println("====================================");
            System.out.println("1 - Cadastrar Lanche");
            System.out.println("2 - Listar Todos os Lanches");
            System.out.println("3 - Buscar Lanche por número");
            System.out.println("4 - Atualizar Lanche");
            System.out.println("5 - Deletar Lanche");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = leia.nextInt();
            leia.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Número do Lanche: ");
                    numero = leia.nextInt();
                    leia.nextLine();

                    System.out.print("Nome do Lanche: ");
                    nome = leia.nextLine();

                    System.out.print("Tipo (1 - Hambúrguer | 2 - Refrigerante): ");
                    tipo = leia.nextInt();

                    System.out.print("Preço: ");
                    preco = leia.nextFloat();
                    leia.nextLine();

                    Cardapio novoProduto = new Cardapio(numero, tipo, nome, preco);
                    controller.cadastrar(novoProduto);
                    break;

                case 2:
                    controller.listarTodas();
                    break;

                case 3:
                    System.out.print("Digite o número do lanche para buscar: ");
                    numero = leia.nextInt();
                    controller.procurarPorNumero(numero);
                    break;

                case 4:
                    System.out.print("Número do Lanche para atualizar: ");
                    numero = leia.nextInt();
                    leia.nextLine();

                    System.out.print("Novo nome do Lanche: ");
                    nome = leia.nextLine();

                    System.out.print("Novo tipo (1 - Hambúrguer | 2 - Refrigerante): ");
                    tipo = leia.nextInt();

                    System.out.print("Novo preço: ");
                    preco = leia.nextFloat();
                    leia.nextLine();

                    Cardapio produtoAtualizado = new Cardapio(numero, tipo, nome, preco);
                    controller.atualizar(produtoAtualizado);
                    break;

                case 5:
                    System.out.print("Digite o número do lanche para deletar: ");
                    numero = leia.nextInt();
                    controller.deletar(numero);
                    break;

                case 6:
                    System.out.println("Sistema finalizado.");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 6);

        leia.close();
    }
}
