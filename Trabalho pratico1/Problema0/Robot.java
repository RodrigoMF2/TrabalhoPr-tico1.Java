public class Robot {
    Pcardeais direction;
    Ponto2D location = new Ponto2D(0,0);

    public Robot(String direction, int x, int y){
        this.direction = Pcardeais.valueOf(direction);
        this.location.setX(x);
        this.location.setY(y);
    }
    public Ponto2D getLocation() {
        return location;
    }

    public void turnLeft(){
        String aux = direction.getDirection();
        switch (aux) {
            case "N" -> direction = Pcardeais.valueOf("W");
            case "W" -> direction = Pcardeais.valueOf("S");
            case "S" -> direction = Pcardeais.valueOf("E");
            case "E" -> direction = Pcardeais.valueOf("N");
        }
    }

    public void turnRight(){
        String aux = direction.getDirection();
        switch (aux) {
            case "N" -> direction = Pcardeais.valueOf("E");
            case "W" -> direction = Pcardeais.valueOf("N");
            case "S" -> direction = Pcardeais.valueOf("W");
            case "E" -> direction = Pcardeais.valueOf("S");
        }
    }

    public void move() {
        String aux = direction.getDirection();
        int x = location.getX();
        int y = location.getY();
        switch (aux) {
            case "N" -> location.setY(y + 1);
            case "W" -> location.setX(x - 1);
            case "S" -> location.setY(y - 1);
            case "E" -> location.setX(x + 1);
        }
    }

    public String getDirection() {
        return String.valueOf(direction);
    }

    @Override
    public String toString() {
        return "Robot{" +
                "direction=" + direction +
                ", location=" + location +
                '}';
    }
}
