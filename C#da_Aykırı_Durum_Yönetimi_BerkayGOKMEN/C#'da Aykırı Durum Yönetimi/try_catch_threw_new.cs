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