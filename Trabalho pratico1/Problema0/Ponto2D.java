public class Ponto2D {
    //
    private int x, y;
    //
    public Ponto2D(int cx, int cy) { x = cx; y = cy; }
    public Ponto2D(){ this(0, 0); }

    //
    public int getX() { return x; }
    public int getY() { return y; }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void desloca(int dx, int dy) {
        x += dx; y += dy;
    }
    public void somaPonto(Ponto2D p) {
        x += p.getX(); y += p.getY();
    }
    public Ponto2D somaPonto(int dx, int dy) {
        return new Ponto2D(x += dx, y+= dy);
    }
    public String toString() {
        return new String("Pt = " + x + ", " + y);
    }

    public Ponto2D clone() {
        return new Ponto2D(x, y);
    }
}