import unittest
from task_five import remove_duplicates  

class TestRemoveDuplicates(unittest.TestCase):

    def test_normal_case(self):
        array = [1, 2, 2, 3, 4, 4, 4, 5]
        expected = [1, 2, 3, 4, 5]
        self.assertEqual(remove_duplicates(array), expected)

    def test_no_duplicates(self):
        array = [1, 2, 3, 4, 5]
        expected = [1, 2, 3, 4, 5]
        self.assertEqual(remove_duplicates(array), expected)

    def test_all_duplicates(self):
        array = [2, 2, 2, 2]
        expected = [2]
        self.assertEqual(remove_duplicates(array), expected)

    def test_empty_array(self):
        array = []
        expected = []
        self.assertEqual(remove_duplicates(array), expected)

    def test_single_element(self):
        array = [42]
        expected = [42]
        self.assertEqual(remove_duplicates(array), expected)

