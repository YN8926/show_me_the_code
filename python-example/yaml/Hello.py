#/usr/bin/evn python
# -*- coding:utf-8 -*-

import yaml

file = open('hello.yaml', 'r')
y = yaml.load(file)
print type(y)
print y['name']
print type(y['address'])
print y['address'][0]['name']