package piggybank;

public class Dollar extends Coins
{

	public Dollar(int count)
	{
		this.value = 1.0;
		this.count = count;
	}

	public Dollar()
	{
		this.value = 1.0;
		this.count = 1;
	}

	// @Override
	// public double getTotal()
	// {
	// 	return this.count * this.value;
	// }

	@Override
	public String toString()
 	{
        return "$" + count;
    }
}