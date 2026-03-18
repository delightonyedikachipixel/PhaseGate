from unittest import TestCase
from largest_list import *

class TestClass(TestCase):

    def test_get_largest_number(self):
        self.assertEqual(get_largest_number([45.2, 90.28,77.1]), 90.28)


    def test_get_largest_number2(self):
        self.assertEqual(get_largest_number([3.52, 9.86,11.77]), 11.77)


    def test_get_largest_number3(self):
        self.assertEqual(get_largest_number([7.7, 10, 22.33, 12]), 22.33)
