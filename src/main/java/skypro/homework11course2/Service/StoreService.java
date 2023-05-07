package skypro.homework11course2.Service;

import org.springframework.stereotype.Service;
import skypro.homework11course2.Demo.Box;

import java.util.Set;

@Service
public class StoreService {
    private final Box box;

    public StoreService(Box box) {
        this.box = box;
    }
    public void  add(Set<Integer> ids){
        box.add(ids);
    }
    public Set<Integer> get(){
        return box.get();
    }
}
