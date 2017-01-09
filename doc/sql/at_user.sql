CREATE TABLE `at_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code` varchar(50) NOT NULL COMMENT '用户名，自定义，邮箱，电话号码',
  `pwd` varchar(50) NOT NULL COMMENT '用户密码',
  `name` varchar(50) DEFAULT NULL COMMENT '真实姓名',
  `phone` varchar(20) NOT NULL COMMENT '手机号码',
  `sex` tinyint(1) DEFAULT NULL COMMENT '性别',
  `mail` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  `state` tinyint(1) NOT NULL COMMENT '记录状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='用户表';

