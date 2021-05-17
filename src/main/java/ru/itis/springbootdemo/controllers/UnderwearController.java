package ru.itis.springbootdemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.springbootdemo.dto.UnderwearPage;
import ru.itis.springbootdemo.services.UnderwearService;

@RestController
public class UnderwearController {

    @Autowired
    private UnderwearService underwearService;

    @GetMapping("/underwears/search")
    public ResponseEntity<UnderwearPage> search(@RequestParam("size") Integer size,
                                                @RequestParam("page") Integer page,
                                                @RequestParam(value = "q", required = false) String query,
                                                @RequestParam(value = "sort", required = false) String sort,
                                                @RequestParam(value = "direction", required = false) String direction) {
        return ResponseEntity.ok(underwearService.search(size, page, query, sort, direction));
    }
}
