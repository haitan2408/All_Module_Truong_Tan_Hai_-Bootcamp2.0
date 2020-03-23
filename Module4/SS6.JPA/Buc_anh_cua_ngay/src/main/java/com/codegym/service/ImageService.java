package com.codegym.service;

import com.codegym.model.Image;

import java.util.List;

public interface ImageService {
    List<Image> findAll();

    Image findById(Long id);

    void save(Image blog);

    void remove(Long id);
}
