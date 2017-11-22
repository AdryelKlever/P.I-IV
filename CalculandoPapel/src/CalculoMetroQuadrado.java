public class CalculoMetroQuadrado {
    
    public int largura;
    public int alturaMilimetro;
    public int qtd;
    public int esqueleto;
    public int alturaEsqueleto;
    
    public int somaDivisao2(int a, int b){
        return (a+b)/1000;
    }
    
    public int somaDivisaoMultiplicacao2(int a, int b, int c, int d){
        return (((a+b)/1000) * ((c+d)/1000));
    }
    
    public int multipicacao(int a, int b, int c, int d, int e){
        return (((a+b)/1000) * ((c+d)/1000)) * e; 
    }
    
    public int Total(){
        return (int) ((((getLargura())+(getEsqueleto()))/1000) * (((getAlturaMilimetro())+(getAlturaEsqueleto()))/1000)) * (getQtd());
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAlturaMilimetro() {
        return alturaMilimetro;
    }

    public void setAlturaMilimetro(int alturaMilimetro) {
        this.alturaMilimetro = alturaMilimetro;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    
    public void setAlturaEsquelto(int alturaEsqueleto){
        this.alturaEsqueleto = alturaEsqueleto;
    }
    
    public int getAlturaEsqueleto(){
        return alturaEsqueleto;
    }
    
    public void setEsqueleto(int esqueleto){
        this.esqueleto = esqueleto;
    }
    
    public int getEsqueleto(){
        return esqueleto;
    }

    
}
