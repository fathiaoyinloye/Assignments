import java.util.Scanner;

public class ModifiedNokia{
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
		System.out.print("Choose from the above menu: ");
		int menuChoice = scanner.nextInt();
				
		
		switch(menuChoice){
		case 1 -> {String phonebook = """
			
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
			int phonebookmenu = scanner.nextInt();
			switch(phonebookmenu){

			case 1 -> {System.out.print("Search");}
			case 2 -> {System.out.print("Service Nos");}
			case 3 -> {System.out.print("Add name");}
			case 4 -> {System.out.print("Erase");}
			case 5 -> {System.out.print("Edit");}
			case 6 -> {System.out.print("Asign tone");}
			case 7 -> {System.out.print("Send b'card");}
			case 8 -> {String options = """
					   Options
					1 -> Type of View
					2 -> Memory Status
					0 -> Go back to previous menu


					""";
					boolean optionsGoing = true;
					while(optionsGoing){

					System.out.print(options);
					System.out.println("Choose from the options dropdown menu: ");
					int optionsMenu = scanner.nextInt();

					switch(optionsMenu){
					case 1 -> {System.out.print("Type of View");}
					case 2 -> {System.out.print("Memory Status");}
					case 0 -> optionsGoing = false;
					}
					}

				}
			case 9 -> {System.out.print("Speed dials");}
			case 10 -> {System.out.print("Voice tags");}
			case 0 -> phoneBookGoing = false;
			}
			}
		}
//}
		case 2 -> {String messages = """
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
			int messagesMenu = scanner.nextInt();
			switch (messagesMenu){
			case 1 -> {System.out.print("Write messages");}
			case 2 -> {System.out.print("Inbox");}
			case 3 -> {System.out.print("Outbox");}
			case 4 -> {System.out.print("Picture Messages");}
			case 5 -> {System.out.print("Templates");}
			case 6 -> {System.out.print("Smileys");}
			case 7 -> { String messageSetting = """
					Messages Setting
					1 -> Set 1
					2 -> Common
					0 -> Go back to previous menu

				""";
				boolean messageSettingGoing = true;
				while(messageSettingGoing){
				System.out.print(messageSetting);
				System.out.print("Choose from the above Message Setting dropdown menu: ");
				int messageSettingMenu = scanner.nextInt();
				switch(messageSettingMenu){
				case 1 -> { String set1 = """
					Set 1
					1 -> Message center number
					2 -> Messages sent as
					3 -> Message validity
					0 -> Go back to previous menu

					""";
					boolean set1Going = true;
					while (set1Going){
					System.out.println(set1);
					System.out.println("Choose from the above Set 1 menu: ");
					int set1Menu = scanner.nextInt();
					switch(set1Menu){
					case 1 -> {System.out.print("Message center number");}
					case 2 -> {System.out.print("Messages sent as");}
					case 3 -> {System.out.print("Message validity");}
					case 0 -> set1Going = false;
					}
				}
				}
				case 2 -> { String common = """
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
					int commonMenu = scanner.nextInt();
					switch(commonMenu){
					case 1 -> {System.out.print("Delivery report");}
					case 2 -> {System.out.print("Reply via same centre");}
					case 3 -> {System.out.print("Character support");}
					case 0 -> commonForward = false;
					}
					}
				}
				case 0 -> messageSettingGoing = false;
				}
				}

			}
			case 8 -> {System.out.print("Info Service");}
			case 9 -> {System.out.print("Voice mailbox number");}
			case 10 -> {System.out.print("Service command editor");}
			case 0 -> messagesGoing = false;
			}
				
			}
			
		}
		case 3 -> {System.out.print("Chat");}
		case 4 -> {  String callRegister = """
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
			int callRegisterMenu = scanner.nextInt();
			switch (callRegisterMenu){
				case 1 -> {System.out.print("Missed calls");}
				case 2 -> {System.out.print("Received calls");}
				case 3 -> {System.out.print("Dialed numbers");}
				case 4 -> {System.out.print("Erase recent call lists");}
				case 5 -> { String showCallDuration = """
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
					int showCallDurationMenu = scanner.nextInt();
					switch(showCallDurationMenu){
						case 1 -> {System.out.print("Last call duration");}
						case 2 -> {System.out.print("All call's duration");}
						case 3 -> {System.out.print("Recieved call's duration");}
						case 4 -> {System.out.print("Dialed call duration");}
						case 5 -> {System.out.print("Clear timers");}
						case 0 -> callDurationGoing = false;
					}	


					}

				}
				case 6 -> {String showCallCosts = """
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
				int showCallCostsMenu = scanner.nextInt();
				switch(showCallCostsMenu){
				case 1 -> {System.out.print("Last call cost");}
				case 2 -> {System.out.print("All call's cost");}
				case 3 -> {System.out.print("Clear counters");}
				case 0 -> showCallCostGoing = false;
				}
				}


				}
				case 7 -> {String callCostSettings = """
						Call cost settings
						1 -> call cost limit
						2 -> Show costs in
						0 -> Go back to previous menu

								""";
					boolean callCostSettingsGoing = true;
					while(callCostSettingsGoing){
					System.out.println(callCostSettings);
					System.out.print("Choose from the above Call cost settings dropdown menu: ");
				int callCostSettingsMenu = scanner.nextInt();
				switch(callCostSettingsMenu){
				case 1 -> {System.out.print("Call cost limit");}
				case 2 -> {System.out.print("Show costs in");}
				case 0 -> callCostSettingsGoing = false;
				}
				}

				}
				case 8 -> {System.out.print(" Prepaid credit");}
				case 0 -> callRegisterGoing = false;
			}

			}
			
		}

		case 5 -> { String tones = """
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
			int toneMenu = scanner.nextInt();
			switch(toneMenu){
			case 1 -> {System.out.print("Ringing tone");}
			case 2 -> {System.out.print("Ringing volume");}
			case 3 -> {System.out.print("Incoming call alerts");}
			case 4 -> {System.out.print("Composer");}
			case 5 -> {System.out.print("Message alert tones");}
			case 6 -> {System.out.print("Keypad tone");}
			case 7 -> {System.out.print("Warning and game tones");}
			case 8 -> {System.out.print("Vibrating alert");}
			case 9 -> {System.out.print("Screen saver");}
			case 0 -> tonesGoing = false;
			}
				
			}
		}

		case 6 -> {String settings = """
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
			int settingsMenu = scanner.nextInt();

			switch(settingsMenu){
			case 1 -> {String callSetting = """
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
				int callSettingMenu = scanner.nextInt();

				switch(callSettingMenu){
				case 1 -> {System.out.print("Automatic redial");}
				case 2 -> {System.out.print("Speed dialing");}
				case 3 -> {System.out.print("Call waiting options");}
				case 4 -> {System.out.print("Own number sending");}
				case 5 -> {System.out.print("Phone line in use");}
				case 6 -> {System.out.print("Automatic answer");}
				case 0 -> callSettingGoing = false;
				}

				}

			}

			case 2 -> {String phoneSetting = """
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
				int phoneSettingMenu = scanner.nextInt();

				switch(phoneSettingMenu){
				case 1 -> {System.out.print("Language");}
				case 2 -> {System.out.print("Cell info display");}
				case 3 -> {System.out.print("Welcome note");}
				case 4 -> {System.out.print("Network selection");}
				case 5 -> {System.out.print("Lights");}
				case 6 -> {System.out.print("Confirm SIM service actions");}
				case 0 -> phoneSettingGoing = false;
				}

				}
			}
			case 3 -> {String securitySetting = """
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
				int securitySettingMenu = scanner.nextInt();

				switch(securitySettingMenu){
				case 1 -> {System.out.print("Pin code request");}
				case 2 -> {System.out.print("Call barring service");}
				case 3 -> {System.out.print("Fixed dialing");}
				case 4 -> {System.out.print("Closed user group");}
				case 5 -> {System.out.print("Phone security");}
				case 6 -> {System.out.print("Change access codes");}
				case 0 -> securitySettingGoing = false;
				}

				}

			}

			case 4 -> {System.out.print("Restore Factory Settings");}
			case 0 -> settingGoing = false;
			}				
			}
		}

		case 7 -> {System.out.print("Call Divert");}
		case 8 -> {System.out.print("Games");}
		case 9 -> {System.out.print("Call Register");}
		case 10 -> {System.out.print("Remainders");}
		case 11 -> {String clock = """
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
			int clockMenu = scanner.nextInt();
			switch(clockMenu){
			case 1 -> {System.out.print("Alarm clock");}
			case 2 -> {System.out.print(" Clock settings");}
			case 3 -> {System.out.print(" Date setting");}
			case 4 -> {System.out.print("Stopwatch");}
			case 5 -> {System.out.print("Countdown timer");}
			case 6 -> {System.out.print("Auto update of date and time");}
			case 0 -> clockGoing = false;
			}		
			}
		}

		case 12 -> {System.out.print("Profiles");}
		case 13 -> {System.out.print("Sim services");}
		case 0 -> menuForward = false;




		}
		}		


	}
}