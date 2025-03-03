package AgroNeed.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Payments")
public class PaymentsEntity extends BaseEntity{
    @Column(name = "order_id")
    private Integer orderId;
     @Column(name = "user_id")
    private Integer userId;
     @Column(name = "payment_method")
    private String paymentMethod;
     @Column(name = "amount")
    private Double amount;

//    payment_id INT PRIMARY KEY AUTO_INCREMENT,
//    order_id INT,
//    user_id INT,
//    payment_method ENUM('PayPal', 'Stripe', 'Credit Card','Cash On'),
//    amount DECIMAL(10,2),
//    status ENUM('pending', 'completed', 'failed') DEFAULT 'pending',
//    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
//    FOREIGN KEY (order_id) REFERENCES Orders(order_id) ON DELETE CASCADE,
//    FOREIGN KEY (user_id) REFERENCES Users(user_id) ON DELETE CASCADE
}

