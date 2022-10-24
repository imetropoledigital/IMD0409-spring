package com.jeanlima.springrestapi.service.impl;

import org.springframework.stereotype.Service;

import com.jeanlima.springrestapi.exception.RegraNegocioException;
import com.jeanlima.springrestapi.model.Produto;
import com.jeanlima.springrestapi.repository.ProdutoRepository;
import com.jeanlima.springrestapi.rest.dto.AtualizaCampoProdutoNoDTO;
import com.jeanlima.springrestapi.service.ProdutoService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProdutoServiceImpl implements ProdutoService {
    private final ProdutoRepository produtoRepository;
    
    @Override
    public Produto salvar(AtualizaCampoProdutoNoDTO dto) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void atualizaCampo(Integer id, String descricao) {
        produtoRepository
            .findById(id)
            .map( produto -> {
                produto.setDescricao(descricao);
                return produtoRepository.save(produto);
            }).orElseThrow(() -> new RegraNegocioException("Produto inválido."));
    }
}
