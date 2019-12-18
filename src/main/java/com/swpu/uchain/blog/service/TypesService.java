package com.swpu.uchain.blog.service;

import com.swpu.uchain.blog.form.InsertTypesForm;
import com.swpu.uchain.blog.form.UpdateTypesForm;
import com.swpu.uchain.blog.vo.ResultVO;
import org.springframework.stereotype.Service;

/**
 * @author hobo
 * @description
 */
public interface TypesService {

    /***
     * 添加分类
     * @param form 添加分类表单
     * @return com.swpu.uchain.blog.vo.ResultVO
     */
    ResultVO insertTypes(InsertTypesForm form);

    /**
     * 修改分类
     * @param form 更新分类表单
     * @return com.swpu.uchain.blog.vo.ResultVO
     */
    ResultVO updateTypes(UpdateTypesForm form);

    /**
     * 删除分类
     * @param id 分类id
     * @return com.swpu.uchain.blog.vo.ResultVO
     */
    ResultVO deleteTypes(Integer id);

    /***
     * 查询所有分类
     * @return com.swpu.uchain.blog.vo.ResultVO
     */
    ResultVO selectAllTypes();
}
