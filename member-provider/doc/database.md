#序号表

    CREATE TABLE `t_so_sequence` (
      `type` varchar(50) NOT NULL,
      `current_value` int(32) DEFAULT NULL,
      `increment` int(5) DEFAULT NULL,
      PRIMARY KEY (`TYPE`)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='序号类型表';

#函数

    DROP FUNCTION IF EXISTS getNextSeq;
    CREATE FUNCTION getNextSeq (vtype VARCHAR(50))
    RETURNS int
    BEGIN
      DECLARE _CUR INT(32);
    	SET _CUR=0;
    	select current_value into _CUR from t_so_sequence where type=vtype;
    	if _CUR=0 then
    		insert into t_so_sequence (type,current_value,increment) VALUES (vtype, '1', '1');
    		SET _CUR=1;
    	end if;
    	UPDATE t_so_sequence
    		 SET current_value = current_value + increment
    	 WHERE type = vtype ;
    	RETURN _CUR;
    END;