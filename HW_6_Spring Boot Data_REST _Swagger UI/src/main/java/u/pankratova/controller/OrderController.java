package u.pankratova.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import u.pankratova.model.Order;
import u.pankratova.service.OrderService;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @Operation(summary = "Delete order by id")
    @ResponseStatus(code = HttpStatus.OK)
    @DeleteMapping("/deleteById{id}")
    public void deleteById(@RequestParam("id") int id) {
        orderService.deleteById(id);
    }

    @Operation(summary = "Partial update by id")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    @PatchMapping("/update")
    public void updateOrder(@RequestParam("id") int id,
                            @RequestBody(required = false) Order order) {
        orderService.updateById(id, order);
    }

    @Operation(summary = "Add an order")
    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping("/add")
    public void addOrder(@RequestBody Order order) {
        orderService.add(order);
    }

    @Operation(summary = "Get all orders")
    @ResponseStatus(code = HttpStatus.FOUND)
    @GetMapping("/getAll")
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @Operation(summary = "Get order by id")
    @ResponseStatus(code = HttpStatus.FOUND)
    @GetMapping("/getById{id}")
    public Order getOrderById(@RequestParam("id") int id) {
        return orderService.getOrderById(id);
    }

    @Operation(summary = "Complete rewrite by id")
    @ResponseStatus(code = HttpStatus.OK)
    @PutMapping("/completeRewrite")
    public void rewriteOrder(@RequestParam(value = "id") int id,
                             @RequestBody Order order) {
        orderService.completeRewriteById(id, order);
    }

    // 2.3
    @Operation(summary = "Get different months")
    @ResponseStatus(code = HttpStatus.OK)
    @GetMapping("/differentMonths")
    public List<String> differentMonths() {
        return orderService.differentMonths();
    }

    // 4.1
    @Operation(summary = "Get the surname of the buyer and the name of the store where the purchase was made")
    @ResponseStatus(code = HttpStatus.OK)
    @GetMapping("/surnameBuyerAndShopName")
    public List<Object> surnameBuyerAndShopName() {
        return orderService.surnameBuyerAndShopName();
    }

    // 4.2
    @Operation(summary = "Get the date, surname of the buyer, discount, name and quantity of books purchased")
    @ResponseStatus(code = HttpStatus.OK)
    @GetMapping("/dateSurnameDiscountNameAndQuantityOfBook")
    public List<Object> dateSurnameDiscountNameAndQuantityOfBook() {
        return orderService.dateSurnameDiscountNameAndQuantityOfBook();
    }

    // 5.1
    @Operation(summary = "The order number, the name of the buyer and the date of purchase in which the books were sold in the amount of at least some rubles")
    @ResponseStatus(code = HttpStatus.OK)
    @GetMapping("/soldMoreThanSmth/{sum}")
    public List<Object> soldMoreThanSmth(@PathVariable double sum) {
        return orderService.soldMoreThanSmth(sum);
    }

    // 5.2
    @Operation(summary = "Purchases made by the buyer in their district not earlier ... months")
    @ResponseStatus(code = HttpStatus.OK)
    @GetMapping("/earlierMonths{months}")
    public List<Object> earlierMonths(@PathVariable int months) {
        return orderService.earlierMonths(months);
    }

}
