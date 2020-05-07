package com.occamsrazor.web.util;

import java.io.File;

public enum Messenger {
    SUCCESS, FAIL, FILE_INSERT_ERROR, FILE_WRITE_ERROR;

    @Override
    public String toString() {
        String returnValue ="";
        switch(this) {
            case FILE_INSERT_ERROR : returnValue = "읽기 에러 발생"; break;
            case FILE_WRITE_ERROR : returnValue = "쓰기 에러 발생"; break;
            default:
                break;
        }
        return returnValue;
    }
}