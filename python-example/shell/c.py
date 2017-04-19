#!/usr/bin/env python
#-*- coding: utf-8 -*-
import subprocess

p = subprocess.Popen(['ls', '-al'], stdout=subprocess.PIPE, shell=True)
output, err = p.communicate()

print type(output)
