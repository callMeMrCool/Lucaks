package com.base.common.entity;

import lombok.Data;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

/**
 * 基础entity
 * @author acer
 */
@Data
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId
    private Long id;

}