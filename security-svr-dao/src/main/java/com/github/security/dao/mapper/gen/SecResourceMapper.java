package com.github.security.dao.mapper.gen;

import com.github.security.dao.entity.SecResource;
import com.github.security.dao.entity.SecResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecResourceMapper {
    long countByExample(SecResourceExample example);

    int deleteByExample(SecResourceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SecResource record);

    int insertSelective(SecResource record);

    List<SecResource> selectByExample(SecResourceExample example);

    SecResource selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SecResource record, @Param("example") SecResourceExample example);

    int updateByExample(@Param("record") SecResource record, @Param("example") SecResourceExample example);

    int updateByPrimaryKeySelective(SecResource record);

    int updateByPrimaryKey(SecResource record);

    /** need allowMultiQueries=true support */
    int insertList(List<SecResource> records);

    /** need allowMultiQueries=true support */
    int insertListSelective(List<SecResource> records);
}