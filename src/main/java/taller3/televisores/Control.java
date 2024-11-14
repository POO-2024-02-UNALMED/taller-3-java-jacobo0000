package taller3.televisores;

public class Control {
  TV tv;

  public void enlazar(TV tvI){
    tv = tvI;
    tvI.control = this;
  }

  public void canalUp(){
    if(tv.estado == true && tv.canal < 120){
      tv.canal += 1;
    }
  }

  public void canalDown(){
    if(tv.estado == true && tv.canal > 1){
      tv.canal -= 1;
    }
  }

  public void volumenUp(){
    if(tv.estado == true && tv.volumen < 7){
      tv.volumen += 1;
    }
  }

  public void volumenDown(){
    if(tv.estado == true && tv.volumen > 1){
      tv.volumen -= 1;
    }
  }

  public void turnOn(){
    tv.estado = true;
  }

  public void turnOff(){
    tv.estado = false;
  }

  public void setCanal(int canalNuevo){
    if(tv.estado == true && canalNuevo <= 120 && canalNuevo >=1){
      tv.canal = canalNuevo;
    }
    
  }

  public void setVolumen(int volumenNuevo){
    if(tv.estado == true && volumenNuevo <= 7 && volumenNuevo >= 1){
      tv.volumen = volumenNuevo;
    }
    
  }

  public TV getTv(){
    return tv;
  }
  public void setTv(TV tvNuevo){
    tv = tvNuevo;
    tvNuevo.control = this;
  }
}
