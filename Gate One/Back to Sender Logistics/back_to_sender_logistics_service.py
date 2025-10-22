def get_allowance(successful_delivery):
	if type(successful_delivery) != int :
		raise TypeError ("Invalid Input")

	if successful_delivery < 1 or successful_delivery > 100 :
		raise ValueError ("Invalid Input")
	if successful_delivery > 0 and successful_delivery < 50:
		pay = successful_delivery * 160 + 5000
		return pay
	if successful_delivery < 60:
		pay = successful_delivery * 200 + 5000
		return pay
	if successful_delivery < 70:
		pay = successful_delivery * 250 + 5000
		return pay
	if successful_delivery < 101:
		pay = successful_delivery * 500 + 5000
		return pay
	

