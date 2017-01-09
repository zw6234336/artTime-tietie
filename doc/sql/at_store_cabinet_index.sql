CREATE TABLE `at_store_cabinet_index` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `event_detail_id` int(11) NOT NULL COMMENT '事件详情表id',
  `event_title` varchar(100) NOT NULL,
  `event_level` int(2) NOT NULL COMMENT '事件等级',
  `event_state` int(2) NOT NULL COMMENT '事件状态',
  `create_time` datetime NOT NULL,
  `modify_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='储物柜';

