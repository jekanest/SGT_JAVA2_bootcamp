package lv.jekaterina.rocketshop.ecommerce.repositories;

import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}