package com.relacionamento.estadocidade.estadocidade.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "estados")
public class Estado implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;

    @Column(length = 20)
    private String nomeEstado;

    @JsonIgnore
    @OneToMany(mappedBy = "estados", cascade = CascadeType.ALL)
    private List<Cidade> cidades;
}
