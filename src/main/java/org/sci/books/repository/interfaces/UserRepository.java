package org.sci.books.repository.interfaces;

import org.sci.books.entity.ClientDao;
import org.sci.books.entity.ManagementDao;


public interface UserRepository /*extends JpaRepository<UserDao,Integer>*/ {

    public void createManager(ManagementDao mg);
    public void createClient(ClientDao cl);
}
