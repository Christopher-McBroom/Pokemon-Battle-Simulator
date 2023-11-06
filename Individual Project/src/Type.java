
public class Type
	{

		private String name;
		private String weaknesses;
		private String resistances;
		
		public Type(String n,String w, String r)
		{

			name = n;
			weaknesses = w;
			resistances = r;
			
		}
		
		public String getName()
			{
				return name;
			}
		
		public String getWeaknesses()
			{
				return weaknesses;
			}
		
		public String getResistances()
			{
				return resistances;
			}
	
		public void setName(String name)
	        {
	        this.name = name;
	        }
		
	    public void setWeaknesses(String weaknesses)
	        {
	        this.weaknesses = weaknesses;
	        }
		
	    public void setResistances(String resistances)
	        {
	        this.resistances = resistances;
	        }
	}
