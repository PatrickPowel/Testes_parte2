package br.com.rpires.dao;

/**
 * @author rodrigo.pires
 */
public class ContratoDao implements IContratoDao {

    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Não funciona com o banco");
    }

    @Override
    public boolean buscar(int id) {
        return false;
    }

    @Override
    public boolean excluir(int id) {
        return false;
    }

    @Override
    public boolean atualizar(int id) {
        return false;
    }
}
