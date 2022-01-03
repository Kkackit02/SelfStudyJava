package quiz_202112346;



abstract class ProgrammingLang {

	protected String name;
	
	public ProgrammingLang(String name)
	{
		this.name = name;
	}
	
	abstract void describe();
}

class ProceduralLang extends ProgrammingLang
{
	public ProceduralLang(String name)
	{
		super(name);
	}
	
	void describe()
	{
		System.out.println(name + " is a procedural language.");
	}
}

class ObjectOrientedLang extends ProgrammingLang
{
	public ObjectOrientedLang(String name)
	{
		super(name);
	}
	
	void describe()
	{
		System.out.println(name + " is a object-oriented language.");
	}
}

class ScriptLang extends ProgrammingLang
{
	public ScriptLang(String name)
	{
		super(name);
	}
	
	void describe()
	{
		System.out.println(name + " is a script language.");
	}
}



