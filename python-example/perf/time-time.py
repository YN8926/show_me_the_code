#!/usr/bin/env python
#-*- coding:utf-8 -*-

import time

def time_me(fn):
	def wrapper(*args, **kwargs):
		start = time.clock()
		fn(*args, **kwargs)
		print "%s cost %s second"%(fn.__name__, time.clock() - start)
	return wrapper

@time_me
def test(x, y):
	time.sleep(5)

test(1,2)