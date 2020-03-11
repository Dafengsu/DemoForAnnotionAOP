package com.dafengsu.service.impl;

import com.dafengsu.service.TransactionService;
import org.springframework.stereotype.Service;

/**
 * @author su
 * @description
 * @date 2020/3/11
 */
@Service("transactionService")
public class TransactionServiceImpl implements TransactionService {
    @Override
    public void transaction() {
        System.out.println("....Execute transaction....");
    }
}
