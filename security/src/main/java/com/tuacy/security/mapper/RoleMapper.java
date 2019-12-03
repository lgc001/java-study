package com.tuacy.security.mapper;

import com.tuacy.security.entity.model.RoleDetailBo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @name: RoleMapper
 * @author: tuacy.
 * @date: 2019/12/2.
 * @version: 1.0
 * @Description:
 */
public interface RoleMapper {

    List<RoleDetailBo> getRolesByUserId(@Param("userId") Long userId);

}
