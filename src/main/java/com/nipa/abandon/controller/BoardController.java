package com.nipa.abandon.controller;


import com.nipa.abandon.model.Board;
import com.nipa.abandon.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelExtensionsKt;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.context.WebContext;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Controller
@RequestMapping
public class BoardController {

    @Autowired
    private BoardRepository boardRepository;

    @GetMapping("/boardList")
    public String boardList(Model model,@PageableDefault(size = 20) Pageable pageable){
        Page<Board> boards = boardRepository.findAllSortedByNameUsingNative(pageable);


//  start, end page
        int startPage= Math.max(1,boards.getPageable().getPageNumber() -6);
        int endPage= Math.min(boards.getTotalPages(),boards.getPageable().getPageNumber() +6);
        model.addAttribute("startPage",startPage);
        model.addAttribute("endPage",endPage);

//        end, pending state
        int endState = boardRepository.getEndProcess();
        int pendingState = boardRepository.getPendingProcess();

        model.addAttribute("endState",endState);
        model.addAttribute("pendingState",pendingState);

        model.addAttribute("boards", boards);
        return "board/boardList";
    }

    @GetMapping("/viewDetail")
    public String boardViewDetail(Model model, @RequestParam(required = false) Long desertionNo){

            Board board = boardRepository.findById(desertionNo).orElse(null);


//        neuter
        String neuterYN=boardRepository.getNeuterYN(board.getDesertionNo());
        if(neuterYN.equalsIgnoreCase("Y")){
            neuterYN= "Yes";
        }else if(neuterYN.equalsIgnoreCase("N")){
            neuterYN= "No";
        }else if(neuterYN.equalsIgnoreCase("U")){
            neuterYN= "Unknown";
        }else{

        }
        //sex
        String gender =boardRepository.getSex(board.getDesertionNo());
        if(gender.equalsIgnoreCase("M")){
            gender= "Male";
        }else if(gender.equalsIgnoreCase("F")){
            gender= "Female";
        }else if(gender.equalsIgnoreCase("Q")){
            gender= "Unknown";
        }else{

        }
        model.addAttribute("neuterYN", neuterYN);
        model.addAttribute("gender", gender);
        model.addAttribute("board", board);
        return "board/viewDetail";
    }

    @GetMapping("/editDetail")
    public String get(Model model,@RequestParam(required = false) Long desertionNo){

        if(desertionNo == null){
            model.addAttribute("board", new Board());

        }else {
            Board board = boardRepository.findById(desertionNo).orElse(null);
            model.addAttribute("board", board);
        }

        return "board/editDetail";
    }


    @PostMapping("/editDetail")
    public String editDetail(@Valid Board board, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
//            return "board/viewDetail?desertionNo" + desertionNo;
            return "board/editDetail";
        }

        boardRepository.save(board);
        Long desertionNo = board.getDesertionNo();
//        return "redirect:/editDetail?desertionNo=" + desertionNo;
        return "redirect:/viewDetail?desertionNo=" + desertionNo;
    }
}
