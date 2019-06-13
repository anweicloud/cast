package com.anwei.cast.modules.common.service.impl;

import com.anwei.cast.modules.common.mapper.ModelMapper;
import com.anwei.cast.modules.common.service.BaseService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * @author Anwei
 * @TODO: TODO
 * @date 2019/6/13 17:28
 */
@Service
public class BaseServiceImpl extends ServiceImpl<ModelMapper, Model> implements BaseService {

    @Override
    public <E> int count(Class<E> clasz) {
        return 0;
    }

    @Override
    public <E> int count(Class<E> clasz, String sql, Object[] params) {
        return 0;
    }

    @Override
    public <E> E findById(Class<E> clasz, Serializable id) {
        try {
            E obj = clasz.newInstance();
            if (obj instanceof Model) {
                Model m = (Model) obj;
                return (E) m.selectById(id);
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public <E> E first(Class<E> clasz) {
        return null;
    }

    @Override
    public <E> E first(Class<E> clasz, String sql, Object[] params) {
        return null;
    }

    @Override
    public <E> E first(Class<E> clasz, String sql, Object[] params, String order) {

        try {
            E obj = clasz.newInstance();
            if (obj instanceof Model) {
                Model m = (Model) obj;
                return (E) m.selectOne();
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }



    public void sqlWhere() {
        QueryWrapper qw = new QueryWrapper();


    }

}
