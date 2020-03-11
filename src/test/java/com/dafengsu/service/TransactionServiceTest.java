package com.dafengsu.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author su
 * @description
 * @date 2020/3/11
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "classpath:bean.xml")
class TransactionServiceTest {
    @Autowired
    private TransactionService transactionService;

    @Test
    void transaction() {
        transactionService.transaction();
    }
}
