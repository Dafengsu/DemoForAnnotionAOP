package com.dafengsu.aop;

/**
 * @author su
 * @description
 * @date 2020/3/11
 */

public class XMLTransactionManager {
    //Indicates whether the connection is closed
    private boolean isClosed = false;


    public void beginTransaction() {
        System.out.println("XML: beginTransaction");
    }



    public void commit() {
        if (isClosed) {
            throw new RuntimeException("XML: Connection is closed");
        }
        System.out.println("XML: commit...");
    }



    public void rollback() {
        System.out.println("XML: rollback...");
    }



    public void release() {
        isClosed = true;
        System.out.println("XML: Connection released.");
    }
}
