
public class İsci {
    String isim;
    double maas;
    int calismasaati, baslamayili;
       İsci(int baslamayili, int calismasaati, double maas, String isim){
        this.isim=isim;
        this.maas=maas;
        this.calismasaati=calismasaati;
        this.baslamayili=baslamayili;   }
    public double vergi(){
        if(this.maas >= 1000){
            return 1000*0.03;   }
        return 0.0; }
    public double ekstramaas() {
        int ekstracalismasaati = calismasaati - 40;
        if (ekstracalismasaati > 0 ){
            return 30*ekstracalismasaati;   }
        return 0.0; }
    public double maasartisi(){
        int sene = 2021-baslamayili;
        if(sene < 10 ){
            return maas*0.05;   }
        else if( sene >= 10 && sene<20){
            return maas*0.10;   }
        else{
            return maas*0.15;   }   }   }
