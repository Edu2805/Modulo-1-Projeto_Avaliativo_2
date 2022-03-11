package com.devinhouse.devagro.models.dto.response;

import com.devinhouse.devagro.models.Empresa;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ListaFazendaEmpresaDto {

    private Long id;
    private String nome;
    private Empresa empresa;

}