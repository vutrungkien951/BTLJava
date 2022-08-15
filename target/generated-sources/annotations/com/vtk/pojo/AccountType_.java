package com.vtk.pojo;

import com.vtk.pojo.UserAccount;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-08-14T10:16:34")
@StaticMetamodel(AccountType.class)
public class AccountType_ { 

    public static volatile SetAttribute<AccountType, UserAccount> userAccountSet;
    public static volatile SingularAttribute<AccountType, String> roles;
    public static volatile SingularAttribute<AccountType, Integer> typeId;

}