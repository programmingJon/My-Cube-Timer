package scrambler;

import java.util.Random;

public class ScrambleGenerator {

	Random rand;
	int noOfSides;
	private StringBuilder generatedScramble;
	int lastIndex;
	
	static String[] moves = {"F", "B", "L", "R", "U", "D"};
	static String[] modifiers = {"", "'", "2"};
	static Integer[][] compatibleMoves; // = {
	
	public ScrambleGenerator(int noOfSides){
		this.noOfSides = noOfSides;
		rand = new Random();
		lastIndex = this.noOfSides + 1;
		this.generatedScramble = new StringBuilder();
	}
	
	public static void main(String[] args){
		
		ScrambleGenerator sg = new ScrambleGenerator(6);
		sg.generateLength(8);
		
	}
	
	public void generateLength(int length){

		for (int generatedLength = 0; generatedLength < length; generatedLength++){
			getGeneratedScramble().append(this.generateMove()).append(this.generateModifier()).append(" ");
		}
	}
	
	public String generateMove(){
		
		int index = rand.nextInt(noOfSides - 1);
		if (index < lastIndex){
			lastIndex = index;
			return moves[index];
		} else {
			lastIndex = index + 1;
			return moves[index + 1];
		}
		
	}
	
	public String generateModifier(){
		return modifiers[rand.nextInt(modifiers.length)];
	}

	public StringBuilder getGeneratedScramble() {
		return generatedScramble;
	}
	
}
