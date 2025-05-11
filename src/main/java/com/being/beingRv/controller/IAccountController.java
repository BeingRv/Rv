package com.being.beingRv.controller;


import com.being.beingRv.Model.Account;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RequestMapping("account")
public interface IAccountController {

    @GetMapping
    ResponseEntity getAllAccount();

    @GetMapping("/{id}")
    ResponseEntity<?> getAccountById(@PathVariable Long id);


    @PostMapping("/create")
    ResponseEntity create(@RequestBody Account account);
}
