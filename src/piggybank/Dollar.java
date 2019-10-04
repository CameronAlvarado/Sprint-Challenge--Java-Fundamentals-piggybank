package piggybank;

public class Dollar extends Coins
{

	public Dollar()
	{
		this.value = 1.0;
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