-- auto-generated definition
create table card
(
    id                            int unsigned auto_increment comment '自增ID'
        primary key,
    card_name                     varchar(10) not null comment '武将名称',
    card_skill                    text        not null comment '武将技能描述',
    card_skill_type               int         not null comment '武将技能类型 1-指挥 2-被动 3-主动 4-追击',
    card_skill_effective_distance int         not null comment '武将技能有效距离',
    card_skill_target_type        int         not null comment '武将技能目标类型 1-自己 2-敌军单体 3-敌军群体 4-敌军全体 5-我军群体 6-我军全体',
    card_skill_starting_rate      decimal     not null comment '武将技能发动率',
    card_atk                      int         not null comment '武将初始攻击力',
    card_atk_grow_value           decimal     not null comment '武将攻击力成长值',
    card_def                      int         not null comment '武将初始防御值',
    card_def_grow_value           decimal     not null comment '武将防御成长值',
    card_strategy_value           int         not null comment '武将初始谋略值',
    card_strategy_grow_value      decimal     not null comment '武将谋略成长值',
    card_speed_value              int         not null comment '武将初始速度值',
    card_speed_grow_value         decimal     not null comment '武将速度成长值',
    card_attack_range             int         not null comment '武将攻击距离',
    card_cost                     int         not null comment '武将cost值',
    card_bots                     int         not null comment '武将兵种 1-骑兵 2-步兵 3-弓兵 4-蛮兵 5-象兵 6-藤甲兵'
);