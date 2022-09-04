package com.relacionamento.estadocidade.estadocidade.services;

import com.relacionamento.estadocidade.estadocidade.models.Estado;
import com.relacionamento.estadocidade.estadocidade.repositories.ICidadeRepository;
import com.relacionamento.estadocidade.estadocidade.repositories.IEstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoService {

    @Autowired
    private IEstadoRepository iEstadoRepository;

    @Autowired
    private ICidadeRepository iCidadeRepository;

    public List<Estado> buscarTodos(){
        return iEstadoRepository.findAll();
    }

    public Optional<Estado> buscarId(Integer codigo){
        return iEstadoRepository.findById(codigo);
    }

    public Estado cadastrar(Estado estado){
        estado.getCodigo();
        estado.getNomeEstado();

        return iEstadoRepository.save(estado);
    }

    public Estado alterar(Estado estado){
        estado.getCodigo();
        estado.getNomeEstado();

        return iEstadoRepository.save(estado);
    }

    public void deletar(Integer codigo){
        iEstadoRepository.deleteById(codigo);
    }
}
