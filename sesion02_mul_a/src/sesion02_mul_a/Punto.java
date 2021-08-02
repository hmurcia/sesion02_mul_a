package sesion02_mul_a;

public class Punto {
    private float x;
    private float y;

    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    public Punto() {
    }

    public Punto polar_cartesiano(float radio, float angulo) {
        float x = 0;   // Implementar la formula correcta
        float y = 0;   // Implementar la fórmula correcta
        return new Punto(x, y);
    }

        
    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

}
