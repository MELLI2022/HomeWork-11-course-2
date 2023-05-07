package skypro.homework11course2.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import skypro.homework11course2.Service.StoreService;

import java.util.Set;

@RestController
@RequestMapping("/order")
public class StoreController {
    private final StoreService service;

    public StoreController(StoreService service) {
        this.service = service;
    }
    @GetMapping("/add")
    public void add(@RequestParam ("id") Set<Integer> ids){
        service.add(ids);
    }
 @GetMapping("/get")
    public Set<Integer> get(){
        return service.get();
    }


}
