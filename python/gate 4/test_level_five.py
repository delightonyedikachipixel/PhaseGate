from unittest import TestCase
from level_five import *

class TestClass(TestCase):


    def test_get_sorted_prime_numbers_1(self):
        self.assertEqual(get_sorted_prime_numbers([5, 9, 3, 6, 2]), [2, 3, 5])

    def test_get_sorted_prime_numbers_2(self):
        self.assertEqual(get_sorted_prime_numbers([4, 6, 8, 9]), [])

    def test_get_sorted_prime_numbers_3(self):
        self.assertEqual(get_sorted_prime_numbers([2, 3, 5, 7]), [2, 3, 5, 7])

    def test_get_sorted_prime_numbers_4(self):
        self.assertEqual(get_sorted_prime_numbers([]), [])


    def test_replace_negatives_with_zero_1(self):
        self.assertEqual(replace_negatives_with_zero([5, -9, 3, -6, 2, -11]), [5, 0, 3, 0, 2, 0])

    def test_replace_negatives_with_zero_2(self):
        self.assertEqual(replace_negatives_with_zero([-1, -2, -3]), [0, 0, 0])

    def test_replace_negatives_with_zero_3(self):
        self.assertEqual(replace_negatives_with_zero([1, 2, 3]), [1, 2, 3])

    def test_replace_negatives_with_zero_4(self):
        self.assertEqual(replace_negatives_with_zero([]), [])


    def test_move_zeros_to_end_1(self):
        self.assertEqual(move_zeros_to_end([5, 0, 3, 0, 2, 0]), [5, 3, 2, 0, 0, 0])

    def test_move_zeros_to_end_2(self):
        self.assertEqual(move_zeros_to_end([0, 0, 0]), [0, 0, 0])

    def test_move_zeros_to_end_3(self):
        self.assertEqual(move_zeros_to_end([1, 2, 3]), [1, 2, 3])

    def test_move_zeros_to_end_4(self):
        self.assertEqual(move_zeros_to_end([]), [])



    def test_get_duplicate_elements_1(self):
        self.assertEqual(get_duplicate_elements([45, 60, 3, 0, 67, 2, 45, 3, 22, 0]), [45, 3, 0])

    def test_get_duplicate_elements_2(self):
        self.assertEqual(get_duplicate_elements([1, 2, 3, 4]), [])

    def test_get_duplicate_elements_3(self):
        self.assertEqual(get_duplicate_elements([5, 5, 5]), [5])

    def test_get_duplicate_elements_4(self):
        self.assertEqual(get_duplicate_elements([]), [])
