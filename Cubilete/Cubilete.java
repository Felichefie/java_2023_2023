import java.util.*;

public class Cubilete {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Random rand = new Random();
            int numPlayers, round = 1;
            boolean playAgain = true;

            System.out.println("Bienvenido a Cubilete");
            System.out.print("Ingrese el número de jugadores: ");
            numPlayers = input.nextInt();

            String[] playerNames = new String[numPlayers];
            int[] playerScores = new int[numPlayers];

            for (int i = 0; i < numPlayers; i++) {
                System.out.print("Ingrese el nombre del jugador " + (i+1) + ": ");
                playerNames[i] = input.next();
            }

            while (playAgain) {
                System.out.println("\nRonda " + round);

                for (int i = 0; i < numPlayers; i++) {
                    System.out.println("\nEs el turno de " + playerNames[i]);

                    int[] dice = new int[5];
                    for (int j = 0; j < 5; j++) {
                        dice[j] = rand.nextInt(6) + 1;
                    }

                    System.out.print("Los dados son: ");
                    for (int d : dice) {
                        System.out.print(d + " ");
                    }

                    playerScores[i] = calculateScore(dice);
                    System.out.println("\nPuntuación de " + playerNames[i] + ": " + playerScores[i]);
                }

                int winnerIndex = determineWinner(playerScores);
                System.out.println("\nEl ganador es: " + playerNames[winnerIndex] + " con una puntuación de " + playerScores[winnerIndex]);

                System.out.print("\n¿Quieres jugar de nuevo? (S/N) ");
                String playAgainInput = input.next().toUpperCase();
                if (playAgainInput.equals("N")) {
                    playAgain = false;
                }

                round++;
            }
        }
        System.out.println("\nGracias por jugar a Cubilete");
    }

    public static int calculateScore(int[] dice) {
        Arrays.sort(dice);
        int score = 0;

        // Combinación de 1's
        int onesCount = countDice(dice, 1);
        if (onesCount >= 3) {
            score += 1000 + (onesCount - 3) * 100;
        } else {
            score += onesCount * 100;
        }

        // Combinación de 2's
        int twosCount = countDice(dice, 2);
        if (twosCount >= 3) {
            score += 200;
        }

        // Combinación de 3's
        int threesCount = countDice(dice, 3);
        if (threesCount >= 3) {
            score += 300;
        }

        // Combinación de 4's
        int foursCount = countDice(dice, 4);
        if (foursCount >= 3) {
            score += 400;
        }

        // Combinación de 5's
        int fivesCount = countDice(dice, 5);
        if (fivesCount >= 3) {
            score += 500 + (fivesCount - 3) * 50;
        } else {
            score += fivesCount * 50;
        }

        // Combinación de 6's
        int sixesCount = countDice(dice, 6);
        if (sixesCount >= 3) {
            score += 600;
        }
    
        // Combinación de Escalera
        if (onesCount == 1 && twosCount == 1 && threesCount == 1 && foursCount == 1 && fivesCount == 1) {
            score += 1000;
        }
    
        // Combinación de Full
        if ((onesCount == 3 || twosCount == 3 || threesCount == 3 || foursCount == 3 || fivesCount == 3 || sixesCount == 3) &&
            (onesCount == 2 || twosCount == 2 || threesCount == 2 || foursCount == 2 || fivesCount == 2 || sixesCount == 2)) {
            score += 1500;
        }
    
        // Combinación de Poker
        if ((onesCount == 4 || twosCount == 4 || threesCount == 4 || foursCount == 4 || fivesCount == 4 || sixesCount == 4)) {
            score += 2000;
        }
    
        // Combinación de Generala
        if ((onesCount == 5 || twosCount == 5 || threesCount == 5 || foursCount == 5 || fivesCount == 5 || sixesCount == 5)) {
            score += 5000;
        }
    
        return score;
    }
    
    public static int countDice(int[] dice, int value) {
        int count = 0;
        for (int d : dice) {
            if (d == value) {
                count++;
            }
        }
        return count;
    }
    
    public static int determineWinner(int[] scores) {
        int winnerIndex = 0;
        int highestScore = scores[0];
    
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > highestScore) {
                highestScore = scores[i];
                winnerIndex = i;
            }
        }
    
        return winnerIndex;
    }
}    

//Este código define la clase `Cubilete`, que implementa el juego de Cubilete. 
//El código utiliza la clase `Scanner` para solicitar información del usuario y 
//la clase `Random` para generar números aleatorios para los dados. 
//El método `calculateScore` se utiliza para calcular la puntuación de un jugador
//para una ronda, mientras que el método `determineWinner` se utiliza para determinar 
//al ganador de una ronda. El programa se ejecuta en un bucle `while` que permite
// a los jugadores jugar múltiples rondas hasta que deciden no jugar más.
