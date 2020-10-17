package revJavaClass2;

public class NestedIfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Asghar";
		String pass = "pass123";
		double accountBalance = 10.25;
		double transferAmount = 8;
		boolean transAllowed = true;
		if (pass.equals("pass123")) {
			System.out.println("Welcome to Syntax bank " +name);
			if (transAllowed) {
			System.out.println("Innitiating Transfer");

			if(transferAmount>accountBalance) {
			System.out.println("Insufficent Balance");

			}else {
			System.out.println("Transfer Complete");
	
					
				}
			
			} else {
			System.out.println("You are not allowed to transfer");

			}
		} else {
		 System.out.println("Invalid Credentials please try again");

		}
		
	}

}
