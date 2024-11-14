package taller3.televisores;

public class Control {
  TV tv;

  public void enlazar(TV tvI){
    tv = tvI;
    tvI.control = this;
  }

  public void canalUp(){
    tv.canalUp();
  }

  public void canalDown(){
    tv.canalDown();
  }

  public void volumenUp(){
    tv.volumenUp();
  }

  public void volumenDown(){
    tv.volumenDown();
  }

  public void turnOn(){
    tv.estado = true;
  }

  public void turnOff(){
    tv.estado = false;
  }

  public void setCanal(int canalNuevo){
    tv.setCanal(canalNuevo);
    
  }

  public void setVolumen(int volumenNuevo){
    tv.setVolumen(volumenNuevo);
  }

  public TV getTv(){
    return tv;
  }
  public void setTv(TV tvNuevo){
    tv = tvNuevo;
    tvNuevo.control = this;
  }
}
