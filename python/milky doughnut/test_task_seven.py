import unittest
from task_seven import intersect_of  

class TestIntersectOf(unittest.TestCase):

    def test_normal_case(self):
        a = [1, 2, 3, 4]
        b = [3, 4, 5, 6]
        expected = [3, 4]
        self.assertEqual(intersect_of(a, b), expected)

    def test_no_intersection(self):
        a = [1, 2]
        b = [3, 4]
        expected = []
        self.assertEqual(intersect_of(a, b), expected)

    def test_duplicates_in_input(self):
        a = [1, 2, 2, 3]
        b = [2, 2, 3, 3]
        expected = [2, 3]
        self.assertEqual(intersect_of(a, b), expected)

    def test_both_empty_arrays(self):
        a = []
        b = []
        expected = []
        self.assertEqual(intersect_of(a, b), expected)

    def test_one_empty_array(self):
        a = [1, 2, 3]
        b = []
        expected = []
        self.assertEqual(intersect_of(a, b), expected)


