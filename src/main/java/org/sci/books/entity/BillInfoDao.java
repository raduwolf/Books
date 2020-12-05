package org.sci.books.entity;

import javax.persistence.*;

@Entity(name = "BILLING_INFO")
public class BillInfoDao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name="ADDRESS")
    private String address;

    @Column(name="CARD_TYPE")
    private String cardType;

    @Column(name="CARD_NAME")
    private String cardName;

    @Column(name="ACCOUNT_NR")
    private String account;

    @OneToOne(mappedBy = "billInfo")
    private ClientDao client;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public ClientDao getClient() {
        return client;
    }

    public void setClient(ClientDao client) {
        this.client = client;
    }
}
