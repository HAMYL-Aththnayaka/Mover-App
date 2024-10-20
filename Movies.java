import java.util.*;


public class Movies{

    private String title;
    private int year ;
    private double budjet;
    private double worldwideEarnings;
    private String Actor;
   private String productionCompany;

 Movies(String title,int year,double budjet,double worldwideEarnings,String Actor,String productionCompany){
    this.title=title;
    this.year=year;
    this.budjet=budjet;
    this.worldwideEarnings=worldwideEarnings;
    this.Actor=Actor;
    this.productionCompany=productionCompany;
}
Movies(){

}
 //getters
public String getTitle(){
    return title;
}
public int getYear(){
    return year;
}
public double getBudjet(){
    return budjet;
}
public double getWorldwideEarnings(){
    return worldwideEarnings;
}

public String getActor(){
    return Actor;
}

public String getProductionCompnay(){
    return productionCompany;
}

  //setters

        public void setTitle(String title){
            this.title=title;
        }
        public void setYear(int year){
            this.year=year;
        }
        public void setBudjet(double budjet){
            this.budjet=budjet;
        }
        
        public void setWorldwideEarnings(double worldwideEarnings){
            this.worldwideEarnings=worldwideEarnings;
        }

        public void setActor(String Actor){
            this.Actor=Actor;
        }
        public void  setProductionCompany(String productionCommpany){
            this.productionCompany=productionCommpany;
        }

 void play(){
    System.out.println(getTitle());
    System.out.println(getYear());
    System.out.println(getBudjet());
    System.out.println(getWorldwideEarnings());
    System.out.println(getActor());
    System.out.println(getProductionCompnay());
 }

/*  private String title;
    private int year ;
    private double budjet;
    private double worldwideEarnings;
    private String Actor;
   private String productionCompany;
 */
}