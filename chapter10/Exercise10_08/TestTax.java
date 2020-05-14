package chapter10.Exercise10_08;

public class TestTax {

	public static void main(String[] args) {
		Tax t1 = new Tax();
		Tax t2 = new Tax();

		double[] r1 = { 15, 27.5, 30.5, 35.5, 39.1 };
		int[][] b1 = { 
				{ 27050, 65550, 136750, 297350 }, 
				{ 45200, 109250, 166500, 297350 },
				{ 22600, 54625, 83250, 148675 }, 
				{ 36250, 93650, 151650, 297350 } };
		
		t1.setRates(r1);
		t1.setBrackets(b1);

		double begin = 50_000;
		double end = 60_000;
		double i = 1_000;

		System.out.println("\n\t2001 tax tables for taxable income from $" + begin + " to $" + end);
		print(t1, begin, end, i);

		System.out.println("\n\t2009 tax tables for taxable income from $" + begin + " to $" + end);
		print(t2, begin, end, i);

	}

	public static void print(Tax tax, double from, double to, double interval) {
		System.out.println(
				"\nTaxable         Single        Married Joint            Married          Head of"
			  + "\nIncome                        or Qualifying            Separate         a House\n");

		for (double taxableIncome = from; taxableIncome <= to; taxableIncome += interval) {
			tax.setTaxableIncome(taxableIncome);
			System.out.printf("%-15.0f", taxableIncome);
			
			tax.setFilingStatus(Tax.SINGLE_FILER);
			System.out.printf("%10.2f", tax.getTax());
			
			tax.setFilingStatus(Tax.MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER);
			System.out.printf("%17.2f", tax.getTax());
			
			tax.setFilingStatus(Tax.MARRIED_SEPARATELY);
			System.out.printf("%20.2f", tax.getTax());
			
			tax.setFilingStatus(Tax.HEAD_OF_HOUSEHOLD);
			System.out.printf("%17.2f\n", tax.getTax());
		}
	}
}