const prompt = require('prompt-sync')();


function getAllowance(successfulDelivery){
	let pay = 0;
	if (successfulDelivery > 0 && successfulDelivery < 50)
		pay = successfulDelivery * 160 + 5000;
		
	else if (successfulDelivery < 60)
		pay = successfulDelivery  * 200 + 5000;
		
	else if (successfulDelivery < 70)
		pay = successfulDelivery  * 250 + 5000;
		
	else if (successfulDelivery < 101)
		pay = successfulDelivery  * 500 + 5000;
		
	return pay;


}  


function menu(){
	
		const menu = `
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
`;
	return menu;

}


let toContinue = "";

while (toContinue !== "done"){
	console.log(menu());	

	let delivery = prompt("Enter the number of successful delivery made by the rider: ");

	while(delivery < 1  || delivery > 100){
		console.log("Riders can only have a minimum delivery of 1 and a maximum deliveries of 100");
		delivery = prompt("Enter the number of successful delivery made by the rider: ");
		if(delivery > 0 && delivery < 101)
			break;
	}
	let result = (getAllowance(delivery));	

	console.log("The allowance of rider for " +  delivery + "deliveries is: " + result);
	toContinue = prompt("Enter 'done' if you have calculculated all rider's allowance or enter any other thing to continue: ")

		

	

}