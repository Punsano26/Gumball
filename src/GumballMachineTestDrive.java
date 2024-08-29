
public class GumballMachineTestDrive {
	public static void main(String[] args) {
		
		GumballMachine gumballMachine = new GumballMachine(5);
		gumballMachine.ejectQuarter();
		gumballMachine.insertQuarter();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
	}
}
