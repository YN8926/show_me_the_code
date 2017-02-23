#!/usr/bin/env python
# -*- coding:utf-8 -*-
import MySQLdb

try:
	conn = MySQLdb.connect(host="127.0.0.1", user="root", passwd="", db="demo", port=3306, use_unicode=0, charset='utf8')
	c = conn.cursor()
	c.execute('show tables')
	r = c.fetchall()
	print r

	c = conn.cursor(MySQLdb.cursors.DictCursor)
	c.execute('show tables')
	r = c.fetchall()
	print r
except Exception as e:
	raise e