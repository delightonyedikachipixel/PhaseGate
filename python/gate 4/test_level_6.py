from unittest import TestCase
from level_6 import *

class TestClass(TestCase):

    def test_split_into_odd_and_even_1(self):
        self.assertEqual(split_into_odd_and_even([45, 60, 3, 10, 9, 22]), [[45, 3, 9], [60, 10, 22]])

    def test_split_into_odd_and_even_2(self):
        self.assertEqual(split_into_odd_and_even([2, 4, 6]), [[], [2, 4, 6]])

    def test_split_into_odd_and_even_3(self):
        self.assertEqual(split_into_odd_and_even([1, 3, 5]), [[1, 3, 5], []])

    def test_split_into_odd_and_even_4(self):
        self.assertEqual(split_into_odd_and_even([]), [[], []])

    def test_is_number_palindrome_1(self):
        self.assertTrue(is_number_palindrome(121))

    def test_is_number_palindrome_2(self):
        self.assertFalse(is_number_palindrome(123))

    def test_is_number_palindrome_3(self):
        self.assertTrue(is_number_palindrome(7))

    def test_is_number_palindrome_4(self):
        self.assertTrue(is_number_palindrome(0))

    def test_get_perfect_square_numbers_1(self):
        self.assertEqual(get_perfect_square_numbers([4, 7, 9, 10, 16, 18]), [4, 9, 16])

    def test_get_perfect_square_numbers_2(self):
        self.assertEqual(get_perfect_square_numbers([7, 10, 18]), [])

    def test_get_perfect_square_numbers_3(self):
        self.assertEqual(get_perfect_square_numbers([1, 4, 9, 16]), [1, 4, 9, 16])

    def test_get_perfect_square_numbers_4(self):
        self.assertEqual(get_perfect_square_numbers([-4, 9, -16, 25]), [9, 25])

    def test_get_perfect_square_numbers_5(self):
        self.assertEqual(get_perfect_square_numbers([]), [])

    def test_replace_non_perfect_squares_1(self):
        self.assertEqual(replace_non_perfect_squares([4, 7, 9, 10, 49, 6]), [4, -1, 9, -1, 49, -1])

    def test_replace_non_perfect_squares_2(self):
        self.assertEqual(replace_non_perfect_squares([1, 4, 9, 25]), [1, 4, 9, 25])

    def test_replace_non_perfect_squares_3(self):
        self.assertEqual(replace_non_perfect_squares([2, 3, 5, 6]), [-1, -1, -1, -1])

    def test_replace_non_perfect_squares_4(self):
        self.assertEqual(replace_non_perfect_squares([-4, 9, -1, 16]), [-1, 9, -1, 16])

    def test_replace_non_perfect_squares_5(self):
        self.assertEqual(replace_non_perfect_squares([]), [])

