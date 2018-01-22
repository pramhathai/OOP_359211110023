package ooplap7;

public class SuperCar {
    private String carbrand;
    private String carcolor;
    private String carenginesize;
    private String maxspeed;
    private String countryoforigin;

    public SuperCar(){}
    public SuperCar(String carbrand, String carcolor, String size,
                    String peed, String forigin){
        this.carbrand = carbrand;
        this.carcolor = carcolor;
        this.carenginesize = size;
        this.maxspeed = peed;
        this.countryoforigin = forigin;}
        //

        public void setcarbrand(String carbrand){
            this.carbrand = carbrand;
        }//setcarbrand
        public String getcarbrand(){
            return this.carbrand;
        }//getcarbrand

    public String getCarcolor() {
        return carcolor;
    }

    public void setCarcolor(String carcolor) {
        this.carcolor = carcolor;
    }

    public String getCarenginesize() {
        return carenginesize;
    }

    public void setCarenginesize(String carenginesize) {
        this.carenginesize = carenginesize;
    }

    public String getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(String maxspeed) {
        this.maxspeed = maxspeed;
    }

    public String getCountryoforigin() {
        return countryoforigin;
    }

    public void setCountryoforigin(String countryoforigin) {
        this.countryoforigin = countryoforigin;
    }
}

