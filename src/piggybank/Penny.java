package piggybank;

public class Penny extends Coins
{

	public Penny()
	{
		this.value = 0.01;
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