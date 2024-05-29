package com.yutong.stzb.mapper;

import com.yutong.stzb.domain.Card;
import org.apache.ibatis.annotations.Mapper;

/**
* @author yuton
* @description 针对表【card】的数据库操作Mapper
* @createDate 2024-05-29 22:39:58
* @Entity generator.domain.Card
*/

@Mapper
public interface CardMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Card record);

    int insertSelective(Card record);

    Card selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Card record);

    int updateByPrimaryKey(Card record);

}
