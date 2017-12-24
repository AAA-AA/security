package com.github.security.dao.mapper.gen;

import com.github.security.dao.entity.SecRoles;
import com.github.security.dao.entity.SecRolesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecRolesMapper {
    long countByExample(SecRolesExample example);

    int deleteByExample(SecRolesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SecRoles record);

    int insertSelective(SecRoles record);

    List<SecRoles> selectByExample(SecRolesExample example);

    SecRoles selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SecRoles record, @Param("example") SecRolesExample example);

    int updateByExample(@Param("record") SecRoles record, @Param("example") SecRolesExample example);

    int updateByPrimaryKeySelective(SecRoles record);

    int updateByPrimaryKey(SecRoles record);

    /** need allowMultiQueries=true support */
    int insertList(List<SecRoles> records);

    /** need allowMultiQueries=true support */
    int insertListSelective(List<SecRoles> records);
}