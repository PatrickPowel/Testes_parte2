package br.com.rpires.dao.mocks;

import br.com.rpires.dao.IContratoDao;

/**
 * Mock do DAO de Contrato para testes
 * Autor: rodrigo.pires
 */
public class ContratoDaoMock implements IContratoDao {

    @Override
    public void salvar() {
        // Simula operação de salvar com sucesso
        System.out.println("Simulando salvar contrato...");
    }

    @Override
    public boolean buscar(int id) {
        // Sempre retorna verdadeiro (contrato encontrado)
        System.out.println("Simulando buscar contrato...");
        return true;
    }

    @Override
    public boolean excluir(int id) {
        // Sempre retorna verdadeiro (contrato excluído)
        System.out.println("Simulando exclusão de contrato...");
        return true;
    }

    @Override
    public boolean atualizar(int id) {
        // Sempre retorna verdadeiro (contrato atualizado)
        System.out.println("Simulando atualização de contrato...");
        return true;
    }
}
