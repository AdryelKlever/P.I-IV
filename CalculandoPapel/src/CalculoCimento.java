public class CalculoCimento {
    private float areia = 60;
    private float pedra = 60;
    private float cimento = 480;
    private float m3 = 3;
    
    public float calculoAreia(){
        return (areia * m3);
    }
    
    
    public float calculoPedra(){
        return (pedra * m3);
    }
    
    public float calculoCimento(){
        return (cimento * m3);
    }

    public float getAreia() {
        return areia;
    }

    public void setAreia(float areia) {
        this.areia = areia;
    }

    public float getPedra() {
        return pedra;
    }

    public void setPedra(float pedra) {
        this.pedra = pedra;
    }

    public float getCimento() {
        return cimento;
    }

    public void setCimento(float cimento) {
        this.cimento = cimento;
    }

    public float getM3() {
        return m3;
    }

    public void setM3(float m3) {
        this.m3 = m3;
    } 
}
