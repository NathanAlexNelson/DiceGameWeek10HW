public class DiceRolls {
	private int dice;

	public DiceRolls(int Amount){
		dice = Amount;
	}
	
	public int getDice()
	{
		return dice;
	}
	
	public int DiceNum(int Amount)
	{
		int randomNumber = 1 + (int) (Math.random() * 6*dice);
		return randomNumber;
	}
}
