package piggybank;

import java.text.DecimalFormat;

public abstract class Coins
{
	DecimalFormat fp = new DecimalFormat("$###,###.00");
	protected int count = 0;
	protected double value = 0;

	public Coins(int count)
	{
		this.count = this.count + count;
		// this.value = value;
	}

	public Coins()
	{
		this.count = count + 1;
	}


	public double getTotal()
	{
		return this.count * this.value;
	}

	public void setCount(int count)
	{
		this.count = this.count + count;
	}

	public String printValue(double value)
	{
		return "The piggy bank holds " + fp.format(value);
	}

	public Double getValue()
	{
		return this.value;
	}

	// public Double getTotal()
	// {
	// 	return value * this.count;
	// }	

	// public int addCoin()
	// {
	// 	return this.count + 1;
	// }

	// public void addValue(double val)
	// {
	// 	this.value = value + val;
	// }

	// public abstract int newCoin(int coin);
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