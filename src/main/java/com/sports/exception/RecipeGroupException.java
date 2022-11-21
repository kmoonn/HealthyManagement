package com.sports.exception;

import com.sports.common.ResponseCode;

/**
 * @Author：xuxiaobo
 * @Date:2020/10/28 10:42
 * 好好学习，天天向上
 */
public class RecipeGroupException  extends CustomException{
    public RecipeGroupException(ResponseCode responseCode) {
        super(responseCode);
    }

    public RecipeGroupException(ResponseCode responseCode, Object... args) {
        super(responseCode, args);
    }
}
