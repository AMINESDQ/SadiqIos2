package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class ImplMetier implements IMetier{
    @Autowired
    IDao dao;
    @Override
    public double calcul() {
        return dao.getData()*2;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
