package ge.softlab.repository.repository.repository.jpa;

import ge.softlab.repository.repository.model.SafeProducts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SafeProductRepository extends JpaRepository<SafeProducts,Integer> {
  SafeProducts getByProductType(String type);

}
