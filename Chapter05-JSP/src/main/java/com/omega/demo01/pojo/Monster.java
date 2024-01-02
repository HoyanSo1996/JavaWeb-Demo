package com.omega.demo01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class Monster
 *
 * @author KennySo
 * @date 2023/12/29
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Monster {

    private Integer id;
    private String name;
    private String skill;
}
