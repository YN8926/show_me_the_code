#!/usr/bin/env python
# -*- coding:utf-8 -*-

fname = raw_input('Enter filename:')
print fname

try:
    fobj = open(fname, 'r')
except IOError, e:
    print '*** open file error:', e
else:
    for eachline in fobj:
        print eachline,
    fobj.close()
