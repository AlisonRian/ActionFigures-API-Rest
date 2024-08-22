package com.projetopw.projetofinalpw.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoResponseDTO {
    String cep;
    int numero;
    String rua;
    String bairro;
    String cidade;
    String estado;
}