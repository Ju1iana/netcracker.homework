package u.pankratova.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import u.pankratova.model.Shop;
import u.pankratova.service.ShopService;

import java.util.List;

@RestController
@RequestMapping("/shops")
public class ShopController {

    private final ShopService shopService;

    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }

    @Operation(summary = "Delete shop by id")
    @ResponseStatus(code = HttpStatus.OK)
    @DeleteMapping("/deleteById{id}")
    public void deleteById(@RequestParam("id") int id){
        shopService.deleteById(id);
    }

    @Operation(summary = "Partial update by id")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    @PatchMapping("/update")
    public void updateShop(@RequestParam("id") int id,
                           @RequestBody (required = false) Shop shop){
        shopService.updateById(id, shop);
    }

    @Operation(summary = "Add a shop")
    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping("/add")
    public void addShop(@RequestBody Shop shop){
       shopService.add(shop);
    }

    @Operation(summary = "Get all shops")
    @ResponseStatus(code = HttpStatus.FOUND)
    @GetMapping("/getAll")
    public List<Shop> getAllShops(){
        return shopService.getAllShops();
    }

    @Operation(summary = "Get shop by id")
    @ResponseStatus(code = HttpStatus.FOUND)
    @GetMapping("/getById{id}")
    public Shop getShopById(@RequestParam("id") int id) {
        return shopService.getShopById(id);
    }

    @Operation(summary = "Complete rewrite by id")
    @ResponseStatus(code = HttpStatus.OK)
    @PutMapping("/completeRewrite")
    public void rewriteShop(@RequestParam(value = "id") int id,
                            @RequestBody Shop shop){
        shopService.completeRewriteById(id, shop);
    }

    // 3.2
    @Operation(summary = "Shop names of different districts")
    @ResponseStatus(code = HttpStatus.OK)
    @GetMapping("/shopNames/{district1}/{district2}")
    public List<String> shopNames(@PathVariable String district1,
                                  @PathVariable String district2){
        return shopService.shopNames(district1, district2);
    }

    // 5.3
    @Operation(summary = "Shops located in any district, except ... and buyers with a discount of ...%-...%")
    @ResponseStatus(code = HttpStatus.OK)
    @GetMapping("betweenFromAndTo/{district}/{from}/{to}")
    public List<Object> betweenFromAndTo(@PathVariable String district,
                                         @PathVariable int from,
                                         @PathVariable int to){
        return shopService.betweenFromAndTo(district, from, to);
    }

}
