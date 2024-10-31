package com.yupi.hoj.model.enums;

import org.apache.commons.lang3.ObjectUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 题目提交枚举类
 */
public enum QuestionSubmitStatusEnum {
    WATITING(0, "等待中"),
    RUNNING(1, "判题中"),
    SUCCESS(2, "成功"),
    FAIL(3, "失败");

    private final Integer value;

    private final String text;

    QuestionSubmitStatusEnum(Integer value, String text) {
        this.value = value;
        this.text = text;
    }

    /**
     * 获取值列表
     * @return
     */
    public static List<Integer> getValues(){
        return Arrays.stream(values()).map(item -> item.value).collect(Collectors.toList());
    }

    /**
     * 根据value获取枚举对象
     * @param value
     * @return
     */
    public static QuestionSubmitStatusEnum getEnumByValue(Integer value){
        if(ObjectUtils.isEmpty(value)){
            return null;
        }
        for(QuestionSubmitStatusEnum anEnum : QuestionSubmitStatusEnum.values()){
            if(anEnum.value.equals(value)){
                return anEnum;
            }
        }
        return null;
    }
    public Integer getValue() {
        return value;
    }
    public String getText() {
        return text;
    }
}
