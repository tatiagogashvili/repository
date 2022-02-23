package ge.softlab.repository.repository.service;

import ge.softlab.repository.repository.model.Shipping;
import org.springframework.stereotype.Service;

@Service
public interface ShippingService {
    void addShipping(Shipping shipping);
}
