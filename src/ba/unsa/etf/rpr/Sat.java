package ba.unsa.etf.rpr;

public class Sat {
    private int sati,minute,sekunde;

    private void setSati(int sati) {
        this.sati = sati;
    }

    private void setMinute(int minute) {
        this.minute = minute;
    }

   private void setSekunde(int sekunde) {
        this.sekunde = sekunde;
    }

    public Sat(int sati, int minute, int sekunde) {
        Postavi(sati,minute,sekunde);
    }
    public void Postavi(int sati,int minute,int sekunde){
       setSati(sati);
       setMinute(minute);
       setSekunde(sekunde);
    }
   public void Sljedeci() {
        sekunde++;
        if (sekunde==60) { sekunde=0; minute++; }
        if (minute==60) { minute=0; sati++; }
        if (sati==24) sati=0;
    }
  public void Prethodni() {
        sekunde--;
        if (sekunde==-1) { sekunde=59; minute--; }
        if (minute==-1) { minute=59; sati--; }
        if (sati==-1) sati=23;
    }
    public void PomjeriZa(int pomak) {
        if (pomak>0) for (int i=0; i<pomak; i++) Sljedeci();
		else for (int i=0; i<-pomak; i++) Prethodni();
    }

    public int getMinute() {
        return minute;
    }

    public int getSati() {
        return sati;
    }

    public int getSekunde() {
        return sekunde;
    }
    public void Ispisi(){
        System.out.println(sati + ":" +minute + ":" + sekunde);
    }
}
