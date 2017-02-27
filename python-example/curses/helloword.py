#!/usr/bin/env python
# -*- coding: utf-8 -*-

import curses
import time
import locale

locale.setlocale(locale.LC_ALL, '')
code = locale.getpreferredencoding()

stdscr = curses.initscr()
curses.cbreak()
curses.noecho()
stdscr.keypad(1)

try:
# Run your code here
    y,x = stdscr.getmaxyx()
    welcome = "Welcome to cube-cli.🐳"
    stdscr.addstr(y/2, (x-len(welcome))/2, welcome)
    stdscr.refresh()
    time.sleep(3)
finally:
    curses.nocbreak()
    stdscr.keypad(0)
    curses.echo()
    curses.endwin()



