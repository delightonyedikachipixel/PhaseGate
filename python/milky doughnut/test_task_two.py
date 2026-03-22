from unittest import TestCase
from task_two import *

class Testtask_two(TestCase):

    def test_task_two1(self):
        self.assertEqual(linear_search([10, 11, 12],12), 2)

    def test_task_two2(self):
        self.assertEqual( linear_search([10, 11, 12, 13, 14],13), 3)

    def test_task_two3(self):
        self.assertEqual( linear_search([],2), -1)

    
    def test_task_two4(self):
        self.assertEqual( linear_search([10, 11, 12, 13, 14],15), -1)

