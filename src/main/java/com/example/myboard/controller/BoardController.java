package com.example.myboard.controller;

import com.example.myboard.domain.Board;
import com.example.myboard.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BoardController {

    @Autowired
    private BoardRepository boardRepository;

    // 글 목록 보기
    @GetMapping("/boards")
    public String list(Model model) {
        List<Board> boards = boardRepository.findAll();
        model.addAttribute("boards", boards);
        return "board/list";
    }

    // 글 작성 페이지
    @GetMapping("/boards/new")
    public String createForm(Model model) {
        model.addAttribute("board", new Board());
        return "board/createForm";
    }

    // 글 저장
    @PostMapping("/boards")
    public String create(@ModelAttribute Board board) {
        boardRepository.save(board);
        return "redirect:/boards";
    }

    // 글 삭제
    @PostMapping("/boards/{id}/delete")
    public String delete(@PathVariable Long id) {
        boardRepository.deleteById(id);
        return "redirect:/boards";
    }
}