package projeto_final_bloco_01.controller;

import projeto_final_bloco_01.model.Cardapio;
import projeto_final_bloco_01_repository.CardapioRepository;

import java.util.ArrayList;
import java.util.List;

public class CardapioController implements CardapioRepository {

    private List<Cardapio> listaProdutos = new ArrayList<>();

    @Override
    public void procurarPorNumero(int numero) {
        var cardapio = consultar(numero);
        System.out.println("Consultar número:");
        if (cardapio != null)
            cardapio.visualisar();
        else
            System.out.println("Alimento não encontrado.");
    }

    @Override
    public void listarTodas() {
        for (var cardapio : listaProdutos) {
            cardapio.visualisar();
        }
    }

    @Override
    public void cadastrar(Cardapio cardapio) {
        listaProdutos.add(cardapio);
        System.out.println("Produto cadastrado no cardápio.");
    }

    @Override
    public void atualizar(Cardapio cardapio) {
        for (Cardapio c : listaProdutos) {
            if (c.getNome().equals(cardapio.getNome())) {
                c.setPreco(cardapio.getPreco());
                System.out.println("Produto atualizado.");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    @Override
    public void deletar(int numero) {
        var cardapio = consultar(numero);
        System.out.println("Consultar número:");
        if (cardapio != null) {
            cardapio.visualisar();
            listaProdutos.remove(cardapio);
            System.out.println("Produto removido.");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    
    public Cardapio consultar(int numero) {
        for (Cardapio c : listaProdutos) {
            if (c.getNumero() == numero) {
                return c;
            }
        }
        return null;
    }
}
