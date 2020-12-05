package org.sci.books.entity;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value = "Client")
public class ClientDao extends UserDao{

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "BIL_INFO_ID", referencedColumnName = "id")
    private BillInfoDao billInfo;

    public BillInfoDao getBillInfo() {
        return billInfo;
    }

    public void setBillInfo(BillInfoDao billInfo) {
        this.billInfo = billInfo;
    }
}
