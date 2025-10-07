package br.com.rpires.dao;

/**
 * @author rodrigo.pires
 */
public interface IContratoDao {
    void salvar();

    boolean buscar(int id);

    boolean excluir(int id);

    boolean atualizar(int id);

    //TODO
    //Fazer métodos de buscar, excluir e atualizar
}
