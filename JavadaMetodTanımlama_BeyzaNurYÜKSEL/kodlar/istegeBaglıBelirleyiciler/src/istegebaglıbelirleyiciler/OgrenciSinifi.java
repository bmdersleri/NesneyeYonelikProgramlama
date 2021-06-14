
package istegebaglıbelirleyiciler;

public abstract class OgrenciSinifi {
    private String ad;
    private String soyad;
    private int numara;

    public abstract String getAd();

    public abstract String getSoyad();

    public int getNumara() {
        return this.numara;
    }
     public class istegebaglıbelirleyiciler extends OgrenciSinifi {

        @Override
        public String getAd() {
            return "Beyza";
        }

        @Override
        public String getSoyad() {
            return "Yüksel";
        }

         @Override
        public int getNumara() {
            System.out.println(super.getNumara());
            return super.getNumara();
        }
    }
}
