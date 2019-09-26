public class Testing {

	public static void main(String[] args) { //code bellow is what allows the code in the other log to work and pour out an amount 
		// TODO Auto-generated method stub
		System.out.println("Hello world!");
		kettle Bradley = new kettle ("chrome", "dunno", 500);
		System.out.println(Bradley);
		Bradley.fillup(100);
		System.out.println(Bradley);
		Bradley.pour(50);
		System.out.println(Bradley);
		Bradley.pour(50);
		System.out.println(Bradley);
		Bradley.pour(50);
		Bradley.fillup(250);
		System.out.println(Bradley);
		Bradley.fillup(250);
		System.out.println(Bradley);
		Bradley.fillup(10);
	}

}

public class kettle { //allows you to input the information about the kettle
	String color;
	String manufacturer;
	int maxCapacity;
	int currentCapacity;
	
	public kettle(String c, String m, int mc) { //this allows you to input the details of the colour, manufacturer, maxCapacity, currentCapacity.
		System.out.println("A new kettle has been created");
		this.color = c;
		this.manufacturer = m;
		this.maxCapacity = mc;
		this.currentCapacity = 0;
	}
	public void fillup(int amount) {  //this allows you to fill up by a certain amount
		if (currentCapacity + amount <= maxCapacity) {  //this adds the current amount and the amount together to get a total and if its over a certain amount which is 500 in our case it will return imput as kettle has reached it limit 
		currentCapacity += amount;
	} else {
		System.out.println("kettle har reached max capacity");
	}
	}
	public String toString() {
		return color + " " + currentCapacity+"/"+ maxCapacity; //returns the amount that is left after adding the current amount 
	}
	public void pour(int amount) { //allows the person to pour and empty the kettle without pouring too much
		if(currentCapacity >= 50) {
		currentCapacity -= amount;
	} else {
		System.out.println("not enough water for a cup of tea"); //returns if the amount that has emptied has reached empty 
	}	
	}
}
