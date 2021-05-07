package uz.kimhub.alibaba.entities;

import jdk.Exported;
import lombok.Data;
import lombok.experimental.Accessors;
import uz.kimhub.alibaba.commons.TableConsts;
import uz.kimhub.alibaba.entities.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Accessors(chain = true)
@Table(name = TableConsts.USER)
public class UserEntity extends BaseEntity {


    private String username;
    private String password;
    @Column(name = "created_date")
    private Date createdDate;

}

