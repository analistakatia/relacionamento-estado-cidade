package com.relacionamento.estadocidade.estadocidade.services;

import com.relacionamento.estadocidade.estadocidade.models.Cidade;
import com.relacionamento.estadocidade.estadocidade.repositories.ICidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CidadeService {

    @Autowired
    private ICidadeRepository iCidadeRepository;

    public List<Cidade> buscarTodos(){
        return iCidadeRepository.findAll();
    }

    public Optional<Cidade> buscarId(Integer codigo){
        return iCidadeRepository.findById(codigo);
    }

    public Cidade cadastrarCidade(Cidade cidade){
        cidade.getCodigo();
        cidade.getNomeCidade();

        return iCidadeRepository.save(cidade);
    }

    public Cidade alterarCidade(Cidade cidade){
        cidade.getCodigo();
        cidade.getNomeCidade();

        return iCidadeRepository.save(cidade);
    }

    public void deletar(Integer codigo){
        iCidadeRepository.deleteById(codigo);
    }
}
