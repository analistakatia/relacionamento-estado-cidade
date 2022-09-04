package com.relacionamento.estadocidade.estadocidade.controllers;

import com.relacionamento.estadocidade.estadocidade.models.Estado;
import com.relacionamento.estadocidade.estadocidade.services.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EstadoController {

    @Autowired
    private EstadoService estadoService;

    @GetMapping(path = "/estados")
    public List<Estado> buscarTodosEstados(){
        return estadoService.buscarTodos();
    }

    @GetMapping(path = "/estados/{codigo}")
    public Optional<Estado> buscarPorId(@PathVariable Integer codigo){
        return estadoService.buscarId(codigo);
    }

    @PostMapping(path = "/estados")
    @ResponseStatus(HttpStatus.CREATED)
    public Estado cadastrarEstado(@RequestBody Estado estadoModel){
        return estadoService.cadastrar(estadoModel);
    }

    @PutMapping(path = "/estados/{codigo}")
    public Estado alterarEstado(@RequestBody Estado estadoModel){
        return estadoService.alterar(estadoModel);
    }

    @DeleteMapping(path = "/estados/{codigo}")
    public void deletarEstado(@PathVariable Integer codigo){
        estadoService.deletar(codigo);
    }
}
