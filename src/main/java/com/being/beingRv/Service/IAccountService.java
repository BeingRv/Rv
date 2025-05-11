package com.being.beingRv.Service;

import com.being.beingRv.Model.Account;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

public interface IAccountService {

    ResponseEntity getAllAccount();
    ResponseEntity create(@RequestBody Account account);
    ResponseEntity getAccountById(Long id);
}
