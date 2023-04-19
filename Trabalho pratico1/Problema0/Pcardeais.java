import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Objects;

public enum Pcardeais {
    N("N"),
    E("E"),
    S("S"),
    W("W");

    private String direction;

    Pcardeais(String direction) {
                this.direction = direction;
            }



    public void setDirection(String direction) {
        ArrayList<Pcardeais>list = new ArrayList<Pcardeais>(EnumSet.allOf(Pcardeais.class));
        for (Pcardeais pcardeais : list)
            if (Objects.equals(direction, pcardeais.name())) {
                this.direction = direction;
                break;
            }

    }

    public String getDirection() {
        return direction;
    }
}

