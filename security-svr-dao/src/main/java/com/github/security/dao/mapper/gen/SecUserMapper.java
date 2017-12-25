package com.github.security.dao.mapper.gen;

import com.github.security.dao.entity.SecUser;
import com.github.security.dao.entity.SecUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecUserMapper {
    long countByExample(SecUserExample example);

    int deleteByExample(SecUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SecUser record);

    int insertSelective(SecUser record);

    List<SecUser> selectByExample(SecUserExample example);

    SecUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SecUser record, @Param("example") SecUserExample example);

    int updateByExample(@Param("record") SecUser record, @Param("example") SecUserExample example);

    int updateByPrimaryKeySelective(SecUser record);

    int updateByPrimaryKey(SecUser record);

    /** need allowMultiQueries=true support */
    int insertList(List<SecUser> records);

    /** need allowMultiQueries=true support */
    int insertListSelective(List<SecUser> records);
}