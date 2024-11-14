package taller3.televisores;

public class TV {
  static int numTV;
  Marca marca;
  int canal = 1;
  int precio = 500;
  boolean estado;
  int volumen = 1;
  Control control;

  public TV(Marca marcaI, boolean estadoI){
    marca = marcaI;
    estado = estadoI; 
    numTV += 1;
  }
  
  public void canalUp(){
    if(estado == true && canal < 120){
      canal += 1;
    }
  }

  public void canalDown(){
    if(estado == true && canal > 1){
      canal -= 1;
    }
  }

  public void volumenUp(){
    if(estado == true && volumen < 7){
      volumen += 1;
    }
  }

  public void volumenDown(){
    if(estado == true && volumen > 1){
      volumen -= 1;
    }
  }

  public void turnOn(){
    estado = true;
  }

  public void turnOff(){
    estado = false;
  }

  static public void setNumTV(int numTVNuevo){
    numTV = numTVNuevo;
  }

  public void setMarca(Marca marcaNueva){
    marca = marcaNueva;
  }

  public void setCanal(int canalNuevo){
    canal = canalNuevo;
  }

  public void setPrecio(int precioNuevo){
    precio = precioNuevo;
  }

  public void setVolumen(int volumenNuevo){
    volumen = volumenNuevo;
  }

  public void setControl(Control controlNuevo){
    control = controlNuevo;
  }

  static public int getNumTV(){
    return numTV;
  }

  public Marca getMarca(){
    return marca;
  }

  public int getCanal(){
    return canal;
  }

  public int getPrecio(){
    return precio;
  }

  public boolean getEstado(){
    return estado;
  }

  public int getVolumen(){
    return volumen;
  }

  public Control getControl(){
    return control;
  }
}
