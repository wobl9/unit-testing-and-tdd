package com.acme.banking.dbo.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

public class Client {
    private UUID id;
    private String name;
    private Collection<Account> accounts = new ArrayList<>(); //TODO
    public Client(UUID id, String name) {
        if (id == null) throw new IllegalArgumentException("id is null");
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("Invalid name");
        this.id = id;
        this.name = name;
    }
    public UUID getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}
