package com.jeanlima.springrestapi.service;


import com.jeanlima.springrestapi.model.Produto;
import com.jeanlima.springrestapi.rest.dto.AtualizaCampoProdutoNoDTO;

public interface ProdutoService {
    Produto salvar( AtualizaCampoProdutoNoDTO dto );
    void atualizaCampo(Integer id, String nome);
}
