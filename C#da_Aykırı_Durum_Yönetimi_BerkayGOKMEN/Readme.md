
try catch ifadesi ->
```sh
try 
{
	//
}
catch (Exception e1)
{
	// 
}

finally
{
	//
}
```

if_else_throw_new ifadeleri ->
```sh
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
```

try_catch_threw_new ifadeleri ->
```sh
int GetInt(int[], int index)
{
	try
	{
		return array[index];
	}
	catch (IndexOutOfRangeException) when (index < 0)
	{
		throw new ArgumentException("Parameter index cannot be negative", e);
	}
	catch (IndexOutOfRangeException e)
	{
		throw new ArgumentOutOfRangeException("Parameter index cannot be greater than the array size ",e)
	}
}
```



checked_var ifadeleri ->
```sh
//checked expression
Console.WriteLine(checked(2147483647+ ten));

//checked block
checked
{
	int i3 = 2147483647 + ten;
	Console.WriteLine(i3);
}


static void Main(string[] args)
(
	int i = 10;
	var x = 10;
)
```