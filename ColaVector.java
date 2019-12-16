public class ColaVector {
    
    private int cantidadElementos,indicePrimerElemento,indiceUltimoElemento;
    private Object[] colaVector;

    public ColaVector(int tamanioMax) {
        setCantidadElementos(0);
        setIndicePrimerElemento(0);
        setIndiceUltimoElemento(0);
        setColaVector(new Object[tamanioMax]);
    }
    
    public void agregarALaCola(Object dato) {
        if (getCantidadElementos() < getColaVector().length) {
            if (estaVacia()) {
                setIndicePrimerElemento((getIndicePrimerElemento() + getCantidadElementos()) % getColaVector().length);
            } 
            setIndiceUltimoElemento((getIndicePrimerElemento() + getCantidadElementos()) % getColaVector().length);
            getColaVector()[getIndiceUltimoElemento()] = dato;
            setCantidadElementos(getCantidadElementos() + 1);
        }
    }
    
    public Object quitarDeLaCola() {
        Object datoARetornar = null;
        if (!estaVacia()) {
            datoARetornar = getColaVector()[getIndicePrimerElemento()];
            setIndicePrimerElemento((getIndicePrimerElemento() + 1) % getColaVector().length);
            setCantidadElementos(getCantidadElementos() - 1);
        }
        return datoARetornar;
    }
    
    public Object verPrimerElemento() {
        Object datoARetornar = null;
        if (!estaVacia()) {
            datoARetornar = getColaVector()[getIndicePrimerElemento()];
        }
        return datoARetornar;
    }
    
    public Object verUltimoElemento() {
        Object datoARetornar = null;
        if (!estaVacia()) {
            datoARetornar = getColaVector()[getIndiceUltimoElemento()];
        }
        return datoARetornar;
    }

    public boolean estaVacia() {
        return (getCantidadElementos() == 0);
    }
    
    public int getCantidadElementos() {
        return cantidadElementos;
    }

    public void setCantidadElementos(int cantidadElementos) {
        this.cantidadElementos = cantidadElementos;
    }

    public int getIndicePrimerElemento() {
        return indicePrimerElemento;
    }

    public void setIndicePrimerElemento(int indicePrimerElemento) {
        this.indicePrimerElemento = indicePrimerElemento;
    }

    public int getIndiceUltimoElemento() {
        return indiceUltimoElemento;
    }

    public void setIndiceUltimoElemento(int indiceUltimoElemento) {
        this.indiceUltimoElemento = indiceUltimoElemento;
    }

    public Object[] getColaVector() {
        return colaVector;
    }

    public void setColaVector(Object[] colaVector) {
        this.colaVector = colaVector;
    }
    
}
