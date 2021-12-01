
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

        char[][] tableroMuestra = {
            {'1', '|', '2', '|', '3'},
            {'-', '+', '-', '+', '-'},
            {'4', '|', '5', '|', '6'},
            {'-', '+', '-', '+', '-'},
            {'7', '|', '8', '|', '9'}
        };

        //Creo un string para ir guardando las posiciones
        String devolverOcupadas = "";
        boolean turno = true;

        /*Guia Visual Indices Jugables
            [0,0],[0,2],[0,4]
            [2,0],[2,2],[2,4]
            [4,0],[4,2],[4,4]
         */
        mostrarTablero(tableroMuestra);

        while (true) {
            if (turno) {
                mostrarTurno(turno);
                System.out.print("Introduce la posicion (1-9): ");
                int posicionJugador1 = scan.nextInt();
                ponerFicha(tableroMuestra, posicionJugador1, "Jugador 1", devolverOcupadas);
                comprobarPosicion(devolverOcupadas, tableroMuestra, posicionJugador1, scan);
                mostrarTablero(tableroMuestra);
                turno = false;
                //comprobarGanador();            
            } else {
                mostrarTurno(turno);
                System.out.print("Introduce la posicion (1-9): ");
                int posicionJugador2 = scan.nextInt();
                ponerFicha(tableroMuestra, posicionJugador2, "Jugador 2", devolverOcupadas);
                comprobarPosicion(devolverOcupadas, tableroMuestra, posicionJugador2, scan);
                mostrarTablero(tableroMuestra);
                turno = true;
                //comprobarGanador();
            }
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

    public static String ponerFicha(char[][] tablero, int posicion, String jugador, String devolverOcupadas) {

        char ficha;
        if (jugador.equals("Jugador 1")) {
            ficha = 'X';
        } else {
            ficha = 'O';
        }

        switch (posicion) {
            case 1:
                tablero[0][0] = ficha;
                devolverOcupadas += posicion;
                break;
            case 2:
                tablero[0][2] = ficha;
                devolverOcupadas += posicion;
                break;
            case 3:
                tablero[0][4] = ficha;
                devolverOcupadas += posicion;
                break;
            case 4:
                tablero[2][0] = ficha;
                devolverOcupadas += posicion;
                break;
            case 5:
                tablero[2][2] = ficha;
                devolverOcupadas += posicion;
                break;
            case 6:
                tablero[2][4] = ficha;
                devolverOcupadas += posicion;
                break;
            case 7:
                tablero[4][0] = ficha;
                devolverOcupadas += posicion;
                break;
            case 8:
                tablero[4][2] = ficha;
                devolverOcupadas += posicion;
                break;
            case 9:
                tablero[4][4] = ficha;
                devolverOcupadas += posicion;
                break;
            default:
                break;
        }
        return devolverOcupadas;
    }

    public static boolean mostrarTurno(boolean turno) {

        if (turno) {
            System.out.println("Turno del Jugador 1.");
            return turno = true;
        } else {
            System.out.println("Turno del Jugador 2.");
            return turno = false;
        }

    }

    public static int comprobarPosicion(String devolverPosicion, char[][] tableroMuestra, int posicion, Scanner scan) {
        boolean salida;
        //Convierto a string la posicion para poder buscarla
        String posicionChar = String.valueOf(posicion);
        do {
            if (devolverPosicion.contains(posicionChar)) {
                System.out.println("Vuelve a introducir posicion, esa ya esta ocupada.");
                posicion=scan.nextInt();
            } else {
                salida = false;
            }

        } while (salida = true);
        return posicion;
    }

}
