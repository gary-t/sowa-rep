#t_so_account

	CREATE TABLE `t_so_account` (
	  `account_id` varchar(45) NOT NULL COMMENT '编号',
	  `account` varchar(250) NOT NULL COMMENT '账号',
	  `account_type` varchar(45) DEFAULT NULL COMMENT '账号类型:sys-系统默认,mobile-手机号,nick-昵称,email-邮箱,uid-第三方账号',
	  `user_id` varchar(45) DEFAULT NULL COMMENT '用户编号',
	  `is_personal` varchar(1) DEFAULT NULL COMMENT '所属账号类型：1-个人 账号，0-企业账号',
	  `remark` varchar(250) DEFAULT NULL COMMENT '备注',
	  `extend1` varchar(45) DEFAULT NULL COMMENT '扩展字段1',
	  `extend2` varchar(45) DEFAULT NULL COMMENT '扩展字段2',
	  `extend3` varchar(45) DEFAULT NULL COMMENT '扩展字段3',
	  `extend4` varchar(45) DEFAULT NULL COMMENT '扩展字段4',
	  `extend5` varchar(45) DEFAULT NULL COMMENT '扩展字段5',
	  `extend6` varchar(45) DEFAULT NULL COMMENT '扩展字段6',
	  `extend7` varchar(45) DEFAULT NULL COMMENT '扩展字段7',
	  `extend8` varchar(45) DEFAULT NULL COMMENT '扩展字段8',
	  `extend9` varchar(45) DEFAULT NULL COMMENT '扩展字段9',
	  `extend10` varchar(45) DEFAULT NULL COMMENT '扩展字段10',
	  `valid` varchar(1) DEFAULT '1' COMMENT '有效状态标识:1-有效，0-无效',
	  `create_user` varchar(45) DEFAULT NULL COMMENT '创建人',
	  `create_date` datetime NOT NULL COMMENT '创建时间',
	  `update_user` varchar(45) DEFAULT NULL COMMENT '修改人',
	  `update_date` datetime DEFAULT NULL COMMENT '修改时间',
	  PRIMARY KEY (`account_id`),
	  UNIQUE KEY `unique-account` (`account`),
	  KEY `index-account` (`account`)
	) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='账号表';
		

#t_so_user

	CREATE TABLE `t_so_user` (
	  `user_id` varchar(45) NOT NULL COMMENT '会员编号',
	  `user_code` varchar(45) NOT NULL COMMENT '用户代码',
	  `user_name` varchar(45) DEFAULT NULL COMMENT '用户姓名',
	  `user_password` varchar(250) DEFAULT NULL COMMENT '用户密码',
	  `user_status` varchar(45) DEFAULT NULL COMMENT '用户状态：00-注册用户,05-待审核,10-审核通过成为会员,15-审核驳回',
	  `cert_id` varchar(45) DEFAULT NULL COMMENT '证件表编号',
	  `mobile` varchar(45) DEFAULT NULL COMMENT '手机号',
	  `nickname` varchar(45) DEFAULT NULL COMMENT '昵称',
	  `email` varchar(45) DEFAULT NULL COMMENT '邮箱',
	  `province` varchar(45) DEFAULT NULL COMMENT '住址所在省',
	  `city` varchar(45) DEFAULT NULL COMMENT '住址所在市',
	  `area` varchar(45) DEFAULT NULL COMMENT '住址所在地区',
	  `address` varchar(250) DEFAULT NULL COMMENT '详细地址',
	  `telephone` varchar(45) DEFAULT NULL COMMENT '固定电话',
	  `img` varchar(45) DEFAULT NULL COMMENT '头像地址',
	  `company` varchar(250) DEFAULT NULL COMMENT '所在公司',
	  `department` varchar(45) DEFAULT NULL COMMENT '所在部门',
	  `profession` varchar(45) DEFAULT NULL COMMENT '职业',
	  `position` varchar(45) DEFAULT NULL COMMENT '职位',
	  `industry` varchar(45) DEFAULT NULL COMMENT '所在行业',
	  `worklife` int(11) DEFAULT NULL COMMENT '工作年限',
	  `personalnote` varchar(45) DEFAULT NULL COMMENT '个人说明',
	  `source` varchar(45) DEFAULT NULL COMMENT '注册来源：web-网页,app-手机',
	  `remark` varchar(250) DEFAULT NULL COMMENT '备注',
	  `extend1` varchar(45) DEFAULT NULL COMMENT '扩展字段1',
	  `extend2` varchar(45) DEFAULT NULL COMMENT '扩展字段2',
	  `extend3` varchar(45) DEFAULT NULL COMMENT '扩展字段3',
	  `extend4` varchar(45) DEFAULT NULL COMMENT '扩展字段4',
	  `extend5` varchar(45) DEFAULT NULL COMMENT '扩展字段5',
	  `extend6` varchar(45) DEFAULT NULL COMMENT '扩展字段6',
	  `extend7` varchar(45) DEFAULT NULL COMMENT '扩展字段7',
	  `extend8` varchar(45) DEFAULT NULL COMMENT '扩展字段8',
	  `extend9` varchar(45) DEFAULT NULL COMMENT '扩展字段9',
	  `extend10` varchar(45) DEFAULT NULL COMMENT '扩展字段10',
	  `valid` varchar(1) DEFAULT '1' COMMENT '有效标识：1-有效，0-无效',
	  `create_user` varchar(45) DEFAULT NULL COMMENT '创建者',
	  `create_date` datetime DEFAULT NULL COMMENT '创建日期',
	  `update_user` varchar(45) DEFAULT NULL COMMENT '修改者',
	  `update_date` datetime DEFAULT NULL COMMENT '修改日期',
	  `audit_user` varchar(45) DEFAULT NULL,
	  `audit_date` datetime DEFAULT NULL COMMENT '审核日期',
	  PRIMARY KEY (`user_id`),
	  UNIQUE KEY `user_id_UNIQUE` (`user_id`)
	) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='注册用户表';



#序号表

    CREATE TABLE `t_so_sequence` (
      `type` varchar(50) NOT NULL,
      `current_value` int(32) DEFAULT NULL,
      `increment` int(5) DEFAULT NULL,
      PRIMARY KEY (`TYPE`)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='序号类型表';

#函数

    DELIMITER $$

	CREATE
	    /*[DEFINER = { user | CURRENT_USER }]*/
	    FUNCTION `db_so_site`.`getNextSeq`(vtype VARCHAR(50))
	    RETURNS INT
	    /*LANGUAGE SQL
	    | [NOT] DETERMINISTIC
	    | { CONTAINS SQL | NO SQL | READS SQL DATA | MODIFIES SQL DATA }
	    | SQL SECURITY { DEFINER | INVOKER }
	    | COMMENT 'string'*/
	    BEGIN
		DECLARE _CUR INT;
		SET _CUR=0;
	    
			SELECT current_value INTO _CUR FROM t_so_sequence WHERE TYPE=vtype;
		
		IF _CUR=0 THEN
			INSERT INTO t_so_sequence (TYPE,current_value,increment) VALUES (vtype, '1', '1');
			SET _CUR=1;
		END IF;
		UPDATE t_so_sequence
			 SET current_value = current_value + increment
		 WHERE TYPE = vtype ;
		RETURN _CUR;
	    END$$
	
	DELIMITER ;