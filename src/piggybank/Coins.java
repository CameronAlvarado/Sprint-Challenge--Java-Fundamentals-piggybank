package piggybank;

public abstract class Coins
{
	protected int count = 1;
	protected double value = 0;

	public Coins(int count)
	{
		this.count = count;
	}

	public Coins()
	{
		this.count = this.count + 1;
	}

	public abstract Integer getCount();

	public void setCount(int count)
	{
		this.count = this.count + count;
	}

	public Double getValue()
	{
		return this.value;
	}

	public Double getTotal()
	{
		return value * this.count;
	}	

	public int addCoin()
	{
		return this.count + 1;
	}

	// public void addValue(double val)
	// {
	// 	this.value = value + val;
	// }

	public abstract int newCoin(int coin);
	// public Double newDime(int coin)
	// {
	// 	addCoin(coin);
	// 	return this.value + 0.10;
	// }

	// public Double newDollar(int coin)
	// {
	// 	addCoin(coin);
	// 	return this.value + 1;
	// }

	// public Double newNickel(int coin)
	// {
	// 	addCoin(coin);
	// 	return this.value + 0.05;
	// }

	// public Double newPenny(int coin)
	// {
	// 	addCoin(coin);
	// 	return this.value + 0.01;
	// }
}