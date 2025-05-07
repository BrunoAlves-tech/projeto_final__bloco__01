package projeto_final_bloco_01_repository;

import projeto_final_bloco_01.model.Cardapio;

public interface CardapioRepository {

    void procurarPorNumero(int numero);
    void listarTodas();
    void cadastrar(Cardapio cardapio);
    void atualizar(Cardapio cardapio);
    void deletar(int numero);
    
   
    Cardapio consultar(int numero);
}
