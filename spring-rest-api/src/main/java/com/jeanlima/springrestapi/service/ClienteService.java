package com.jeanlima.springrestapi.service;

import com.jeanlima.springrestapi.model.Cliente;
import com.jeanlima.springrestapi.rest.dto.AtualizaNomeClienteNoDTO;

public interface ClienteService {
    Cliente salvar( AtualizaNomeClienteNoDTO dto );
    void atualizaNome(Integer id, String nome);
}
