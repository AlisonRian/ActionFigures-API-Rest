package com.projetopw.projetofinalpw.dto;

import com.projetopw.projetofinalpw.controller.EnderecoController;
import com.projetopw.projetofinalpw.controller.PedidoController;
import com.projetopw.projetofinalpw.controller.UsuarioController;
import com.projetopw.projetofinalpw.domain.Endereco;
import com.projetopw.projetofinalpw.domain.Pedido;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoResponseDTO extends RepresentationModel<EnderecoResponseDTO> {
    String cep;
    int numero;
    String rua;
    String bairro;
    String cidade;
    String estado;
    public void addLinks(Endereco u){
        this.add(linkTo(EnderecoController.class).slash(u.getId()).withSelfRel());
    }
}
