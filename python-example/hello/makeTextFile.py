#!/usr/bin/env python
#-*- coding: utf-8 -*-

'makeTextFile.py -- create text file'

import os

ls = os.linesep

while True:
    fname = raw_input('Enter File Name:')
    if os.path.exists(fname):
        print "ERROR: '%s' already exists" % fname
    else:
        break
if not fname.endswith('.temp'):
    fname += '.temp'

all = []
print "%sEnter lines ('.' by itself to quit).%s"%(ls,ls)

while True:
    entry = raw_input('>')
    if entry == '.':
        break
    else:
        all.append(entry)
fobj = open(fname, 'w')
fobj.writelines(['%s%s' % (x, ls) for x in all])
fobj.close()
print 'DONE(%s)'%fname
