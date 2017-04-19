package com.anothersava.nitka;

public class Pyramid
{
	public double W (int row, int pos)
	{
		double prevRow [] = new double[1], currentRow [];
		for(int r = 1; r <= row; r++)
		{
			currentRow = new double[r + 1];
			for (int p = 0; p <= r; p++)
			{
				double weightLeft = 0;
				if (p > 0)
					weightLeft = (prevRow[p - 1] + 1) / 2;

				double weightRight = 0;
				if (p < r)
					weightRight = (prevRow[p] + 1) / 2;

				currentRow[p] = weightLeft + weightRight;
			}
			prevRow = currentRow;
		}
		return prevRow[pos];
	}
}
