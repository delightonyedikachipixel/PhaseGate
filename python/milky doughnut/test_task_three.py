import unittest
from task_three import squares  

class TestSquares(unittest.TestCase):

    def test_positive_n(self):
        n = 5
        expected = [1, 4, 9, 16, 25]
        self.assertEqual(squares(n), expected)

    def test_n_is_one(self):
        n = 1
        expected = [1]
        self.assertEqual(squares(n), expected)

    def test_n_is_zero(self):
        n = 0
        expected = []
        self.assertEqual(squares(n), expected)

    def test_negative_n(self):
        n = -3
        expected = []
        self.assertEqual(squares(n), expected)


