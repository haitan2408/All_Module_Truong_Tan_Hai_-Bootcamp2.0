package com.codegym.service;

import com.codegym.model.Image;
import com.codegym.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ImageServiceImpl implements ImageService {
    @Autowired
    private ImageRepository imageRepository;

    @Override
    public List<Image> findAll() {
        return imageRepository.findAll();
    }

    @Override
    public Image findById(Long id) {
        return imageRepository.findById(id);
    }

    @Override
    public void save(Image image) {
        imageRepository.save(image);
    }

    @Override
    public void remove(Long id) {
        imageRepository.remove(id);
    }
}
