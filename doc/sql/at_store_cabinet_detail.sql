CREATE TABLE `at_store_cabinet_detail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `event_title` varchar(100) DEFAULT NULL COMMENT '事件title',
  `event_level` int(2) DEFAULT NULL COMMENT '事件等级',
  `event_state` int(2) DEFAULT NULL COMMENT '事件状态',
  `event_describe` varchar(255) DEFAULT NULL COMMENT '事件描述',
  `event_lable` varchar(50) DEFAULT NULL COMMENT '事件标签',
  `remind_time` datetime DEFAULT NULL COMMENT '提醒事件',
  `expire_time` datetime DEFAULT NULL COMMENT '过期时间',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='储存柜详细信息表';

