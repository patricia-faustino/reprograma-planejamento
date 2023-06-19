package com.reprograma.biblioteca.controller;

import com.reprograma.biblioteca.model.LivroDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

// todo: 1- incluir as anotações e falar sobre a importancia de cada anotação
@RestController
@RequestMapping("/livro")
@RequiredArgsConstructor
public class LivroController {

    // todo: 2-  criar lista de livros
    List<LivroDTO> livros = new ArrayList<>();

    // todo: 3-   construir o método para salvar o livro
    @PostMapping
    public ResponseEntity<Void> save(@RequestBody LivroDTO dto) {
        //        todo: 3.1- conversar sobre o método add e
        //         que é adicionado o elemento livro na lista livros
        livros.add(dto);
        //        todo: 3.2- conversar sobre o retorno do método
        return ResponseEntity.ok().build();
    }

    //    todo: 4-  pedir que a turma abra o Insomnia/Postman
    //    todo: 5-  pedir que iniciem a requisição POST com a url http://localhost:8080/livro
    //    todo: 6- pedir que selecione o body json e digite:
    // {
    //	"id": 2,
    //	"name": "Os sete maridos de Evelyn Hugo"
    //}

    // todo: 7-   construir o método para listar os livros
    @GetMapping
    public ResponseEntity<List<LivroDTO>> getByCrm() {
        // todo: 7.1-   conversar sobre retorno dos livros
        return ResponseEntity.ok(livros);
    }

    //    todo: 4-  pedir que a turma voltar no Insomnia/Postman
    //    todo: 5-  pedir que iniciem a requisição GET com a url http://localhost:8080/livro
}
