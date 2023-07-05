import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        Store store = new Store();

        ArrayList<Store> list = new ArrayList();
        list.add(store);

        list.get(0).printer();


    }
}
