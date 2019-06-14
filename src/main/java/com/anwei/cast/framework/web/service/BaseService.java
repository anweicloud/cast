package com.anwei.cast.framework.web.service;

import java.io.Serializable;

/**
 * @author Anwei
 * @description: TODO
 * @date 2019/6/1317:18
 */
public interface BaseService {

    /**
     * 统计查询
     * @param clasz
     * @return
     */
    public <E> int count(Class<E> clasz);

    public <E> int count(Class<E> clasz, String sql, Object[] params);


    /**
     * 根据ID查询实体
     * @param clasz
     * @param id
     * @param <E>
     * @return
     */
    public <E> E findById(Class<E> clasz, Serializable id);


    /**
     * 查找第一个对象
     *
     * @param clasz
     * @return E / null
     */
    public <E> E first(Class<E> clasz);

    /**
     * 查找第一个对象
     *
     * @param clasz
     * @param sql
     *            条件 占位符?
     * @param params
     * @return E / null
     */
    public <E> E first(Class<E> clasz, String sql, Object[] params);

    /**
     * 查找第一个对象
     * @param clasz
     * @param sql
     * @param params
     * @param order
     * @param <E>
     * @return
     */
    public <E> E first(Class<E> clasz, String sql, Object[] params, String order);

}
