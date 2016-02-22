package pers.zhangzhijun.amp.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * ClassName: pers.zhangzhijun.amp.util
 * Function :
 * Author   : ZhangZhijun
 * Date     : 2016/1/17 1:17
 * Since    : v1.0.0
 */
public class DataConvert {
    public static byte[] convertObjectToJson (Object object) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        return objectMapper.writeValueAsBytes(object);
    }
}
