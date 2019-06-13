package com.anwei.cast.core.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Anwei
 * @date 2019/6/13
 */
@Data
public class BaseEntity extends Model<BaseEntity> implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId
    Long id;

    @TableLogic
    Integer deleteflag;

    @Override
    protected Serializable pkVal() {
        return id;
    }
}
