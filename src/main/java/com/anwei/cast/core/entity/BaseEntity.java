package com.anwei.cast.core.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

@Data
public class BaseEntity extends Model<BaseEntity> {

    @TableId
    Long id;

    @TableLogic
    Integer deleteflag;
}
