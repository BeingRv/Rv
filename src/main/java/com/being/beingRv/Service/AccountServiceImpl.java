package com.being.beingRv.Service;

import com.being.beingRv.AccountJpaRepository;
import com.being.beingRv.Model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements IAccountService{
    @Override
    public ResponseEntity getAccountById(Long id) {
        return ResponseEntity.ok(accountJpaRepository.findById(id).orElseThrow());
    }

    @Autowired
    private AccountJpaRepository accountJpaRepository;
    @Override
    public ResponseEntity getAllAccount() {
        return ResponseEntity.ok(accountJpaRepository.findAll());
    }

    @Override
    public ResponseEntity create(Account account) {
        return ResponseEntity.ok(accountJpaRepository.save(account));
    }
}
