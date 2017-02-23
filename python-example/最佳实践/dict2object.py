#!/usr/bin/env python
# -*- coding:utf-8 -*-

person = {
	"name":"Mokala",
	"age":42
}

class objectview(object):
	def __init__(self, d):
		self.__dict__ = d

print objectview(person).name

# 扩展dict子类实现
class objectdict(dict):
	def __getattr__(self, name):
		if name in self:
			return self[name]
		else:
			raise AttributeError("No such attribute: " + name)
	def __setattr__(self, name, value):
		self[name] = value
	def __delattr__(self, name):
		if name in self:
			del self[name]
		else:
			raise Exception("No such attribute: " + name)

print objectdict(person).name

class dictobject(object):
	def __init__(self, dict):
		for key in dict:
			setattr(self, key, dict[key])
	def __repr__(self):
		return str([x for x in self.__dict__])
p = dictobject(person)
setattr(p, "address", "浙江省杭州市")
print p
