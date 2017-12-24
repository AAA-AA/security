package com.github.security.dao.mapper.gen;

import com.github.security.dao.entity.SecRoleResource;
import com.github.security.dao.entity.SecRoleResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecRoleResourceMapper {
    long countByExample(SecRoleResourceExample example);

    int deleteByExample(SecRoleResourceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SecRoleResource record);

    int insertSelective(SecRoleResource record);

    List<SecRoleResource> selectByExample(SecRoleResourceExample example);

    SecRoleResource selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SecRoleResource record, @Param("example") SecRoleResourceExample example);

    int updateByExample(@Param("record") SecRoleResource record, @Param("example") SecRoleResourceExample example);

    int updateByPrimaryKeySelective(SecRoleResource record);

    int updateByPrimaryKey(SecRoleResource record);

    /** need allowMultiQueries=true support */
    int insertList(List<SecRoleResource> records);

    /** need allowMultiQueries=true support */
    int insertListSelective(List<SecRoleResource> records);
}