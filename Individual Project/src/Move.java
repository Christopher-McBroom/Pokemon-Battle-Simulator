
public class Move
	{

		private String name;
		private Type type;
		private int power;
		private int accuracy;
		
		public Move(String n, Type t, int p, int a)
		{
			name = n;
			type = t;
			power = p;
			accuracy =a;	
		}
		
		public String getName()
		{
			return name;
		}
		
		public Type getType()
			{
				return type;
			}
		
		public int getPower()
			{
				return power;
			}
		
		public int getAccuracy()
			{
				return accuracy;
			}
		
		  public void setName(String name)
		        {
		        this.name = name;
		        }
		
		  public void setType(Type type)
		        {
		        this.type = type;
		        }
		  
		  public void setPower(int power)
		        {
		        this.power = power;
		        }
		  
		  public void setAccuracy(int accuracy)
		        {
		        this.accuracy = accuracy;
		        }
	}
