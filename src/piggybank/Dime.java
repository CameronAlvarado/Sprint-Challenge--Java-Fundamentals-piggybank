package piggybank;

public class Dime extends Coins
{

	public Dime()
	{
		this.value = 0.10;
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