package ge.softlab.repository.repository.service;

import ge.softlab.repository.repository.model.Shipping;
import ge.softlab.repository.repository.repository.jpa.ShippingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShippingServiceImpl implements ShippingService {
    ShippingRepository shippingRepository;

    @Autowired
    ShippingServiceImpl(ShippingRepository shippingRepository) {
        this.shippingRepository = shippingRepository;

    }

    @Override
    public void addShipping(Shipping shipping) {
        shipping.setId(null);
        shippingRepository.save(shipping);
    }
}
