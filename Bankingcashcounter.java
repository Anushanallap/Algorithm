package Algorithm;

class Bankingcashcounter {

	int total = 1000;

	// Money withdrawal method. Withdraw only if
	// total money greater than or equal to the money
	// requested for withdrawal

	// Method
	// To withdraw money
	void withdrawn(String name, int withdrawal)
	{
		if (total >= withdrawal) {
			System.out.println(name + " withdrawn "
							+ withdrawal);

			total = total - withdrawal;
			System.out.println("Balance after withdrawal: "
							+ total);
			// Making the thread sleep for 1 second after
			// each withdrawal

			// Try block to check for exceptions
			try {

				// Making thread to sleep for 1 second
				Thread.sleep(1000);
			}

			// Catch block to handle the exceptions
			catch (InterruptedException e) {

				// Display the exception along with line
				// number
				// using printStacktrace() method
				e.printStackTrace();
			}
		}

		// If the money requested for withdrawal is greater
		// than the balance then deny transaction*/
		else {

			// Print statements
			System.out.println(name
							+ " you can not withdraw "
							+ withdrawal);

			System.out.println("your balance is: " + total);

			// Making the thread sleep for 1 second after
			// each transaction failure

			// Try block to check for exceptions
			try {
				Thread.sleep(1000);
			}

			catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

	// Method - to deposit money
	// Accept money whenever deposited
	void deposit(String name, int deposit)
	{
		System.out.println(name + " deposited " + deposit);
		total = total + deposit;
		System.out.println("Balance after deposit: "
						+ total);
		// Making the thread sleep for 1 second after
		// each deposit
		try {
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args)
	{
		// Declaring an object of Bank class and calling the
		// withdrawn and deposit methods with suitable
		// parameters

		Bankingcashcounter obj = new Bankingcashcounter();

		// Custom input - Transactions
		obj.withdrawn("joseph", 200);
		obj.withdrawn("jhonney", 450);
		obj.deposit("mark", 535);
		obj.withdrawn("martin", 880);
		obj.withdrawn("steve", 400);
	}
}
