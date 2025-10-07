package br.com.rpires.service;

import br.com.rpires.dao.IContratoDao;

/**
 * Implementação do serviço de Contrato
 * Autor: rodrigo.pires
 */
public class ContratoService implements IContratoService {

    private final IContratoDao dao;

    public ContratoService(IContratoDao dao) {
        this.dao = dao;
    }

    @Override
    public String salvar() {
        try {
            dao.salvar();
            return "Sucesso";
        } catch (UnsupportedOperationException e) {
            // Caso dao real não esteja implementado
            throw new UnsupportedOperationException("Não é possível salvar usando o banco real.");
        }
    }

    @Override
    public String buscar(int id) {
        boolean encontrado = dao.buscar(id);
        return encontrado ? "Encontrado" : "Não encontrado";
    }

    @Override
    public String excluir(int id) {
        boolean excluido = dao.excluir(id);
        return excluido ? "Excluído" : "Não foi possível excluir";
    }

    @Override
    public String atualizar(int id) {
        boolean atualizado = dao.atualizar(id);
        return atualizado ? "Atualizado" : "Não foi possível atualizar";
    
}

