package com.github.security.dao.mapper.gen;

import com.github.security.dao.entity.SecRole;
import com.github.security.dao.entity.SecRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecRoleMapper {
    long countByExample(SecRoleExample example);

    int deleteByExample(SecRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SecRole record);

    int insertSelective(SecRole record);

    List<SecRole> selectByExample(SecRoleExample example);

    SecRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SecRole record, @Param("example") SecRoleExample example);

    int updateByExample(@Param("record") SecRole record, @Param("example") SecRoleExample example);

    int updateByPrimaryKeySelective(SecRole record);

    int updateByPrimaryKey(SecRole record);

    /** need allowMultiQueries=true support */
    int insertList(List<SecRole> records);

    /** need allowMultiQueries=true support */
    int insertListSelective(List<SecRole> records);
}