public class Pokemon
	{

		private String name;
		private Type type1;
		private Type type2;
		private Move move1;
		private Move move2;
		private Move move3;
		private Move move4;
		private int hp;
		private int attack;
		private int defense;
		private int speed;
		private int level;

		public Pokemon(String n, Type t1, Type t2, Move m1, Move  m2, Move m3, Move m4, int h, int a, int d, int s, int l)
		{
			name = n;
			type1 = t1;
			type2 = t2;
			move1 = m1;
			move2 = m2;
			move3 = m3;
			move4 = m4;
			hp = h;
			attack = a;
			defense =d;
			speed = s;
			level = l;
		}
		
		public String getName()
			{
				return name;
			}
		
		public Type getType1()
			{
				return type1;
			}
		
		public Type getType2()
			{
				return type2;
			}
		
		public Move getMove1()
			{
				return move1;
			}
		
		public Move getMove2()
			{
				return move2;
			}
		
		public Move getMove3()
			{
				return move3;
			}
		
		public Move getMove4()
			{
				return move4;
			}
		
		public int getHp()
			{
				return hp;
			}
		
		public int getAttack()
			{
				return attack;
			}
		
		public int getDefense()
			{
				return defense;
			}
		
		public int getSpeed()
			{
				return speed;
			}
		
		public int getLevel()
			{
				return level;
			}
		
		public void setName(String name)
		{
			this.name = name;
		}
		
		public void setType1(Type type1)
			{
				this.type1 = type1;
			}
		
		public void setType2(Type type2)
			{
				this.type2 = type2;
			}
		
		public void setMove1(Move move1)
			{
				this.move1 = move1;
			}
		
		public void setMove2(Move move2)
			{
				this.move2 = move2;
			}
		
		public void setMove3(Move move3)
			{
				this.move3 = move3;
			}
		
		public void setMove4(Move move4)
			{
				this.move4 = move4;
			}
		
		public void setHp(int hp)
			{
				this.hp = hp;
			}
		
		public void setAttack(int attack)
			{
				this.attack = attack;
			}
		
		public void setDefense(int defense)
			{
				this.defense = defense;
			}
		
		public void setLevel(int level)
			{
				this.level = level;
			}
		
	}
