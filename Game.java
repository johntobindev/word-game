import static java.lang.System.out;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Game {
  private final Set<String> DIFFICULTIES = Set.of(
    "EASY",
    "MEDIUM",
    "HARD"
  );
  private String difficulty;
  private int score = 0;
  private List<Word> words;

  public void startGame() {
    Scanner scanner = new Scanner(System.in);
    out.println("#############################################################");
    out.println("################### Welcome to WORD GAME! ###################");
    out.println("#############################################################");
    out.println("> You will be given the definition of 10 different words.");
    out.println("> You will be given the first letter and length of each word.");
    out.println("> All you have to do is guess the word.");
    out.println();
    this.setDifficulty(scanner);
    out.printf("You have chosen %s. Good luck!%n", this.difficulty);
    this.askQuestions(scanner);

    out.println();
    out.println("           .------------------------------------.");
    out.printf("           |  Your final score is %d out of 10" + (this.score < 10 ? " ": "") + "  |%n", this.score);

    switch (this.score) {
      case 10:
        out.println("           |  Incredible! A perfect score!      |");
        break;
      case 9:
      case 8:
        out.println("           |  Wow, great work!                  |");
        break;
      case 7:
      case 6:
        out.println("           |  Very good!                        |");
        break;
      case 5:
      case 4:
        out.println("           |  Some room for improvement!        |");
        break;
      case 3:
      case 2:
        out.println("           |  A lot of room for improvement!    |");
        break;
      case 1:
        out.println("           |  Not a total failure!              |");
        break;
      default:
        out.println("           |  A total failure!                  |");
    }

    out.println("           *------------------------------------*");
    out.println();
    out.println("#############################################################");
    out.println("#################### Thanks for playing! ####################");
    out.println("#############################################################");
    scanner.close();
  }

  private void setDifficulty(Scanner scanner) {
    String chooseString = "Please choose a difficulty (EASY, MEDIUM, HARD): ";

    out.print(chooseString);
    difficulty = scanner.nextLine().toUpperCase();

    while (!this.DIFFICULTIES.contains(difficulty)) {
      out.printf("\"%s\" is not a valid difficulty.%n", difficulty);
      out.print(chooseString);
      difficulty = scanner.nextLine();
    }

    this.words = Words.getWords(difficulty);
  }

  private void askQuestions(Scanner scanner) {
    for (int i = 0; i < this.words.size(); i++) {
      Word word = this.words.get(i);
      out.printf("%n>>>>>>>>>>>>>>>>>>>>>>>>>> WORD #%d <<<<<<<<<<<<<<<<<<<<<<<<<" + (i < 9 ? "<" : "") + "%n", i + 1);
      out.println(word.getDefinition());

      for (int j = 0; j < word.getWord().length(); j++) {
        if (j == 0) out.print(word.getWord().substring(0, 1).toUpperCase() + " ");
        else out.print("_ ");
      }

      out.printf("(%d letters)", word.getWord().length());
      out.println();
      out.print("Answer: ");
      String answer = scanner.nextLine();

      if (answer.equalsIgnoreCase(word.getWord())) {
        this.score++;
        out.print("CORRECT!");
      } else {
        out.printf("INCORRECT! The correct answer is \"%s\"", word.getWord());
      }

      if (i < this.words.size() - 1) {
        out.print(" (Press Enter for next question)");
        scanner.nextLine();
      } else {
        out.print(" (Press Enter to see your final score)");
        scanner.nextLine();
      }
    }
  }
}
