from unittest import TestCase
from Contact_app import *


class TestContactApp(TestCase):

    def test_add_contact(self):
        contact_list = []
        result = add_contact("Ebuka", "nnayi-python", "08012345678", contact_list)
        self.assertEqual(result, "Contact added successfully")
        self.assertEqual(len(contact_list), 1)
        self.assertEqual(contact_list[0]["first_name"], "Ebuka")

    def test_check_length_of_phone_number_valid(self):
        self.assertTrue(check_length_of_phone_number("08012345678"))

    def test_check_length_of_phone_number_invalid(self):
        self.assertFalse(check_length_of_phone_number("12345"))

    def test_delete_contact_with_phone_number(self):
        contact_list = [{"first_name": "Ebuka", "last_name": "nnayi-python", "phone_number": "08012345678"}]
        result = delete_contact_with_phone_number("08012345678", contact_list)
        self.assertEqual(result, "Contact removed successfully")
        self.assertEqual(len(contact_list), 0)

    def test_delete_contact_not_found(self):
        contact_list = []
        result = delete_contact_with_phone_number("08012345678", contact_list)
        self.assertEqual(result, "Contact not found")

    def test_search_for_contact_using_phone_number_found(self):
        contact_list = [{"first_name": "Jane", "last_name": "nnayi-python", "phone_number": "09012345678"}]
        result = search_for_contact_using_phone_number("09012345678", contact_list)
        self.assertEqual(result["first_name"], "Jane")

    def test_search_for_contact_using_phone_number_not_found(self):
        contact_list = []
        result = search_for_contact_using_phone_number("09012345678", contact_list)
        self.assertEqual(result, "Contact not found")

    def test_search_for_contact_using_first_name(self):
        contact_list = [{"first_name": "Ebuka", "last_name": "nnayi-python", "phone_number": "08012345678"}]
        result = search_for_contact_using_first_name("Ebuka", contact_list)
        self.assertEqual(len(result), 1)
        self.assertEqual(result[0]["last_name"], "nnayi-python")

    def test_search_for_contact_using_last_name(self):
        contact_list = [{"first_name": "Ebuka", "last_name": "Smith", "phone_number": "08012345678"}]
        result = search_for_contact_using_last_name("Smith", contact_list)
        self.assertEqual(len(result), 1)
        self.assertEqual(result[0]["first_name"], "Ebuka")

    def test_edit_contact(self):
        contact_list = [{"first_name": "Ebuka", "last_name": "nnayi-python", "phone_number": "08012345678"}]
        result = edit_contact("Senior", "dev", "08012345678", contact_list)
        self.assertEqual(result, "Contact edited successfully")
        self.assertEqual(contact_list[0]["first_name"], "Senior")
        self.assertEqual(contact_list[0]["last_name"], "dev")

    def test_edit_contact_not_found(self):
        contact_list = []
        result = edit_contact("Jane", "Smith", "08012345678", contact_list)
        self.assertEqual(result, "Contact not found")
