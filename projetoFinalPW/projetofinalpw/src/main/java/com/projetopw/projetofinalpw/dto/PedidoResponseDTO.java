package com.projetopw.projetofinalpw.dto;

import com.projetopw.projetofinalpw.controller.EnderecoController;
import com.projetopw.projetofinalpw.controller.PedidoController;
import com.projetopw.projetofinalpw.controller.UsuarioController;
import com.projetopw.projetofinalpw.domain.Figure;
import com.projetopw.projetofinalpw.domain.Pedido;
import com.projetopw.projetofinalpw.domain.Usuario;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PedidoResponseDTO extends RepresentationModel<PedidoResponseDTO> {
    List<Figure> figures;
    Usuario usuario;
    Float valorTotal;
    public void addLinks(Pedido u){
        this.add(linkTo(PedidoController.class).slash(u.getId()).withSelfRel());
        this.add(linkTo(UsuarioController.class).slash(u.getUsuario().getId()).withRel("usuario"));
    }
}
