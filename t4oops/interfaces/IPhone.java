package t4oops.interfaces;

public class IPhone implements Phone,IOS{

    @Override
    public String processor(){
        return "A15 Bionic";
    }
    @Override
    public String spaceinGB(){
        return "512GB";
    }
    @Override
    public String airDrop(){
        return "File Transfer";
    }
}
