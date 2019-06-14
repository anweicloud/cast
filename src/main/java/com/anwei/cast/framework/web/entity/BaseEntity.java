package com.anwei.cast.framework.web.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

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

    @TableField(fill = FieldFill.INSERT)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GTM+8")
    Date createtime;

    @TableField(fill = FieldFill.UPDATE)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GTM+8")
    Date updatetime;

    @Override
    protected Serializable pkVal() {
        return id;
    }
}
