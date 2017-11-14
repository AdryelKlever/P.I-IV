
public class Calculo {
    private float altura = 40;
    private float alturaMedia = 2;
    private float montagemLateral = 3;
    private float qtdEtiquetas = 100; 
  
    
    
    public float somaDivisao(float a, float b){
        return  (a+b)/100;
        
    }
    
    public float somaDivisaoMutiplicacao(float a, float b, float c){
        return ((a+b)/100) * c;
    }
    
    public float somaDivisiaoMutiplicacaoDivisao(float a, float b, float c, float d){
        return (((a+b)/100) * c) / d;
    }
    
    public float calculo(){        
        return (float)((((getAltura()) + (getAlturaMedia()))/ 1000) * (getEtiquetasUnidades())) / (getMontagemLateral());
        
    }
    
    public float getAltura() {
        return altura;
    }

    public void setAlturaMedia(float alturaMedia){
        this.alturaMedia = alturaMedia;
    }
    
    public float getAlturaMedia(){
        return alturaMedia;
    }

   
    public void setAltura(float altura) {
        this.altura = altura;
    }
   
    public float getMontagemLateral() {
        return montagemLateral;
    }

    
    public void setMontagemLateral(float montagemLateral) {
        this.montagemLateral = montagemLateral;
    }

    
    public float getEtiquetasUnidades() {
        return qtdEtiquetas;
    }

    
    public void setEtiquetasUnidades(float qtdEtiquetas) {
        this.qtdEtiquetas = qtdEtiquetas;
    }
    
    public String qtdtotal() {
        return "Altura: " + altura + "Altura Média: " + alturaMedia;
    
}}
    

