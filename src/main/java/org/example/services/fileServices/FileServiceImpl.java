package org.example.services.fileServices;

import org.example.domain.entities.File;
import org.example.services.fileServices.fileInterfaces.FileService;

import java.util.ArrayList;
import java.util.List;

public class FileServiceImpl implements FileService {

    private List<File> files = new ArrayList<>();

    @Override
    public void create(Object o) {
        if (o instanceof File) {
            File file = (File) o;
            files.add(file);
            System.out.println("File created: " + file);
        } else {
            throw new IllegalArgumentException("Invalid type for file creation");
        }
    }

    @Override
    public List<File> list() {
        return new ArrayList<>(files); // Return a copy of the list to avoid external modifications
    }
}

