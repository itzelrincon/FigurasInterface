package figurasinterface;

public class Triangulo extends FigurasInterface{
    
    public Triangulo(float L1, float L2, float L3, float Base, float Altura) {
        super(L1, L2, L3, Base, Altura);
    }
    
    @Override
    public float Area(){
        return (Base*Altura)/2;
    }
    
    @Override
    public float Perimetro(){
        return L1+L2+L3;
    }
}