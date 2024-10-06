} import java.util.*;  class javatictactoe { static String[] ticTacBoard; static String player; static String findWinner(){
  for (int i = 0; i < 8; i++) { String Gap = null;         	switch (i) { case 0:
Gap = ticTacBoard[0] + ticTacBoard[1] + ticTacBoard[2]; break; case 1:
Gap = ticTacBoard[3] + ticTacBoard[4] + ticTacBoard[5]; break; case 2:
Gap = ticTacBoard[6] + ticTacBoard[7] + ticTacBoard[8]; break;
case 3:
Gap = ticTacBoard[0] + ticTacBoard[3] + ticTacBoard[6]; break; case 4:
Gap = ticTacBoard[1] + ticTacBoard[4] + ticTacBoard[7]; break; case 5:
Gap = ticTacBoard[2] + ticTacBoard[5] + ticTacBoard[8]; break; case 6:
Gap = ticTacBoard[0] + ticTacBoard[4] + ticTacBoard[8]; break; case 7:
Gap = ticTacBoard[2] + ticTacBoard[4] + ticTacBoard[6]; break;
} if (Gap.equals("XXX")) { return "X";
}
else if (Gap.equals("OOO")) { return "O";
} }
for (int i = 0; i < 9; i++) { if (Arrays.asList(ticTacBoard).contains( String.valueOf(i + 1))) { break;
} else if (i == 8) {
return "draw";
}
}
System.out.println(player +"'s chance; Please choose a place "+ player + ":"); return null;
} static void printticTacBoard()
{
System.out.println("|---|---|---|");
System.out.println("| " + ticTacBoard[0] + " | "
+ ticTacBoard[1] + " | " + ticTacBoard[2]
+ " |");
System.out.println("|-----------|");
System.out.println("| " + ticTacBoard[3] + " | "
+ ticTacBoard[4] + " | " + ticTacBoard[5]
+ " |");
System.out.println("|-----------|");
System.out.println("| " + ticTacBoard[6] + " | "
+ ticTacBoard[7] + " | " + ticTacBoard[8]
+ " |");
System.out.println("|---|---|---|");
}
/**
 * @param args
 */ public static void main(String[] args)
{
Scanner input = new Scanner(System.in); ticTacBoard = new String[9]; player = "X";
String champion = null;
for (int i = 0; i < 9; i++) { ticTacBoard[i] = String.valueOf(i + 1);
}
System.out.println("Welcome players to 3x3 TicTacToe Game."); printticTacBoard();
System.out.println(
"X will go first, choose a place to put X in:");
while (champion == null) { int numInput;
try { numInput = input.nextInt(); if (!(numInput > 0 && numInput <= 9)) {
System.out.println(
"Invalid position, please choose a diffrent place:"); continue;
}
}
catch (InputMismatchException e) {
System.out.println(
"Invalid position, please choose a diffrent place:"); continue;
}
if (ticTacBoard[numInput - 1].equals(
String.valueOf(numInput))) {
ticTacBoard[numInput - 1] = player;
if (player.equals("X")) { player = "O";
} else { player = "X";
}
printticTacBoard(); champion = findWinner();
} else {
System.out.println(
"Place is already acquired, please choose a diffrent place:");
}
}
if (champion.equalsIgnoreCase("draw")) {
System.out.println(
"It was a hard match! None of You won...... Thanks for playing.");
}
else {
System.out.println(
"Congo! " + champion
+ " is the Champion! Thanks for playing.");
} input.close();

}
