from unittest import TestCase
from back_to_sender_logistics_service import get_allowance

class TestBackToSenderLogistics(TestCase):
	def test_get_allowance_function_return_the_right_amount_for_pay_less_than_fifity_percent(self):
		actual = get_allowance(25)
		expected = 9000
		self.assertEqual(actual,expected)
		actual = get_allowance(49)
		expected = 12840
		self.assertEqual(actual,expected)

	def test_get_allowance_function_return_the_right_amount_for_pay_between_fifity_to_fifty_nine_percent(self):
		actual = get_allowance(54)
		expected = 15800
		self.assertEqual(actual,expected)
		actual = get_allowance(59)
		expected = 16800
		self.assertEqual(actual,expected)

	def test_get_allowance_function_return_the_right_amount_for_pay_between_sixty_to_sixty_nine_percent(self):
		actual = get_allowance(60)
		expected = 20000
		self.assertEqual(actual,expected)
		actual = get_allowance(69)
		expected = 22250
		self.assertEqual(actual,expected)

	def test_get_allowance_function_return_the_right_amount_for_pay_between_seventy_to_hundred_percent(self):
		actual = get_allowance(70)
		expected = 40000
		self.assertEqual(actual,expected)
		actual = get_allowance(100)
		expected = 55000
		self.assertEqual(actual,expected)

	def test_get_allowance_function_does_not_accept_amount_less_than_one(self):
		self.assertRaises(ValueError, get_allowance, -1,)

	def test_get_allowance_function_does_not_accept_amount_greater_than_hundred(self):
		self.assertRaises(ValueError, get_allowance, 101)

	def test_get_allowance_function_does_not_accept_string_value(self):
		self.assertRaises(TypeError, get_allowance, "e")

	def test_get_allowance_function_does_not_accept_floaty_value(self):
		self.assertRaises(TypeError, get_allowance, 10.65)


