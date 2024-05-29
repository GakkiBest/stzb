package com.yutong.stzb.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName card
 */
@Data
public class Card implements Serializable {
    /**
     * 自增ID
     */
    private Integer id;

    /**
     * 武将名称
     */
    private String cardName;

    /**
     * 武将技能描述
     */
    private String cardSkill;

    /**
     * 武将技能类型 1-指挥 2-被动 3-主动 4-追击
     */
    private Integer cardSkillType;

    /**
     * 武将技能有效距离
     */
    private Integer cardSkillEffectiveDistance;

    /**
     * 武将技能目标类型 1-自己 2-敌军单体 3-敌军群体 4-敌军全体 5-我军群体 6-我军全体
     */
    private Integer cardSkillTargetType;

    /**
     * 武将技能发动率
     */
    private Integer cardSkillStartingRate;

    /**
     * 武将初始攻击力
     */
    private Integer cardAtk;

    /**
     * 武将攻击力成长值
     */
    private Integer cardAtkGrowValue;

    /**
     * 武将初始防御值
     */
    private Integer cardDef;

    /**
     * 武将防御成长值
     */
    private Integer cardDefGrowValue;

    /**
     * 武将初始谋略值
     */
    private Integer cardStrategyValue;

    /**
     * 武将谋略成长值
     */
    private Integer cardStrategyGrowValue;

    /**
     * 武将初始速度值
     */
    private Integer cardSpeedValue;

    /**
     * 武将速度成长值
     */
    private Integer cardSpeedGrowValue;

    /**
     * 武将攻击距离
     */
    private Integer cardAttackRange;

    /**
     * 武将cost值
     */
    private Integer cardCost;

    /**
     * 武将兵种 1-骑兵 2-步兵 3-弓兵 4-蛮兵 5-象兵 6-藤甲兵
     */
    private Integer cardBots;

    private static final long serialVersionUID = 1L;
}