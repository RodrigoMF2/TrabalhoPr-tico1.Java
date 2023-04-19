public class Main {
    public static void main(String[] args) {

        Robot robot = new Robot("N",0,0);

        //muda para a esquerda pos:W
        robot.turnLeft();
        System.out.println(robot.getDirection());

        //muda para a direita pos:N
        System.out.println("---------------------------------------------------------------");
        robot.turnRight();
        System.out.println(robot.getDirection());

        //move uma posicao para norte ou seja 1 valor no eixo y
        System.out.println("---------------------------------------------------------------");
        robot.move();
        System.out.println(robot.getLocation());

        //muda para a direita pos:E
        System.out.println("---------------------------------------------------------------");
        robot.turnRight();
        System.out.println(robot.getDirection());

        //move uma posicao para este ou seja 1 valor no eixo x
        System.out.println("---------------------------------------------------------------");
        robot.move();
        System.out.println(robot.getLocation());

        //muda para a direita pos:S e volta uma posicao no eixo y
        System.out.println("---------------------------------------------------------------");
        robot.turnRight();
        System.out.println(robot.getDirection());
        robot.move();
        System.out.println(robot.getLocation());

        //muda para a direita pos:W e volta uma posicao no eixo x
        System.out.println("---------------------------------------------------------------");
        robot.turnRight();
        System.out.println(robot.getDirection());
        robot.move();
        System.out.println(robot.getLocation());


    }
}