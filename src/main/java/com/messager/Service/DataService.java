package com.messager.Service;

import java.util.Set;

public interface DataService {
    public boolean persist(String problem);

    public Set<String> getRandomData();
}
