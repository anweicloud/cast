package com.anwei.cast.modules.admin.entity;

import com.anwei.cast.core.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Anwei
 * @since 2019-06-12
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class City extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableField("Name")
    private String Name;

    @TableField("CountryCode")
    private String CountryCode;

    @TableField("District")
    private String District;

    @TableField("Population")
    private Integer Population;


}
