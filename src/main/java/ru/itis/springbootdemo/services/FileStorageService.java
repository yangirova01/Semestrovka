package ru.itis.springbootdemo.services;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

public interface FileStorageService {
    // сохраняет файл на сервере
    String saveFile(MultipartFile file);

    // отправляет файл по запросу
    void writeFileToResponse(String fileName, HttpServletResponse response);
}

