package com.alan.lucas.entity;

import com.base.common.entity.BaseEntity;
import lombok.Data;

/**
 * @author Alan
 * @since 2018-09-20
 */
@Data
public class User extends BaseEntity {

    private Integer age;
    private String name;
    private String email;
}
