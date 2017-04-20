#!/usr/bin/env python
#-*- coding: utf-8 -*-
 
# File Name: else.py
# Author: 辉辉大侠
# mail: xredman@yeah.net
# Created Time: 2017-04-19

try:
    f = open("t.txt", 'r')
except IOError:
    print 'can not open file'
else:
    for x in f.readlines():print x
