package br.com.rpires.service;

/**
 * Interface do serviço de Contrato
 * Autor: rodrigo.pires
 */
public interface IContratoService {
    String salvar();
    String buscar(int id);
    String excluir(int id);
    String atualizar(int id);
}
