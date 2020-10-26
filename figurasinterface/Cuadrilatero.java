package figurasinterface;

public abstract class Cuadrilatero extends FigurasInterface{
    
    float L4;

    public Cuadrilatero(float L1, float L2, float L3, float Base, float Altura, float L4) {
        super(L1, L2, L3, Base, Altura);
        this.L4 = L4;
    }
    
    @Override
    public float Area(){
       return (Base*Altura);
   }
    
    @Override
    public float Perimetro(){
        return(L1+L2+L3+L4);
    }    
}