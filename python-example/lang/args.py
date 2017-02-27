#!/usr/bin/env python
# -*- coding:utf-8 -*-

def foo1(* args):
    print args

foo1(["123"])
foo1("123", "456")
foo1(["123", "456"])