package ge.softlab.repository.repository.service;

import ge.softlab.repository.repository.model.SafeProducts;
import ge.softlab.repository.repository.repository.jpa.SafeProductRepository;
import ge.softlab.repository.repository.repository.jpa.SafeRepository;
import org.springframework.stereotype.Service;

@Service
public class SafeProductServiceImpl implements SafeProductService{

     SafeProductRepository safeProductRepository;
   SafeProductServiceImpl (SafeProductRepository safeProductRepository){
       this.safeProductRepository=safeProductRepository;

   }
   public SafeProducts getSafeProduct(String product_type) {
     return   safeProductRepository.getByProductType(product_type);

   }
   public SafeProducts addSafeProducts(SafeProducts safeProducts){
      return safeProductRepository.save(safeProducts);
   }
    @Override
    public boolean ship(Integer quantity, String type) {
       SafeProducts safeProducts=new SafeProducts();
       safeProducts=getSafeProduct(type);
        if(safeProducts.getQuantity()-quantity<0){
            return false;
        }
        safeProducts.setQuantity(safeProducts.getQuantity()-quantity);
        addSafeProducts(safeProducts);
        return true;
    }
}
