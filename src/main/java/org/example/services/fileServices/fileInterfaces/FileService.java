package org.example.services.fileServices.fileInterfaces;

import java.util.List;

public interface FileService<T> {
    void create(T t);
    List<T> list();
}
