package piggybank;

public class Quarter extends Coins
{

	public Quarter()
	{
		this.value = 0.25;
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