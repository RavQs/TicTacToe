import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},     //Игровое поле
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};

        gameBoard(gameBoard);

        System.out.println("Enter your placement(1-9): ");
        int userPos = scan.nextInt();

        if (userPos < 1 || userPos > 9){
            throw new Exception("Please, enter correct placement");
        }

        placePiece(gameBoard, userPos, "Player");

        Random rand = new Random();
        int cpuPos = rand.nextInt(9) + 1;

        placePiece(gameBoard, cpuPos, "CPU");

        gameBoard(gameBoard);


    }

    public static void gameBoard(char[] [] gameBoard){     //Вывод поля на экран
        for(char[] row : gameBoard){
            for(char c : row){
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void placePiece(char[] [] gameBoard,int pos, String user){ //Зарисовывание поля
        char symbol = ' ';
        if(user.equals("Player"))
            symbol = 'X';
        else if (user.equals("CPU")){
            symbol = 'O';
        }

        switch (pos){
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
        }
    }

}
