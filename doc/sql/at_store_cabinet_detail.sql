CREATE TABLE `at_store_cabinet_detail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `event_title` varchar(100) DEFAULT NULL COMMENT '�¼�title',
  `event_level` int(2) DEFAULT NULL COMMENT '�¼��ȼ�',
  `event_state` int(2) DEFAULT NULL COMMENT '�¼�״̬',
  `event_describe` varchar(255) DEFAULT NULL COMMENT '�¼�����',
  `event_lable` varchar(50) DEFAULT NULL COMMENT '�¼���ǩ',
  `remind_time` datetime DEFAULT NULL COMMENT '�����¼�',
  `expire_time` datetime DEFAULT NULL COMMENT '����ʱ��',
  `create_time` datetime DEFAULT NULL COMMENT '����ʱ��',
  `modify_time` datetime DEFAULT NULL COMMENT '�޸�ʱ��',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='�������ϸ��Ϣ��';

