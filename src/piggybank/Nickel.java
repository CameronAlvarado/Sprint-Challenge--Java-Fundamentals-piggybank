package piggybank;

public class Nickel extends Coins
{

	public Nickel()
	{
		this.value = 0.05;
	}

	@Override
	public int newCoin(int coin)
	{
		return count + coin;
	}
	@Override
	public Integer getCount()
	{
		return this.count;
	}
}