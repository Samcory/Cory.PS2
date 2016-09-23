package base;


public class MyInteger {
	private int value; //encapsulate
	
	public MyInteger(int iValue){
		value = iValue;}
	
	public int getInt(){	//get method
		return value;}
	
	//methods isEven(), isOdd(), isPrime()
	public boolean isEven(){
		return (value % 2 == 0);}	
	
	public boolean isOdd(){
		return (value % 2 != 0);} 
	
	public boolean isPrime(){
		if (value == 2)
			return true;
		//if value is 2 its prime otherwise it must have a remainder to be prime
		for(int i=2; i<value; i++){
			if (value % i == 0)
				return false;}
		return true;
	}
	
	
	//Static methods isEven(int), isOdd(int), and isPrime(int)
	public static boolean isEven(int value){
		return (value % 2 == 0);
	}
	
	public static boolean isOdd(int value){
		return (value % 2 != 0);}
	
	public static boolean isPrime(int value){
		if (value == 2)
			return true;
		for(int i=2; i<value; i++){
			if (value % i == 0)
				return false;}
		return true;}
	
	//Static methods isEven(MyInteger), isOdd(MyInteger), and isPrime(MyInteger)
	public boolean isEven(MyInteger iValue){
		return (iValue.getInt() % 2 == 0);}
	
	public boolean isOdd(MyInteger iValue){
		return (iValue.getInt() % 2 != 0);}
	
	public boolean isPrime(MyInteger iValue){
		if (iValue.getInt() == 2)
			return true;
		for(int i=2; i<iValue.getInt(); i++){
			if (iValue.getInt() % i == 0)
				return false;}
		return true;}
	
	//Methods equals(int) and equals(MyInteger
	public boolean equals(int value){
		return(this.value == value);}
	public boolean equals(MyInteger value){
		return(this.value == value.getInt());
	}
}
