package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class pres2 {
    public static void main(String[] args) throws Exception {

        Scanner scanner=new Scanner(new File("config.txt"));

        String daoClasseName=scanner.nextLine();
        Class cdao = Class.forName(daoClasseName);
        IDao dao =(IDao) cdao.newInstance();


        String metierClasseName=scanner.nextLine();
        Class cMetier=Class.forName(metierClasseName);
        IMetier metier =(IMetier) cMetier.newInstance();

        Method method=cMetier.getMethod("setDao",IDao.class);
        method.invoke(metier,dao);

        System.out.println(metier.calcul());



    }
}
