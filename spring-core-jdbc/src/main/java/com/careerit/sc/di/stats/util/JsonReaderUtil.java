package com.careerit.sc.di.stats.util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.io.InputStream;

@Component
public class JsonReaderUtil {

      @SneakyThrows
      public <T> T loadFromJson(String fileName, TypeReference<T> t){
        ObjectMapper objectMapper = new ObjectMapper();
        InputStream is = JsonReaderUtil.class.getResourceAsStream(fileName);
        return objectMapper.readValue(is,t);
      }

}
