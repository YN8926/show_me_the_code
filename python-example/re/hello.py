#!/usr/bin/env python
#-*- coding: utf-8 -*-
import re

p = re.compile(r'hello')

m = p.match('hello world')

if m:
    print m.group()

