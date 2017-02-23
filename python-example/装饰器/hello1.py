#!/usr/bin/env python
# -*- coding:utf-8 -*-

def foo():
	print "Hello world."

foo()

'''
使用装饰函数进行修饰,装饰函数的入参是被装饰函数对象
'''

def deco(foo):
	print "before"
	foo()
	print "after"
	return foo

foo = deco(foo)
foo()