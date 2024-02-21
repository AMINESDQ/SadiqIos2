package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class ImplDao implements IDao{
    @Override
    public double getData() {
       double temp=40.2;
        return temp;
    }
}
