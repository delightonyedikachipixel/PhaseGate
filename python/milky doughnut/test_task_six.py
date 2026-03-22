import unittest
from task_six import flatten  

class TestFlatten(unittest.TestCase):

    def test_regular_matrix(self):
        matrix = [
            [1, 2, 3],
            [4, 5, 6]
        ]
        expected = [1, 2, 3, 4, 5, 6]
        self.assertEqual(flatten(matrix), expected)

    def test_empty_matrix(self):
        matrix = []
        expected = []
        self.assertEqual(flatten(matrix), expected)

    def test_matrix_with_empty_rows(self):
        matrix = [
            [],
            [1, 2],
            []
        ]
        expected = [1, 2]
        self.assertEqual(flatten(matrix), expected)

    def test_single_element_matrix(self):
        matrix = [[42]]
        expected = [42]
        self.assertEqual(flatten(matrix), expected)


