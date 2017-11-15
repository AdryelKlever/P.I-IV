public class CalculoTinta {
    private float substrato = 2;
    private float processoImpressao = 2;
    private float areaImpressao = 2;
    private float tiragemImpressao = 2;
    private float tipoGrafismo = 2;
    private float pesoEspecifico = 2;
    
    public float calculoTinta(){
        return (float)((getSubstrato() * getProcessoImpressao() * getAreaImpressao() * getTiragemImpressao() * getTipoGrafismo() * getPesoEspecifico()) / 353);
    }
    
    
    public void setSubstrato(float substrato){
        this.substrato = substrato;
    }
    
    public float getSubstrato(){
        return substrato;
    }
    public void setProcessoImpressao(float processoImpressao){
        this.processoImpressao = processoImpressao;
    }    
    public float getProcessoImpressao(){
        return processoImpressao;
    }
    
    public void setAreaImpressao(float areaImpressao){
        this.areaImpressao = areaImpressao;
    }    
    public float getAreaImpressao(){
        return areaImpressao;
    }
    
    public void setTiragemImpressao(float tiragemImpressao){
        this.tiragemImpressao = tiragemImpressao;
    }    
    public float getTiragemImpressao(){
        return tiragemImpressao;
    }
    
    public void setTipoGrafismo(float tipoGrafismo){
        this.tipoGrafismo = tipoGrafismo;
    }    
    public float getTipoGrafismo(){
        return tipoGrafismo;
    }
    
    public void setPesoEspecifico(float pesoEspecifico){
        this.pesoEspecifico = pesoEspecifico;
    }    
    public float getPesoEspecifico(){
        return pesoEspecifico;
    }
    
}
