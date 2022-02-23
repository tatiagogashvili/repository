package ge.softlab.repository.repository.controller;

import ge.softlab.repository.repository.model.Shipping;
import ge.softlab.repository.repository.service.ProductService;
import ge.softlab.repository.repository.service.SafeProductService;
import ge.softlab.repository.repository.service.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("shipping")
public class ShippingController {
    ProductService productService;
    ShippingService shippingService;
    SafeProductService safeProductService;
    @Autowired
    ShippingController(ProductService productService,ShippingService shippingService,SafeProductService safeProductService){
        this.productService=productService;
        this.shippingService=shippingService;
        this.safeProductService=safeProductService;

    }
    @PostMapping ("{quantity}/product/{type}")
    public String shipping(@PathVariable Integer quantity, @PathVariable String type, @RequestBody Shipping shipping){
    if (safeProductService.ship(quantity,type)){
        shippingService.addShipping(shipping);
        return "მოთხოვნა წარმატებით შესრულდა";
    }
    return "არასაკმარისი რაოდენობა";
    }

}
