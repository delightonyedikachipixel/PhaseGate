import unittest
from Task_four import array_equal  

class TestArrayEqual(unittest.TestCase):

    def test_same_arrays(self):
        a = [1, 2, 3]
        b = [1, 2, 3]
        self.assertTrue(array_equal(a, b))

    def test_different_values(self):
        a = [1, 2, 3]
        b = [1, 2, 4]
        self.assertFalse(array_equal(a, b))

    def test_different_lengths(self):
        a = [1, 2, 3]
        b = [1, 2]
        self.assertFalse(array_equal(a, b))

    def test_empty_arrays(self):
        a = []
        b = []
        self.assertTrue(array_equal(a, b))


