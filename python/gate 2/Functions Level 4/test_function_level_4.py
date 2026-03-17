
import unittest
from function_level_4 import *

class TestFunctions(unittest.TestCase):

    def test_add(self):
        self.assertEqual(add(5, 3), 8)
        self.assertEqual(add(3, 2), 5)

    def test_is_even(self):    
        self.assertTrue(is_even(4))
        self.assertFalse(is_even(7))

    def test_square(self):
        self.assertEqual(square(6), 36)
        self.assertEqual(square(3), 9)

    def test_celsius_to_fahrenheit(self):
        self.assertEqual(celsius_to_fahrenheit(25), 77.0)
        self.assertEqual(celsius_to_fahrenheit(0), 32.0)

    def test_is_prime(self):
        self.assertTrue(is_prime(13))
        self.assertFalse(is_prime(15))

    def test_largest(self):
        self.assertEqual(largest(5, 9, 2), 9)
        self.assertEqual(largest(10, 3, 10), 10)

    def test_simple_interest(self):
        self.assertEqual(simple_interest(1000, 5, 2), 100.0)
        self.assertEqual(simple_interest(1500, 4, 3), 180.0)

    def test_area_of_rectangle(self):
        self.assertEqual(area_of_rectangle(5, 7), 35)
        self.assertEqual(area_of_rectangle(10, 3), 30)

    def test_reverse_a_number(self):
        self.assertEqual(reverse_a_number(578), 875)
        self.assertEqual(reverse_a_number(123), 321)


