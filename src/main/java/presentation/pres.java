package presentation;

import dao.ImplDao;
import metier.ImplMetier;

public class pres {
    public static void main(String[] args){
        ImplDao dao=new ImplDao();
        ImplMetier metier=new ImplMetier();
        metier.setDao(dao);

        System.out.println(metier.calcul());
    }
}
