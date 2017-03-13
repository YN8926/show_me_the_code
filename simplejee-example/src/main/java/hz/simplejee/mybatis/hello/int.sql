`T_USER` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `is_deleted` char(1) NOT NULL DEFAULT 'N' COMMENT '删除标记',
  `gmt_create` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '修改时间',
  `creator` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '创建人',
  `modifier` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '修改人',
  `name` varchar(30) DEFAULT NULL COMMENT '用户名',
  `email` varchar(20) DEFAULT NULL COMMENT '用户邮箱地址',
  `shop_id` int(11) DEFAULT NULL COMMENT '店铺id',
  PRIMARY KEY (`id`)
);