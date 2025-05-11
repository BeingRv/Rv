package com.being.beingRv;

import com.being.beingRv.Model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AccountJpaRepository extends JpaRepository<Account,Long> {
}
