package com.reprograma.biblioteca.controller;

import com.reprograma.biblioteca.model.CategoriaDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//solução do DESAFIO
// todo: 1- incluir as anotações e falar sobre a importancia de cada anotação
@RestController
@RequestMapping("/categoria")
@RequiredArgsConstructor
public class CategoriaController {

    // todo: 2-  reforçar sobre a importÂncia de uma coleção
    //  para salvar e buscar o elemento nela
    List<CategoriaDTO> categorias = new ArrayList<>();

    // todo: 3-   construir o método para salvar a categoria
    // todo: 4-   reforçar sobre a importância das anotações de declaração do método
    // todo: 5-   reforçar sobre o retorno do método e a anotação do parâmetro
    @PostMapping
    public ResponseEntity<Void> save(@RequestBody CategoriaDTO categoria) {
        //        todo: 6- reforçar que estamos adicionado um elemento a lista
        categorias.add(categoria);
        return ResponseEntity.ok().build();
    }
    //    todo: 6-  pedir que a turma abra o Insomnia/Postman
    //    todo: 7-  pedir que iniciem a requisição POST com a url http://localhost:8080/categoria
    //    todo: 8- pedir que selecione o body json e digite:
    // {
    //	"id": 2,
    //	"name": "Terror"
    //}

    // todo: 9-   construir o método para listar o livro por id
    //    todo: conversar sobre importância da parametro da anotação  /{id}
    @GetMapping("/{id}")
    public ResponseEntity<CategoriaDTO> getById(@PathVariable Long id) {
        //    todo: 10-  conversar sobre o filtro e funcionamento
        CategoriaDTO categoria = categorias.stream()
                .filter((dto) -> dto.getId().equals(id)).findFirst()
                //                todo: 11-  conversar caso o filtro não tenha resultado, retornaremos
                //                 uma categoria vazia
                .orElse(new CategoriaDTO());

        //                todo: 12-  conversar sobre o retorno das listas
        return ResponseEntity.ok(categoria);
    }

    //    todo: 13-  pedir que a turma voltar no Insomnia/Postman
    //    todo: 14-  pedir que iniciem a requisição GET com a url http://localhost:8080/categoria/{id}
    //    todo: 15-  mostrar exemplo com categoria inexistente
}
