from unittest import TestCase
from mini_parking_system import *

class TestMiniParkingSystem(TestCase):

    def test_parking_spaces(self):
        self.assertEqual(parking_spaces([20]), 20)

    def test_car_is_parked_successfully(self):
        self.assertEqual(car_is_parked_successfully([20], 1), 1)

    def test_cannot_park_in_an_occupied_spot(self):
        self.assertEqual(cannot_park_in_an_occupied_spot([1], 2), -1)

    def test_car_is_removed(self):
        self.assertEqual(car_is_removed([20], 1), 20)

    def test_cannot_remove_car_from_an_empty_spot(self):
        self.assertEqual(cannot_remove_car_from_an_empty_spot([20], 1), -1)

    def test_check_parking_spaces_availability(self):
        self.assertEqual(
            check_parking_spaces_availability([20], 5, 2, 3),
            14
        )
