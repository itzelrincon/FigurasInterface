package figurasinterface;
public abstract class FigurasInterface implements Interface{
    
    protected float L1,L2, L3,Base, Altura;
    
    public FigurasInterface(float L1, float L2,float L3, float Base, float Altura){
        this.L1 = L1;
        this.L2 = L2;
        this.L3 = L3;
        this.Altura = Altura;
        this.Base = Base;
    }
    
    //Getters
    
    public float getL1(){
        return L1;
    }
    
    public float getL2(){
        return L2;
    }
    
    public float getL3(){
        return L3;
    }
    
    //@Override
    public float Area(){
        return 0;
    }
    
    public float Perimetro(){        
        return 0;
    }
        
}