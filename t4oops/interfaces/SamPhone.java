package t4oops.interfaces;

public class SamPhone implements Phone,Android {

    @Override
    public String processor(){
        return "SD888";
    }
    @Override
    public String spaceinGB(){
        return "256GB";
    }
    @Override
    public String googlePlay(){
        return "Application Store";
    }
}
