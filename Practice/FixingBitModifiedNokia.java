import java.util.Scanner;

public class FixingBitModifiedNokia{
	public static void main(String... args){

		Scanner scanner = new Scanner(System.in);

		String menuDisplay = """
		Welcome to your Nokia Phone menu display
		List of Menu functions
		1 -> Phonebook
		2 -> Messages
		3 -> Chat
		4 -> Call Register
		5 -> Tones
		6 -> Settings
		7 -> Call divert
		8 -> Games
		9 -> Calculator
		10 -> Remainders
		11 -> Clock
		12 -> Profiles
		13 -> Sim settings
		0 -> to exit


""";
		boolean menuForward = true;
		while(menuForward){
			System.out.println(menuDisplay);
			System.out.print("Choose from the aboChoose from the above menu: ");
			String menuChoice = scanner.next();
			switch(menuChoice){
				case "1" -> {String phonebook = """
			
				Phonebook
				1 -> Search
				2 -> Service Nos.
				3 -> Add name
				4 -> Erase
				5 -> Edit
				6 -> Assign Tone
				7 -> Send b'card
				8 -> Options
				9 -> Speed dials
				10 -> Voice tag
				0 -> Go back to previous menu


""";
				boolean phoneBookGoing = true;
				while(phoneBookGoing){
				System.out.println(phonebook);
				System.out.print("Choose from the phonebook dropdown menu: ");
				String phonebookmenu = scanner.next();
				switch(phonebookmenu){

					case "1" ->{
						boolean search = true;
						while(search){
						System.out.println("	Search...");
						System.out.println(" 	0 -> Previous menu");
						System.out.print("Choose 0 to go back to previous menu: ");
						String searchmenu = scanner.next();
  	
							switch(searchmenu){
							case "1" -> {System.out.println("Invalid Input, Please go back to previous menu");}
							case "0" -> {search = false;}
							default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
							}
						}
					}


					case "2" -> {
						boolean serviceNos = true;
						while(serviceNos){
						System.out.println("	Service Nos...");
						System.out.println(" 	0 -> Previous menu");
						System.out.print("Choose 0 to go back to previous menu: ");
						String serviceNoMenu = scanner.next();
  	
							switch(serviceNoMenu){
							case "1" -> {System.out.println("Invalid Input, Please go back to previous menu");}
							case "0" -> {serviceNos = false;}
							default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
							}
						}

					}
					case "3" -> {
						boolean addName = true;
						while(addName){
						System.out.println("	Add Name...");
						System.out.println(" 	0 -> Previous menu");
						System.out.print("Choose 0 to go back to previous menu: ");
						String addNameMenu = scanner.next();
  	
							switch(addNameMenu){
							case "1" -> {System.out.println("Invalid Input, Please go back to previous menu");}
							case "0" -> {addName = false;}
							default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
							}
						}


					}
					case "4" -> {
						boolean erase = true;
						while(erase){
						System.out.println("	erase...");
						System.out.println(" 	0 -> Previous menu");
						System.out.print("Choose 0 to go back to previous menu: ");
						String eraseMenu = scanner.next();
  	
							switch(eraseMenu){
							case "1" -> {System.out.println("Invalid Input, Please go back to previous menu");}
							case "0" -> {erase = false;}
							default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
							}
						}
					}

					case "5" -> {

						boolean edit = true;
						while(edit){
						System.out.println("	Edit...");
						System.out.println(" 	0 -> Previous menu");
						System.out.print("Choose 0 to go back to previous menu: ");
						String editMenu = scanner.next();
  	
							switch(editMenu){
							case "1" -> {System.out.println("Invalid Input, Please go back to previous menu");}
							case "0" -> {edit = false;}
							default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
							}
						}
					}

					case "6" -> {
						boolean asignTone = true;
						while(asignTone){
						System.out.println("	Assign Tone...");
						System.out.println(" 	0 -> Previous menu");
						System.out.print("Choose 0 to go back to previous menu: ");
						String asignToneMenu = scanner.next();
  	
							switch(asignToneMenu){
							case "1" -> {System.out.println("Invalid Input, Please go back to previous menu");}
							case "0" -> {asignTone = false;}
							default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
							}
						}
					}

					case "7" -> {

						boolean sendBCard = true;
						while(sendBCard){
						System.out.println("	B'card... ");
						System.out.println(" 	0 -> Previous menu");
						System.out.print("Choose 0 to go back to previous menu: ");
						String sendBCardMenu = scanner.next();
  	
							switch(sendBCardMenu){
							case "1" -> {System.out.println("Invalid Input, Please go back to previous menu");}
							case "0" -> {sendBCard = false;}
							default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
							}
						}
					}


					case "8" -> {String options = """
						Options
						1 -> Type of View
						2 -> Memory Status
						0 -> Go back to previous menu


""";
						boolean optionsGoing = true;
						while(optionsGoing){
						System.out.print(options);
						System.out.print("Choose from the options dropdown menu: ");
						String optionsMenu = scanner.next();

						switch(optionsMenu){
							case "1" -> {

							boolean typeView = true;
							while(typeView){
								System.out.println("	Type of view... ");
								System.out.println(" 	0 -> Previous menu");
								System.out.print("Choose 0 to go back to previous menu: ");
								String typeViewMenu = scanner.next();
  	
								switch(typeViewMenu){
								case "1" -> {System.out.println("Invalid Input, Please go back to previous menu");}
								case "0" -> {typeView = false;}
								default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
							}
						}
					}



							case "2" -> {

								boolean memoryStatus = true;
								while(memoryStatus){
								System.out.println("	Memory Status... ");
								System.out.println(" 	0 -> Previous menu");
								System.out.print("Choose 0 to go back to previous menu: ");
								String memoryStatusMenu = scanner.next();
  	
								switch(memoryStatusMenu){
								case "1" -> {System.out.println("Invalid Input, Please go back to previous menu");}
								case "0" -> {memoryStatus = false;}
								default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
							}
						}
					}

							case "0" -> optionsGoing = false;
							default -> System.out.println("Invalid Input, Please choose your option from the dropdown menu");
						}
					}
				}

				
				case "9" -> {
						boolean speedDials = true;
						while(speedDials){
						System.out.println("	Speed dials... ");
						System.out.println(" 	0 -> Previous menu");
						System.out.print("Choose 0 to go back to previous menu: ");
						String speedDialsMenu = scanner.next();
  	
							switch(speedDialsMenu){
							case "1" -> {System.out.println("Invalid Input, Please go back to previous menu");}
							case "0" -> {speedDials = false;}
							default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
							}
						}
					}

				case "10" -> {
						boolean voiceTags = true;
						while(voiceTags){
						System.out.println("	Voice Tags... ");
						System.out.println(" 	0 -> Previous menu");
						System.out.print("Choose 0 to go back to previous menu: ");
						String voiceTagsMenu = scanner.next();
  	
							switch(voiceTagsMenu){
							case "1" -> {System.out.println("Invalid Input, Please go back to previous menu");}
							case "0" -> {voiceTags = false;}
							default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
							}
						}
					}

				case "0" -> {phoneBookGoing = false;}
				default -> System.out.println("Invalid Input, Please choose your option from the dropdown menu");

  				}
			}
		}
 

				case "2" -> {String messages = """
				Messages
				1 -> Write messages
				2 -> Inbox
				3 -> Outbox
				4 -> Picture Messages
				5 -> Templates
				6 -> Smileys
				7 -> Message settings
				8 -> Info service
				9 -> Voice mailbox number
				10 -> Service command editor
				0 -> Go back to previous menu


""";
				boolean messagesGoing = true;
				while(messagesGoing){
					System.out.println(messages);
					System.out.print("Choose from the above Messages dropdown menu: ");
					String messagesMenu = scanner.next();
					switch (messagesMenu){
					case "1" -> {
						boolean writeMessages = true;
						while(writeMessages){
						System.out.println("	Write Messages... ");
						System.out.println(" 	0 -> Previous menu");
						System.out.print("Choose 0 to go back to previous menu: ");
						String writeMessagesMenu = scanner.next();
  	
							switch(writeMessagesMenu){
							case "1" -> {System.out.println("Invalid Input, Please go back to previous menu");}
							case "0" -> {writeMessages = false;}
							default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
							}
						}
					}


				case "2" -> {

					boolean inbox = true;
						while(inbox){
						System.out.println("	Inbox... ");
						System.out.println(" 	0 -> Previous menu");
						System.out.print("Choose 0 to go back to previous menu: ");
						String inboxMenu = scanner.next();
  	
							switch(inboxMenu){
							case "1" -> {System.out.println("Invalid Input, Please go back to previous menu");}
							case "0" -> {inbox = false;}
							default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
							}
						}
					}



				case "3" -> {

					boolean outbox = true;
					while(outbox){
						System.out.println("	Outbox... ");
						System.out.println(" 	0 -> Previous menu");
						System.out.print("Choose 0 to go back to previous menu: ");
						String outboxMenu = scanner.next();
  	
							switch(outboxMenu){
							case "1" -> {System.out.println("Invalid Input, Please go back to previous menu");}
							case "0" -> {outbox = false;}
							default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
							}
						}
					}


				case "4" -> {
					boolean pictureMessages = true;
					while(pictureMessages){
						System.out.println("	Picture Messages... ");
						System.out.println(" 	0 -> Previous menu");
						System.out.print("Choose 0 to go back to previous menu: ");
						String pictureMessagesMenu = scanner.next();
  	
							switch(pictureMessagesMenu){
							case "1" -> {System.out.println("Invalid Input, Please go back to previous menu");}
							case "0" -> {pictureMessages = false;}
							default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
							}
						}
					}


			case "5" -> {
				boolean templates = true;
					while(templates){
						System.out.println("	Templates... ");
						System.out.println(" 	0 -> Previous menu");
						System.out.print("Choose 0 to go back to previous menu: ");
						String templatesMenu = scanner.next();
  	
							switch(templatesMenu){
							case "1" -> {System.out.println("Invalid Input, Please go back to previous menu");}
							case "0" -> {templates = false;}
							default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
							}
						}
					}

			case "6" -> {
						boolean smileys = true;
						while(smileys){
							System.out.println("	Smileys... ");
							System.out.println(" 	0 -> Previous menu");
							System.out.print("Choose 0 to go back to previous menu: ");
							String smileysMenu = scanner.next();
  	
							switch(smileysMenu){
								case "1" -> {System.out.println("Invalid Input, Please go back to previous menu");}
								case "0" -> {smileys = false;}
								default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
							}
						}
					}

			case "7" -> { String messageSetting = """
					Messages Setting
					1 -> Set 1
					2 -> Common
					0 -> Go back to previous menu

				""";
				boolean messageSettingGoing = true;
				while(messageSettingGoing){
				System.out.print(messageSetting);
				System.out.print("Choose from the above Message Setting dropdown menu: ");
				String messageSettingMenu = scanner.next();
				switch(messageSettingMenu){
				case "1" -> { String set1 = """
						Set 1
					1 -> Message center number
					2 -> Messages sent as
					3 -> Message validity
					0 -> Go back to previous menu

""";
					boolean set1Going = true;
					while (set1Going){
						System.out.println(set1);
						System.out.print("Choose from the above Set 1 menu: ");
						String set1Menu = scanner.next();
						switch(set1Menu){
						case "1" -> {
						boolean messageCenterNumber = true;
						while(messageCenterNumber){
							System.out.println("	Message center number... ");
							System.out.println(" 	0 -> Previous menu");
							System.out.print("Choose 0 to go back to previous menu: ");
							String messageCenterNumberMenu = scanner.next();
  	
							switch(messageCenterNumberMenu){
								case "1" -> {System.out.println("Invalid Input, Please go back to previous menu");}
								case "0" -> {messageCenterNumber = false;}
								default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
							}
						}
					}


						case "2" -> {
						boolean messagesSentAs = true;
						while(messagesSentAs){
							System.out.println("	Messages sent as... ");
							System.out.println(" 	0 -> Previous menu");
							System.out.print("Choose 0 to go back to previous menu: ");
							String messagesSentAsMenu = scanner.next();
  	
							switch(messagesSentAsMenu){
								case "1" -> {System.out.println("Invalid Input, Please go back to previous menu");}
								case "0" -> {messagesSentAs = false;}
								default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
							}
						}
					}



						case "3" -> {
						Boolean messageValidity = true;
						while(messageValidity){
							System.out.println("	Message validity... ");
							System.out.println(" 	0 -> Previous menu");
							System.out.print("Choose 0 to go back to previous menu: ");
							String messageValidityMenu = scanner.next();
  	
							switch(messageValidityMenu){
								case "1" -> {System.out.println("Invalid Input, Please go back to previous menu");}
								case "0" -> {messageValidity = false;}
								default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
							}
						}
					}

						case "0" -> set1Going = false;
					}
				}
			}
				case "2" -> { String common = """
					Common
					1 -> Delivery report
					2 -> Reply via same centre
					3 -> Character support
					0 -> Go back to previous menu
""";	
					boolean commonForward = true;
					while(commonForward){
					System.out.println(common);
					System.out.println("Choose from the above Common menu: ");
					String commonMenu = scanner.next();
					switch(commonMenu){

					case "1" -> {
						Boolean deliveryReport = true;
						while(deliveryReport){
							System.out.println("	Delivery report... ");
							System.out.println(" 	0 -> Previous menu");
							System.out.print("Choose 0 to go back to previous menu: ");
							String deliveryReportMenu = scanner.next();
  	
							switch(deliveryReportMenu){
								case "1" -> {System.out.println("Invalid Input, Please go back to previous menu");}
								case "0" -> {deliveryReport = false;}
								default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
							}
						}
					}

					case "2" -> {
						Boolean replyViaSameCentre = true;
						while(replyViaSameCentre){
							System.out.println("	Reply via same centre... ");
							System.out.println(" 	0 -> Previous menu");
							System.out.print("Choose 0 to go back to previous menu: ");
							String replyViaSameCentreMenu = scanner.next();
  	
							switch(replyViaSameCentreMenu){
								case "1" -> {System.out.println("Invalid Input, Please go back to previous menu");}
								case "0" -> {replyViaSameCentre = false;}
								default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
							}
						}
					}






					case "3" -> {
						Boolean characterSupport = true;
						while(characterSupport){
							System.out.println("	Character support... ");
							System.out.println(" 	0 -> Previous menu");
							System.out.print("Choose 0 to go back to previous menu: ");
							String characterSupportMenu = scanner.next();
  	
							switch(characterSupportMenu){
								case "1" -> {System.out.println("Invalid Input, Please go back to previous menu");}
								case "0" -> {characterSupport = false;}
								default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
							}
						}
					}


					case "0" -> commonForward = false;
					}
					}
				}
				case "0" -> {messageSettingGoing = false;}
				default -> {System.out.println("Invalid Input");}
				}
				}

			}
			case "8" -> {System.out.print("Info Service");}
			case "9" -> {System.out.print("Voice mailbox number");}
			case "10" -> {System.out.print("Service command editor");}
			case "0" -> messagesGoing = false;
			default -> {System.out.println("Invalid Input");}

			}
				
			}


		}

				case "3" -> {
					Boolean chat = true;
					while(chat){
						System.out.println("	Chat... ");
						System.out.println(" 	0 -> Previous menu");
						System.out.print("Choose 0 to go back to previous menu: ");
						String chatMenu = scanner.next();
  	
						switch(chatMenu){
							case "1" -> {System.out.println("Invalid Input, Please go back to previous menu");}
							case "0" -> {chat = false;}
							default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
						}
					}
				}

				case "4" -> {  String callRegister = """
					Call Register
					1 -> Missed calls
					2 -> Received calls
					3 -> Dialed numbers
					4 -> Erase recent call lists
					5 -> Show call duration
					6 -> Show call costs
					7 -> Call cost settings
					8 -> Prepaid credit
					0 -> Go back to previous menu

""";
				

				boolean callRegisterGoing = true;
				while(callRegisterGoing){
					System.out.println(callRegister);
					System.out.print("Choose from the above Call Register dropdown menu: ");
					String callRegisterMenu = scanner.next();
					switch (callRegisterMenu){
						case "1" -> {
							Boolean missedCalls = true;
							while(missedCalls){
								System.out.println("	Missed calls... ");
								System.out.println(" 	0 -> Previous menu");
								System.out.print("Choose 0 to go back to previous menu: ");
								String missedCallsMenu = scanner.next();
  	
								switch(missedCallsMenu){
									case "1" -> {System.out.println("Invalid Input, Please go back to previous menu");}
									case "0" -> {missedCalls = false;}
									default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
						}
					}
				}



						case "2" -> {
							Boolean receivedCalls = true;
							while(receivedCalls){
								System.out.println("	Received calls... ");
								System.out.println(" 	0 -> Previous menu");
								System.out.print("Choose 0 to go back to previous menu: ");
								String receivedCallsMenu = scanner.next();
  	
								switch(receivedCallsMenu){
									case "1" -> {System.out.println("Invalid Input, Please go back to previous menu");}
									case "0" -> {receivedCalls = false;}
									default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
						}
					}
				}

						case "3" -> {
							Boolean dialedNumbers = true;
							while(dialedNumbers){
								System.out.println("	Dialed numbers... ");
								System.out.println(" 	0 -> Previous menu");
								System.out.print("Choose 0 to go back to previous menu: ");
								String dialedNumbersMenu = scanner.next();
  	
								switch(dialedNumbersMenu){
									case "1" -> {System.out.println("Invalid Input, Please go back to previous menu");}
									case "0" -> {dialedNumbers = false;}
									default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
						}
					}
				}


						case "4" -> {

							Boolean eraseRecentCallLists = true;
							while(eraseRecentCallLists){
								System.out.println("	Erase recent call lists... ");
								System.out.println(" 	0 -> Previous menu");
								System.out.print("Choose 0 to go back to previous menu: ");
								String eraseRecentCallListsMenu = scanner.next();
  	
								switch(eraseRecentCallListsMenu){
									case "1" -> {System.out.println("Invalid Input, Please go back to previous menu");}
									case "0" -> {eraseRecentCallLists = false;}
									default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
						}
					}
				}

					


						case "5" -> { String showCallDuration = """
							Show call duration
							1 -> Last call duration
							2 -> All call's duration
							3 -> Recieved call's duration
							4 -> Dialed call duration
							5 -> Clear timers
							0 -> Go back to previous menu

				""";
					boolean callDurationGoing = true;
					while(callDurationGoing){
					System.out.println(showCallDuration);
					System.out.print("Choose from the above Show call duration dropdown menu: ");
					String showCallDurationMenu = scanner.next();
					switch(showCallDurationMenu){
						case "1" -> {
							Boolean lastCallDuration = true;
							while(lastCallDuration){
								System.out.println("	Last call duration... ");
								System.out.println(" 	0 -> Previous menu");
								System.out.print("Choose 0 to go back to previous menu: ");
								String lastCallDurationMenu = scanner.next();
  	
								switch(lastCallDurationMenu){
									case "0" -> {lastCallDuration = false;}
									default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
						}
					}
				}



						case "2" -> {
							Boolean AllCallDuration = true;
							while(AllCallDuration){
								System.out.println("	All call's duration... ");
								System.out.println(" 	0 -> Previous menu");
								System.out.print("Choose 0 to go back to previous menu: ");
								String AllCallDurationMenu = scanner.next();
  	
								switch(AllCallDurationMenu){
									case "0" -> {AllCallDuration = false;}
									default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
						}
					}
				}



						case "3" -> {
							
							Boolean recievedCallDuration = true;
							while(recievedCallDuration){
								System.out.println("	Recieved call's duration... ");
								System.out.println(" 	0 -> Previous menu");
								System.out.print("Choose 0 to go back to previous menu: ");
								String recievedCallDurationMenu = scanner.next();
  	
								switch(recievedCallDurationMenu){
									case "0" -> {recievedCallDuration = false;}
									default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
						}
					}
				}


						case "4" -> {
							Boolean dialedCallDuration = true;
							while(dialedCallDuration){
								System.out.println("	Dialed call's duration... ");
								System.out.println(" 	0 -> Previous menu");
								System.out.print("Choose 0 to go back to previous menu: ");
								String dialedCallDurationMenu = scanner.next();
  	
								switch(dialedCallDurationMenu){
									case "0" -> {dialedCallDuration = false;}
									default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
						}
					}
				}


						case "5" -> {
							Boolean cleartimers = true;
							while(cleartimers){
								System.out.println("	Clear timers... ");
								System.out.println(" 	0 -> Previous menu");
								System.out.print("Choose 0 to go back to previous menu: ");
								String cleartimersMenu = scanner.next();
  	
								switch(cleartimersMenu){
									case "0" -> {cleartimers = false;}
									default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
						}
					}
				}


						case "0" -> callDurationGoing = false;
						default -> System.out.println("Invalid Input");

					}	


					}

				}
				case "6" -> {String showCallCosts = """
						Show call costs
						1 -> Last call cost
						2 -> All call's cost
						3 -> Clear counters
						0 -> Go back to previous menu

				""";
				boolean showCallCostGoing = true;
				while(showCallCostGoing){
				System.out.println(showCallCosts);
				System.out.print("Choose from the above Show call Costs dropdown menu: ");
				String showCallCostsMenu = scanner.next();
				switch(showCallCostsMenu){
				case "1" -> {
					Boolean lastCallCost = true;
						while(lastCallCost){
							System.out.println("	Last call's cost... ");
							System.out.println(" 	0 -> Previous menu");
							System.out.print("Choose 0 to go back to previous menu: ");
							String lastCallCostMenu = scanner.next();
  	
							switch(lastCallCostMenu){
								case "0" -> {lastCallCost = false;}
								default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
						}
					}
				}

				case "2" -> {
					Boolean allCallCost = true;
						while(allCallCost){
							System.out.println("	All call's cost... ");
							System.out.println(" 	0 -> Previous menu");
							System.out.print("Choose 0 to go back to previous menu: ");
							String allCallCostMenu = scanner.next();
  	
							switch(allCallCostMenu){
								case "0" -> {allCallCost = false;}
								default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
						}
					}
				}

				case "3" -> {

					Boolean clearcounters = true;
						while(clearcounters){
							System.out.println("	Clear counters... ");
							System.out.println(" 	0 -> Previous menu");
							System.out.print("Choose 0 to go back to previous menu: ");
							String clearcountersMenu = scanner.next();
  	
							switch(clearcountersMenu){
								case "0" -> {clearcounters = false;}
								default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
						}
					}
				}

				case "0" -> showCallCostGoing = false;
				}
			}


		}
				case "7" -> {String callCostSettings = """
						Call cost settings
						1 -> call cost limit
						2 -> Show costs in
						0 -> Go back to previous menu

								""";
					boolean callCostSettingsGoing = true;
					while(callCostSettingsGoing){
					System.out.println(callCostSettings);
					System.out.print("Choose from the above Call cost settings dropdown menu: ");
				String callCostSettingsMenu = scanner.next();
				switch(callCostSettingsMenu){
				case "1" -> {
					Boolean callCostLimit = true;
						while(callCostLimit){
							System.out.println("	Call cost limits... ");
							System.out.println(" 	0 -> Previous menu");
							System.out.print("Choose 0 to go back to previous menu: ");
							String callCostLimitMenu = scanner.next();
  	
							switch(callCostLimitMenu){
								case "0" -> {callCostLimit = false;}
								default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
						}
					}
				}




				case "2" -> {
					Boolean showCostsIn = true;
						while(showCostsIn){
							System.out.println("	Show costs in... ");
							System.out.println(" 	0 -> Previous menu");
							System.out.print("Choose 0 to go back to previous menu: ");
							String showCostsInMenu = scanner.next();
  	
							switch(showCostsInMenu){
								case "0" -> {showCostsIn = false;}
								default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
						}
					}
				}



				case "0" -> callCostSettingsGoing = false;
				}
				}

				}
				case "8" -> {
					Boolean prepaidCredit = true;
						while(prepaidCredit){
							System.out.println("	Prepaid credit... ");
							System.out.println(" 	0 -> Previous menu");
							System.out.print("Choose 0 to go back to previous menu: ");
							String prepaidCreditMenu = scanner.next();
  	
							switch(prepaidCreditMenu){
								case "0" -> {prepaidCredit = false;}
								default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
						}
					}
				}


				case "0" -> callRegisterGoing = false;
				default -> System.out.println("Invalid Input");

			}

			}
			
		}



				case "5" -> { String tones = """
					Tones
					1 -> Ringing tone
					2 -> Ringing volume
					3 -> Incoming call alert
					4 -> Composer
					5 -> Message alert tones
					6 -> Keypad tones
					7 -> Warning and game tones
					8 -> Vibrating alert
					9 -> Screen saver
					0 -> Go back to previous menu
""";

				boolean tonesGoing = true;
			while(tonesGoing){
			System.out.print(tones);
			System.out.print("Choose from the above Tones dropdown menu: ");
			String toneMenu = scanner.next();
			switch(toneMenu){
			case "1" -> {
						Boolean ringingTone = true;
						while(ringingTone){
							System.out.println("	Ringing tone... ");
							System.out.println(" 	0 -> Previous menu");
							System.out.print("Choose 0 to go back to previous menu: ");
							String ringingToneMenu = scanner.next();
  	
							switch(ringingToneMenu){
								case "0" -> {ringingTone = false;}
								default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
						}
					}
				}
			case "2" -> {
				Boolean ringingVolume = true;
				while(ringingVolume){
					System.out.println("	Ringing volume... ");
					System.out.println(" 	0 -> Previous menu");
					System.out.print("Choose 0 to go back to previous menu: ");
					String ringingVolumeMenu = scanner.next();
  	
					switch(ringingVolumeMenu){
						case "0" -> {ringingVolume = false;}
						default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
						}
					}
				}

			case "3" -> {
				Boolean incomingCallAlerts = true;
				while(incomingCallAlerts){
					System.out.println("	Incoming call alerts... ");
					System.out.println(" 	0 -> Previous menu");
					System.out.print("Choose 0 to go back to previous menu: ");
					String incomingCallAlertsMenu = scanner.next();
  	
					switch(incomingCallAlertsMenu){
						case "0" -> {incomingCallAlerts = false;}
						default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
						}
					}
				}

			case "4" -> {
				Boolean  composer = true;
				while(composer){
					System.out.println("	Composer... ");
					System.out.println(" 	0 -> Previous menu");
					System.out.print("Choose 0 to go back to previous menu: ");
					String composerMenu = scanner.next();
  	
					switch(composerMenu){
						case "0" -> {composer = false;}
						default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
						}
					}
				}

			case "5" -> {
				Boolean messageAlertTones = true;
				while(messageAlertTones){
					System.out.println("	Message alert tones... ");
					System.out.println(" 	0 -> Previous menu");
					System.out.print("Choose 0 to go back to previous menu: ");
					String messageAlertTonesMenu = scanner.next();
  	
					switch(messageAlertTonesMenu){
						case "0" -> {messageAlertTones = false;}
						default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
						}
					}
				}

			case "6" -> {
				Boolean keypadTone = true;
				while(keypadTone){
					System.out.println("	Keypad tone... ");
					System.out.println(" 	0 -> Previous menu");
					System.out.print("Choose 0 to go back to previous menu: ");
					String keypadToneMenu = scanner.next();
  	
					switch(keypadToneMenu){
						case "0" -> {keypadTone = false;}
						default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
						}
					}
				}


			case "7" -> {
				Boolean warningAndGameTones = true;
				while(warningAndGameTones){
					System.out.println("	Warning and game tones... ");
					System.out.println(" 	0 -> Previous menu");
					System.out.print("Choose 0 to go back to previous menu: ");
					String warningAndGameTonesMenu = scanner.next();
  	
					switch(warningAndGameTonesMenu){
						case "0" -> {warningAndGameTones = false;}
						default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
						}
					}
				}

			case "8" -> {
				Boolean vibratingAlert = true;
				while(vibratingAlert){
					System.out.println("	Vibrating alert... ");
					System.out.println(" 	0 -> Previous menu");
					System.out.print("Choose 0 to go back to previous menu: ");
					String vibratingAlertMenu = scanner.next();
  	
					switch(vibratingAlertMenu){
						case "0" -> {vibratingAlert = false;}
						default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
						}
					}
				}

			case "9" -> {
				Boolean screenSaver = true;
				while(screenSaver){
					System.out.println("	Screen saver... ");
					System.out.println(" 	0 -> Previous menu");
					System.out.print("Choose 0 to go back to previous menu: ");
					String screenSaverMenu = scanner.next();
  	
					switch(screenSaverMenu){
						case "0" -> {screenSaver = false;}
						default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
						}
					}
				}

			case "0" -> tonesGoing = false;
			default -> System.out.println("Invalid Input");

			}
				
			}
		}


				case "6" -> {String settings = """
				Settings
			1 -> Call Settings
			2 -> Phone settings
			3 -> Security settings
			4 -> Restore Factory Settings
			0 -> Go back to previous menu

""";
			
boolean settingGoing = true;
			while(settingGoing){
			System.out.print(settings);
			System.out.print("Choose from the above Settings dropdown menu: ");
			String settingsMenu = scanner.next();

			switch(settingsMenu){
			case "1" -> {String callSetting = """
				Call Setting
				1 -> Automatic redial
				2 -> Speed dialing
				3 -> Call waiting options
				4 -> Own number sending
				5 -> Phone line in use
				6 -> Automatic answer
				0 -> Go back to previous menu

			""";
				boolean callSettingGoing = true;
				while(callSettingGoing){
				System.out.print(callSetting);
				System.out.print("Choose from the above Call settings dropdown menu: ");
				String callSettingMenu = scanner.next();

				switch(callSettingMenu){
				case "1" -> {
					Boolean automaticRedial = true;
					while(automaticRedial){
						System.out.println("	Automatic redial... ");
						System.out.println(" 	0 -> Previous menu");
						System.out.print("Choose 0 to go back to previous menu: ");
						String automaticRedialMenu = scanner.next();
  	
						switch(automaticRedialMenu){
							case "0" -> {automaticRedial = false;}
							default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
						}
					}
				}


				case "2" -> {
					Boolean speedDialing = true;
					while(speedDialing){
						System.out.println("	Speed dialing... ");
						System.out.println(" 	0 -> Previous menu");
						System.out.print("Choose 0 to go back to previous menu: ");
						String speedDialingMenu = scanner.next();
  	
						switch(speedDialingMenu){
							case "0" -> {speedDialing = false;}
							default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
						}
					}
				}

				case "3" -> {
					Boolean callWaitingOptions = true;
					while(callWaitingOptions){
						System.out.println("	Call waiting options... ");
						System.out.println(" 	0 -> Previous menu");
						System.out.print("Choose 0 to go back to previous menu: ");
						String callWaitingOptionsMenu = scanner.next();
  	
						switch(callWaitingOptionsMenu){
							case "0" -> {callWaitingOptions = false;}
							default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
						}
					}
				}

				case "4" -> {
					Boolean ownNumberSending = true;
					while(ownNumberSending){
						System.out.println("	Own number sending... ");
						System.out.println(" 	0 -> Previous menu");
						System.out.print("Choose 0 to go back to previous menu: ");
						String ownNumberSendingMenu = scanner.next();
  	
						switch(ownNumberSendingMenu){
							case "0" -> {ownNumberSending = false;}
							default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
						}
					}
				}

				case "5" -> {
					Boolean phoneLineInUse = true;
					while(phoneLineInUse){
						System.out.println("	Phone line in use... ");
						System.out.println(" 	0 -> Previous menu");
						System.out.print("Choose 0 to go back to previous menu: ");
						String phoneLineInUseMenu = scanner.next();
  	
						switch(phoneLineInUseMenu){
							case "0" -> {phoneLineInUse = false;}
							default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
						}
					}
				}

				case "6" -> {
					Boolean automaticAnswer = true;
					while(automaticAnswer){
						System.out.println("	Automatic answer... ");
						System.out.println(" 	0 -> Previous menu");
						System.out.print("Choose 0 to go back to previous menu: ");
						String automaticAnswerMenu = scanner.next();
  	
						switch(automaticAnswerMenu){
							case "0" -> {automaticAnswer = false;}
							default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
						}
					}
				}


				case "0" -> callSettingGoing = false;
				default -> System.out.println("Invalid Input");

				}

				}

			}

			case "2" -> {String phoneSetting = """
				Phone Setting
				1 -> Language
				2 -> Cell info display
				3 -> Welcome note
				4 -> Network selection
				5 -> Lights
				6 -> Confirm SIM service actions
				0 -> Go back to previous menu

			""";
				boolean phoneSettingGoing = true;
				while(phoneSettingGoing){
				System.out.print(phoneSetting);
				System.out.print("Choose from the above Phone settings dropdown menu: ");
				String phoneSettingMenu = scanner.next();

				switch(phoneSettingMenu){
				case "1" -> {System.out.print("Language");}
				case "2" -> {System.out.print("Cell info display");}
				case "3" -> {System.out.print("Welcome note");}
				case "4" -> {System.out.print("Network selection");}
				case "5" -> {System.out.print("Lights");}
				case "6" -> {System.out.print("Confirm SIM service actions");}
				case "0" -> phoneSettingGoing = false;
				default -> System.out.println("Invalid Input");

				}

				}
			}
			case "3" -> {String securitySetting = """
				Security Setting
				1 -> Pin code request
				2 -> Call barring service
				3 -> Fixed dialing
				4 -> Closed user group
				5 -> Phone security
				6 -> Change access codes
				0 -> Go back to previous menu

			""";

				boolean securitySettingGoing = true;
				while(securitySettingGoing){
				System.out.print(securitySetting);
				System.out.print("Choose from the above Security settings dropdown menu: ");
				String securitySettingMenu = scanner.next();

				switch(securitySettingMenu){
				case "1" -> {
					Boolean pinCodeRequest = true;
					while(pinCodeRequest){
						System.out.println("	Pin code request... ");
						System.out.println(" 	0 -> Previous menu");
						System.out.print("Choose 0 to go back to previous menu: ");
						String pinCodeRequestMenu = scanner.next();
  	
						switch(pinCodeRequestMenu){
							case "0" -> {pinCodeRequest = false;}
							default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
						}
					}
				}


				case "2" -> {
					Boolean callBarringService = true;
					while(callBarringService){
						System.out.println("	Call barring service... ");
						System.out.println(" 	0 -> Previous menu");
						System.out.print("Choose 0 to go back to previous menu: ");
						String callBarringServiceMenu = scanner.next();
  	
						switch(callBarringServiceMenu){
							case "0" -> {callBarringService = false;}
							default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
						}
					}
				}

			
	
				case "3" -> {
					Boolean fixedDialing = true;
					while(fixedDialing){
						System.out.println("	Fixed dialing... ");
						System.out.println(" 	0 -> Previous menu");
						System.out.print("Choose 0 to go back to previous menu: ");
						String fixedDialingMenu = scanner.next();
  	
						switch(fixedDialingMenu){
							case "0" -> {fixedDialing = false;}
							default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
						}
					}
				}


				case "4" -> {
					Boolean closedUserGroup = true;
					while(closedUserGroup){
						System.out.println("	Closed user group... ");
						System.out.println(" 	0 -> Previous menu");
						System.out.print("Choose 0 to go back to previous menu: ");
						String closedUserGroupMenu = scanner.next();
  	
						switch(closedUserGroupMenu){
							case "0" -> {closedUserGroup = false;}
							default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
						}
					}
				}

				case "5" -> {
					Boolean phoneSecurity = true;
					while(phoneSecurity){
						System.out.println("	Phone security... ");
						System.out.println(" 	0 -> Previous menu");
						System.out.print("Choose 0 to go back to previous menu: ");
						String phoneSecurityMenu = scanner.next();
  	
						switch(phoneSecurityMenu){
							case "0" -> {phoneSecurity = false;}
							default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
						}
					}
				}

				case "6" -> {
					Boolean changeAccessCodes = true;
					while(changeAccessCodes){
						System.out.println("	Change access codes... ");
						System.out.println(" 	0 -> Previous menu");
						System.out.print("Choose 0 to go back to previous menu: ");
						String changeAccessCodesMenu = scanner.next();
  	
						switch(changeAccessCodesMenu){
							case "0" -> {changeAccessCodes = false;}
							default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
						}
					}
				}

				case "0" -> securitySettingGoing = false;
				default -> System.out.println("Invalid Input");

				}

				}

			}

			case "4" -> {
				Boolean restoreFactorySettings = true;
					while(restoreFactorySettings){
						System.out.println("	Restore Factory Settings... ");
						System.out.println(" 	0 -> Previous menu");
						System.out.print("Choose 0 to go back to previous menu: ");
						String restoreFactorySettingsM = scanner.next();
  	
						switch(restoreFactorySettingsM){
							case "0" -> {restoreFactorySettings = false;}
							default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
						}
					}
				}

			case "0" -> settingGoing = false;
			default -> System.out.println("Invalid Input");

			}				
			}
		}

			case "7" -> {
				Boolean callDivert = true;
					while(callDivert){
						System.out.println("	Call Divert... ");
						System.out.println(" 	0 -> Previous menu");
						System.out.print("Choose 0 to go back to previous menu: ");
						String callDivertsMenu = scanner.next();
  	
						switch(callDivertsMenu){
							case "0" -> {callDivert = false;}
							default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
						}
					}
				}


			case "8" -> {
				Boolean games = true;
					while(games){
						System.out.println("	Games... ");
						System.out.println(" 	0 -> Previous menu");
						System.out.print("Choose 0 to go back to previous menu: ");
						String gamesMenu = scanner.next();
  	
						switch(gamesMenu){
							case "0" -> {games = false;}
							default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
						}
					}
				}



			case "9" -> {
				Boolean calculator = true;
					while(calculator){
						System.out.println("	Calculator.. ");
						System.out.println(" 	0 -> Previous menu");
						System.out.print("Choose 0 to go back to previous menu: ");
						String calculatorMenu = scanner.next();
  	
						switch(calculatorMenu){
							case "0" -> {calculator = false;}
							default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
						}
					}
				}


			case "10" -> {
				Boolean remainders = true;
					while(remainders){
						System.out.println("	Reminders... ");
						System.out.println(" 	0 -> Previous menu");
						System.out.print("Choose 0 to go back to previous menu: ");
						String remaindersMenu = scanner.next();
  	
						switch(remaindersMenu){
							case "0" -> {remainders = false;}
							default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
						}
					}
				}

			case "11" -> {String clock = """
			Clock
			1 -> Alarm clock
			2 -> Clock settings
			3 -> Date setting
			4 -> Stopwatch
			5 -> Countdown timer
			6 -> Auto update of date and time
			0 -> Go back to previous menu

""";
			boolean clockGoing = true;
			while(clockGoing){
			System.out.print(clock);
			System.out.print("Choose from the above Clock dropdown menu: ");
			String clockMenu = scanner.next();
			switch(clockMenu){
			case "1" -> {
				Boolean alarmClock = true;
					while(alarmClock){
						System.out.println("	Alarm clock... ");
						System.out.println(" 	0 -> Previous menu");
						System.out.print("Choose 0 to go back to previous menu: ");
						String alarmClockMenu = scanner.next();
  	
						switch(alarmClockMenu){
							case "0" -> {alarmClock = false;}
							default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
						}
					}
				}

			case "2" -> {
				Boolean clockSettings = true;
					while(clockSettings){
						System.out.println("	Clock settings... ");
						System.out.println(" 	0 -> Previous menu");
						System.out.print("Choose 0 to go back to previous menu: ");
						String clockSettingsMenu = scanner.next();
  	
						switch(clockSettingsMenu){
							case "0" -> {clockSettings = false;}
							default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
						}
					}
				}


			case "3" -> {
				Boolean dateSetting = true;
					while(dateSetting){
						System.out.println("	Date setting... ");
						System.out.println(" 	0 -> Previous menu");
						System.out.print("Choose 0 to go back to previous menu: ");
						String dateSettingMenu = scanner.next();
  	
						switch(dateSettingMenu){
							case "0" -> {dateSetting = false;}
							default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
						}
					}
				}



			case "4" -> {
				Boolean stopwatch = true;
					while(stopwatch){
						System.out.println("	Stopwatch... ");
						System.out.println(" 	0 -> Previous menu");
						System.out.print("Choose 0 to go back to previous menu: ");
						String stopwatchMenu = scanner.next();
  	
						switch(stopwatchMenu){
							case "0" -> {stopwatch = false;}
							default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
						}
					}
				}



			case "5" -> {
				Boolean countdownTimer = true;
					while(countdownTimer){
						System.out.println("	Countdown timer... ");
						System.out.println(" 	0 -> Previous menu");
						System.out.print("Choose 0 to go back to previous menu: ");
						String countdownTimerMenu = scanner.next();
  	
						switch(countdownTimerMenu){
							case "0" -> {countdownTimer = false;}
							default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
						}
					}
				}

			case "6" -> {
				Boolean dateTime = true;
					while(dateTime){
						System.out.println("	Auto update of date and time... ");
						System.out.println(" 	0 -> Previous menu");
						System.out.print("Choose 0 to go back to previous menu: ");
						String dateTimeMenu = scanner.next();
  	
						switch(dateTimeMenu){
							case "0" -> {dateTime = false;}
							default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
						}
					}
				}



			case "0" -> clockGoing = false;
			}		
			}
		}


 			case "12" -> {
				Boolean profiles = true;
					while(profiles){
						System.out.println("	Auto update of date and time... ");
						System.out.println(" 	0 -> Previous menu");
						System.out.print("Choose 0 to go back to previous menu: ");
						String profilesMenu = scanner.next();
  	
						switch(profilesMenu){
							case "0" -> {profiles = false;}
							default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
						}
					}
				}


	 		case "13" -> {
				Boolean simServices = true;
					while(simServices){
						System.out.println("	Sim services... ");
						System.out.println(" 	0 -> Previous menu");
						System.out.print("Choose 0 to go back to previous menu: ");
						String simServicesMenu = scanner.next();
  	
						switch(simServicesMenu){
							case "0" -> {simServices = false;}
							default -> {System.out.println("	Invalid Input, Please go back to previous menu");}
						}
					}
				}

			case "0"  ->{menuForward = false;}
 			default -> System.out.println("Invalid Input");
			}
		}

	}
  

 }


