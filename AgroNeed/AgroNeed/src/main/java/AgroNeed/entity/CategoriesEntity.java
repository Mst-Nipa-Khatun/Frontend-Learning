package AgroNeed.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "categories")
public class CategoriesEntity extends BaseEntity {
    @Column(name = "name")
    private String name;
     @Column(name = "parent_id")
    private Integer parentId;



//    id INT PRIMARY KEY AUTO_INCREMENT,
//    name VARCHAR(255) NOT NULL,
//    parent_id INT NULL,
//    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
//    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
//    FOREIGN KEY (parent_id) REFERENCES categories(id) ON DELETE CASCADE
}
