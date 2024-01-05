package com.omega.demo04;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

/**
 * Class Book
 *
 * @author KennySo
 * @date 2024/1/5
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private String name; //书名
    private String[] writer;//作者
    private List<String> reader;//读者
    private Map<String, Object> topics;//话题
}
