from back_to_sender_logistics_service import *

def get_menu():
	menu = """
*********************************************************
*	Back To Sender Logistics Service		*
*********************************************************
*Collection Rate	Amount Per Parcel	Base Pay*
*********************************************************
*less than 50%		160			5,000	*
*50 - 59%		200			5,000	*
*60 - 69%		200			5,000	*
*>= 70%			500			5,000	*
*********************************************************
	"""
	return menu



to_continue = ""

while to_continue != "done":
	print(get_menu())
	delivery = int(input("Enter the number of successful delivery made by the rider: "))

	while(delivery < 1  or delivery > 100):
		print("Riders can only have a minimum delivery of 1 and a maximum delivery of 100")
		delivery = int(input("Enter the number of successful delivery made by the rider: "))
		if(delivery > 0 or delivery < 101):
			break

	result = get_allowance(delivery)
	print("The allowance of rider for", delivery, "delivery is: ", result)
	to_continue = input("Enter 'done' if you have calculculated all rider's allowance or enter any other thing to continue: ").lower()


