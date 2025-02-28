package com.alpha.lainovo.service.ServiceInterface;



import com.alpha.lainovo.model.Type;

import java.util.List;
import java.util.Optional;

public interface TypeInterface extends CreateAndUpdateInterface<Integer, Type> {

    boolean delete(Integer id);
    Type getByTypeId(Integer id);
    List<Type> getAllType();

    Optional<Type> findByTypeName(String typeName);
}
