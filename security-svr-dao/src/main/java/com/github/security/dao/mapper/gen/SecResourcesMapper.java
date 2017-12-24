package com.github.security.dao.mapper.gen;

import com.github.security.dao.entity.SecResources;
import com.github.security.dao.entity.SecResourcesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecResourcesMapper {
    long countByExample(SecResourcesExample example);

    int deleteByExample(SecResourcesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SecResources record);

    int insertSelective(SecResources record);

    List<SecResources> selectByExample(SecResourcesExample example);

    SecResources selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SecResources record, @Param("example") SecResourcesExample example);

    int updateByExample(@Param("record") SecResources record, @Param("example") SecResourcesExample example);

    int updateByPrimaryKeySelective(SecResources record);

    int updateByPrimaryKey(SecResources record);

    /** need allowMultiQueries=true support */
    int insertList(List<SecResources> records);

    /** need allowMultiQueries=true support */
    int insertListSelective(List<SecResources> records);
}