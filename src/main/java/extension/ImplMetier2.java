package extension;

import dao.IDao;
import metier.IMetier;

public class ImplMetier2 implements IMetier {
    IDao dao;
    @Override
    public double calcul() {
        System.out.println("vous étes dans l'extention");
        return dao.getData()*100;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
