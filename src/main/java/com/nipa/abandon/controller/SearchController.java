//package com.nipa.abandon.controller;

import com.nipa.abandon.model.Board;
import com.nipa.abandon.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

//@Controller
//public class SearchController {
//
//    @Autowired
//    private BoardRepository repository;
//
//    @GetMapping ("/findAll")
//    public Iterable<Board> findAll(){
//        return repository.findAll();
//    }

//    @GetMapping("/findByKind/{kind}")
//    Optional List<Board> findByKind(@PathVariable String kind){
//        return repository.findByKind(kind);
//    }

//}
