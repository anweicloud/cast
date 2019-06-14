package com.anwei.cast.config.mybatis.plus;

import org.apache.ibatis.reflection.MetaObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;

import java.util.Date;

/**
 * 填充器
 *
 * @author nieqiurong 2018-08-10 22:59:23.
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyMetaObjectHandler.class);

    @Override
    public void insertFill(MetaObject metaObject) {
        LOGGER.info("start insert fill ....");
        //避免使用metaObject.setValue()
        if (metaObject.hasSetter("createtime")) {
            this.setFieldValByName("createtime", new Date(), metaObject);
        }
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        LOGGER.info("start update fill ....");
        if (metaObject.hasSetter("updatetime")) {
            this.setFieldValByName("updatetime", new Date(), metaObject);
        }
    }

    /**
     * 默认 true
     * 注解实体字段
     *    @TableField(fill = FieldFill.INSERT)
     * @return
     */
    @Override
    public boolean openInsertFill() {
        return true;
    }

    /**
     * 默认 true
     * 注解实体字段
     *    @TableField(fill = FieldFill.UPDATE)
     * @return
     */
    @Override
    public boolean openUpdateFill() {
        return true;
    }
}
