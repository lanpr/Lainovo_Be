package com.alpha.lainovo.service.ServiceInterface;

import java.util.List;

public interface CreateAndUpdateInterface<V, T> {
    Object create(T entity);

<<<<<<< HEAD
    void update(V key, T entity);
=======
    T update(V key, T entity);


>>>>>>> 4c43841 (#1 - Feat: Creat API Publications v1)
}
