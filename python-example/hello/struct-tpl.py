!#/usr/bin/env python

"模块文档"

import sys
import os

debug = True

class FooClass(object):
    "Foo Class"
    pass

def test():
    "test function"
    foo = FooClass()
    if debug:
        print "ran test()"

if __name__ == '__main__':
    test()

