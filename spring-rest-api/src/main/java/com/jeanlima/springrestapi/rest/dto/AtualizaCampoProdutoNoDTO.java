package com.jeanlima.springrestapi.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ProdutoDTO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder 
public class AtualizaCampoProdutoNoDTO {
    private String descricao;
}