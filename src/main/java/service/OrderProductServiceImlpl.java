package service;

import model.OrderProduct;
import repository.OrderProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderProductServiceImlpl implements OrderProductService {

    private OrderProductRepository orderProductRepository;

    public OrderProductServiceImlpl(OrderProductRepository orderProductRepository) {
        this.orderProductRepository = orderProductRepository;
    }

    @Override
    public OrderProduct create(OrderProduct orderProduct) {
        return this.orderProductRepository.save(orderProduct);
    }
}
