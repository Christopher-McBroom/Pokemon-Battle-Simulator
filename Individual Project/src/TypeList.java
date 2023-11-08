import java.util.ArrayList;

public class TypeList
	{

		 static ArrayList<Type> typeList = new ArrayList<Type>();

		    public static void fillTypes()
		        {
		        typeList.add(new Type("Grass", "Fire", "Grass"));
		        typeList.add(new Type("Fire", "Water", "Fire"));
		        typeList.add(new Type("Water", "Grass", "Water"));
		      
		        }
}