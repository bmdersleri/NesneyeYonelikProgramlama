static void checkAge(int age)
{
	if(age < 18)
	{
		throw new ArithmeticException("Acces denied - You must be at least 18 years old");
	}
	else
	{
		Console.WriteLine("Acces granted - You are old enough!")
	}
}
static void Main(string[] args)
{
	checkAge(15);
}