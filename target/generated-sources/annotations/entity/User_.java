package entity;

import entity.Role;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-26T00:05:05")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> usersData;
    public static volatile SingularAttribute<User, String> userPass;
    public static volatile SingularAttribute<User, String> userEmail;
    public static volatile ListAttribute<User, Role> roleList;

}