package com.github.security.dao.mapper.gen;

import com.github.security.dao.entity.SecUsers;
import com.github.security.dao.entity.SecUsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecUsersMapper {
    long countByExample(SecUsersExample example);

    int deleteByExample(SecUsersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SecUsers record);

    int insertSelective(SecUsers record);

    List<SecUsers> selectByExample(SecUsersExample example);

    SecUsers selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SecUsers record, @Param("example") SecUsersExample example);

    int updateByExample(@Param("record") SecUsers record, @Param("example") SecUsersExample example);

    int updateByPrimaryKeySelective(SecUsers record);

    int updateByPrimaryKey(SecUsers record);

    /** need allowMultiQueries=true support */
    int insertList(List<SecUsers> records);

    /** need allowMultiQueries=true support */
    int insertListSelective(List<SecUsers> records);
}