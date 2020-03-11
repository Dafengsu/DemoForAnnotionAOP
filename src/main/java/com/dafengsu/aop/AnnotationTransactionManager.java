package com.dafengsu.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author su
 * @description
 * @date 2020/3/11
 */
@Component("annotationTransactionManager")
@Aspect
public class AnnotationTransactionManager {
    //Indicates whether the connection is closed
    private boolean isClosed = false;



    @Pointcut("execution(* com.dafengsu.service.impl.*.*(..))")
    private void daoTransfer() {

    }

    @Before("daoTransfer()")
    public void beginTransaction() {
        System.err.println("Annotation: beginTransaction");
    }


    @AfterReturning("daoTransfer()")
    public void commit() {
        if (isClosed) {
            throw new RuntimeException("Annotation: Connection is closed");
        }
        System.err.println("Annotation: commit...");
    }


    @AfterThrowing("daoTransfer()")
    public void rollback() {
        System.err.println("Annotation: rollback...");
    }


    @After("daoTransfer()")
    public void release() {
        isClosed = true;
        System.err.println("Annotation: Connection released.");
    }
}
