//package com.nipa.abandon.controller;
//
//import java.util.List;
//
//import com.nipa.abandon.model.Board;
//import com.nipa.abandon.repository.BoardRepository;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//
//@RestController
//class BoardApiController {
//
//    private BoardRepository repository;
//
//
//    // Aggregate root
//    // tag::get-aggregate-root[]
//    @GetMapping("/boardList")
//    List<Board> all() {
//        return repository.findAll();
//    }
//    // end::get-aggregate-root[]
//
//    @PostMapping("/boardList")
//    Board newBoard(@RequestBody Board newBoard) {
//        return repository.save(newBoard);
//    }

    // Single item

//    @GetMapping("/boardList/{id}")
//    Board one(@PathVariable Long id) {
//
//        return repository.findById(id)
//                .orElseThrow(() -> new BoardNotFoundException(id));
//    }
//
//    @PutMapping("/boards/{id}")
//    Board replaceBoard(@RequestBody Board newBoard, @PathVariable Long id) {
//
//        return repository.findById(id)
//                .map(board -> {
//                    board.setName(newBoard.getName());
//                    board.setRole(newBoard.getRole());
//                    return repository.save(board);
//                })
//                .orElseGet(() -> {
//                    newBoard.setId(id);
//                    return repository.save(newBoard);
//                });
//    }
//
//    @DeleteMapping("/boards/{id}")
//    void deleteBoard(@PathVariable Long id) {
//        repository.deleteById(id);
//    }
//}