from unittest import TestCase
from task_one import *

class Testtask_one(TestCase):

    def test_task_one1(self):
        self.assertEqual( count_evens([10, 11, 12]), 2)

    def test_task_one2(self):
        self.assertEqual( count_evens([10, 11, 12, 13, 14]), 3)

    def test_task_one3(self):
        self.assertEqual( count_evens([]), 0)
