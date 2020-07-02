package shopApp.entity.users;

import lombok.*;
import shopApp.entity.BaseIdEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@Table(name = "clients")
public class ClientEntity extends BaseIdEntity {
    @Column(length = 18, unique = true, nullable = false)
    private String login;
    @Column(length = 18, nullable = false)
    private String password;
    private Long money;
}
