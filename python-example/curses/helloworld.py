#!/usr/bin/env python
# -*- coding:utf-8 -*-
import curses

'''
在任何代码执行之前需要初始化curses,初始化操作就是调用iniscr()函数，该函数根据不同设备
返回一个window对象代表整个屏幕,这个window对象通常叫做stdscr.
'''
stdscr = curses.initscr()

'''
使用curses通常需要关闭屏幕回显,目的是读取字符仅在适当的环境下输入,这就需要调用noecho()方法.
'''
curses.noecho()

'''
应用程序一般是立即响应的，即不需要按回车就立即回应，这种模式叫cbreak模式，相反的常用模式是缓冲输入模式；
'''
curses.cbreak()

'''
终端经常返回特殊键作为一个多字节的转义序列,比如光标键，或者导航键.curses可以针对这些序列做一次处理,
比如curses.KEY_LEFT返回一个特殊的值.要完成这些工作，必须开启键盘模式
'''
stdscr.keypad(1)

#关闭字符终端功能（只有回车时才发生终端）
curses.nocbreak()
stdscr.keypad(0)
#打开输入回显功能
curses.echo()

#调用endwin()恢复默认设置
curses.endwin()

