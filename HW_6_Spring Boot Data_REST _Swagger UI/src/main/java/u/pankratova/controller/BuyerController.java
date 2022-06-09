package u.pankratova.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import u.pankratova.model.Buyer;
import u.pankratova.service.BuyerService;

import java.util.List;

@RestController
@RequestMapping("/buyers")
public class BuyerController {

    private final BuyerService buyerService;

    public BuyerController(BuyerService buyerService) {
        this.buyerService = buyerService;
    }

    @Operation(summary = "Delete bueyr by id")
    @ResponseStatus(code = HttpStatus.OK)
    @DeleteMapping("/deleteById{id}")
    public void deleteById(@RequestParam("id") int id){
        buyerService.deleteById(id);
    }

    @Operation(summary = "Partial update by id")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    @PatchMapping("/update")
    public void updateBuyer(@RequestParam("id") int id,
                            @RequestBody (required = false) Buyer buyer){
        buyerService.updateById(id, buyer);
    }

    @Operation(summary = "Add a buyer")
    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping("/add")
    public void addBuyer(@RequestBody Buyer buyer) {
        buyerService.add(buyer);
    }

    @Operation(summary = "Get all buyers")
    @ResponseStatus(code = HttpStatus.FOUND)
    @GetMapping("/getAll")
    public List<Buyer> getAllBuyers() {
        return buyerService.getAllBuyers();
    }

    @Operation(summary = "Get buyer by id")
    @ResponseStatus(code = HttpStatus.FOUND)
    @GetMapping("/getById{id}")
    public Buyer getBuyerById(@RequestParam("id") int id) {
        return buyerService.getBuyerById(id);
    }


    @Operation(summary = "Complete rewrite by id")
    @ResponseStatus(code = HttpStatus.OK)
    @PutMapping("/completeRewrite")
    public void rewriteBuyer(@RequestParam(value = "id") int id,
                             @RequestBody Buyer buyer){
        buyerService.completeRewriteById(id, buyer);
    }

    // 2.2
    @Operation(summary = "Get all different districts where buyers live")
    @ResponseStatus(code = HttpStatus.OK)
    @GetMapping("/differentDistricts")
    public List<String> differentDistricts(){
        return buyerService.differentDistricts();
    }
}
