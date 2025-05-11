package com.being.beingRv.controller;


import com.being.beingRv.Model.Account;
import com.being.beingRv.Service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController implements  IAccountController{

    @Autowired
    private IAccountService iAccountService;
    @Override
    public ResponseEntity getAllAccount() {
        return iAccountService.getAllAccount();
    }

    @Override
    public ResponseEntity<?> getAccountById(Long id) {
        return iAccountService.getAccountById(id);
    }

    @Override
    public ResponseEntity create(Account account) {
        return iAccountService.create(account);
    }
}
