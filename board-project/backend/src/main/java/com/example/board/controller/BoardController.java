package com.example.board.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/boards")
@CrossOrigin(origins = "*")
public class BoardController {

    @GetMapping("/{boardType}")
    public Map<String, Object> getBoard(@PathVariable String boardType) {
        Map<String, Object> response = new HashMap<>();
        response.put("boardType", boardType);
        response.put("title", boardType.toUpperCase() + " Board");
        
        List<Map<String, String>> posts = new ArrayList<>();
        posts.add(Map.of("id", "1", "title", boardType + " First Post", "content", "This is the content of " + boardType + " board."));
        posts.add(Map.of("id", "2", "title", boardType + " Second Post", "content", "Another interesting post."));
        
        response.put("posts", posts);
        return response;
    }
}
