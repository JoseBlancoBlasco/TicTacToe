
import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Definicion del tablero
        char[][] tablero = {
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '}
        };
        
        boolean turno;

        /*Guia Visual Indices Jugables
            [0,0],[0,2],[0,4]
            [2,0],[2,2],[2,4]
            [4,0],[4,2],[4,4]
         */
        mostrarTablero(tablero);

        while (true) {
            turno=true;
            mostrarTurno(turno);
            System.out.print("Introduce la posicion (1-9): ");
            int posicionJugador1 = scan.nextInt();
            ponerFicha(tablero, posicionJugador1, "Jugador 1");
            mostrarTablero(tablero);            
            //comprobarGanador();            
                        
            turno=false;
            mostrarTurno(turno);
            System.out.print("Introduce la posicion (1-9): ");
            int posicionJugador2 = scan.nextInt();
            ponerFicha(tablero, posicionJugador2, "Jugador 2");
            mostrarTablero(tablero);
            //comprobarGanador();
        }

    }

    public static void mostrarTablero(char[][] tablero) {
        for (char[] fila : tablero) {
            for (char c : fila) {
                System.out.print(c);
            }
            System.out.println("");
        }
    }

    public static void ponerFicha(char[][] tablero, int posicion, String jugador) {

        char ficha;
        if (jugador.equals("Jugador 1")) {
            ficha = 'X';
        } else {
            ficha = 'O';
        }

        switch (posicion) {
            case 1:
                tablero[0][0] = ficha;
                break;
            case 2:
                tablero[0][2] = ficha;
                break;
            case 3:
                tablero[0][4] = ficha;
                break;
            case 4:
                tablero[2][0] = ficha;
                break;
            case 5:
                tablero[2][2] = ficha;
                break;
            case 6:
                tablero[2][4] = ficha;
                break;
            case 7:
                tablero[4][0] = ficha;
                break;
            case 8:
                tablero[4][2] = ficha;
                break;
            case 9:
                tablero[4][4] = ficha;
                break;
            default:
                break;
        }
    }

    public static void mostrarTurno(boolean turno) {
        
        if (turno) {
            System.out.println("Turno del Jugador 1.");
        } else {
            System.out.println("Turno del Jugador 2.");
        }

    }
    
    public static String comprobarGanador(){
        return "";
    }

}
