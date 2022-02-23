package ge.softlab.repository.repository.service;

import org.springframework.stereotype.Service;

@Service
public interface SafeProductService {

    boolean ship(Integer quantity, String type);
}
