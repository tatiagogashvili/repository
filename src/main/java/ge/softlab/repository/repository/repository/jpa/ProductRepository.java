package ge.softlab.repository.repository.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import ge.softlab.repository.repository.model.Product;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>, JpaSpecificationExecutor<Product> {
    Product getByType(Integer type);

    @Query("select p " +
            "from Product p " +
            "where p.coast>10")
    List<Product> produqtebi();

    @Query("select p.type " +
            "from Product p" +
            " where p.coast<>10")
    String tipebi();
}
