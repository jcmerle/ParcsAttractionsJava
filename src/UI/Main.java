package UI;

import Domain.VO.*;

import java.util.ArrayList;

import Application.ParcCatalogServices;

public class Main{
    public static void main(String[] args){
        ParcCatalogServices pcs = new ParcCatalogServices();

        pcs.createCatalog("1");
        Location l1 = new Location(1.0, 1.0);

        Time t1 = new Time(9, 0);
        Time t2 = new Time(18, 0);
        Time t3 = new Time(14, 30);

        Attractions a1 = new Attractions("Roller Coaster", 10, 25);
        Attractions a2 = new Attractions("Ferris Wheel", 5, 10);
        Attractions a3 = new Attractions("Haunted House", 15, 30);
    
        ArrayList<Attractions> al1 = new ArrayList<Attractions>();
        al1.add(a1);
        al1.add(a2);
        al1.add(a3);
        
        Restaurants r1 = new Restaurants("McDonalds", 10, Meals.LUNCH);
        Restaurants r2 = new Restaurants("KFC", 15, Meals.DINNER);

        ArrayList<Restaurants> rl1 = new ArrayList<Restaurants>();
        rl1.add(r1);
        rl1.add(r2);

        Parc p1 = new Parc(1, "Disneyland", l1, 1000, al1, t1, t2, rl1);

        pcs.addParc("1", p1);

        ArrayList<Parc> parcs = pcs.listParcByLocation("1", l1, 10);
        for(Parc parc : parcs){
            System.out.println(parc.getName());
        }

        ArrayList<Parc> parcsOpen = pcs.listParcOpen("1", t3);
        for(Parc parc : parcsOpen){
            System.out.println(parc.getName());
        }

        System.out.println(p1);
        
    }
}