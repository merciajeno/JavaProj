
public class WhileLimit {

	private int limit;
	WhileLimit(int limit)
	{
		this.limit=limit;
	}
	
	void Squares()
	{
		int i=1;
		int result=0;
		while(Math.pow(i, 2)<=limit)
		{
			result=(int)Math.pow(i,2);
		    System.out.println(result);
		    i++;
		}
	}
	
	void Cubes()
	{
		int i=1;
	    int result=0;
		while(Math.pow(i, 3)<=limit)
		{
			result=(int)Math.pow(i,3);
			
		System.out.println(result);
		i++;
	    }
	 
	}
}
public class WhileLimitRunner {

	public static void main(String[] args) {
		WhileLimit object=new WhileLimit(90);
      object.Squares();
		object.Cubes();
	}

}

