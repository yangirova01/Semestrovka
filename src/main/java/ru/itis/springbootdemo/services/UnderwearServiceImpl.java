package ru.itis.springbootdemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import ru.itis.springbootdemo.dto.UnderwearPage;
import ru.itis.springbootdemo.models.Underwear;
import ru.itis.springbootdemo.repositories.UnderwearRepository;

import static ru.itis.springbootdemo.dto.UnderwearDto.from;


@Service
public class UnderwearServiceImpl implements UnderwearService {
    @Autowired
    UnderwearRepository underwearRepository;

    @Override
    public UnderwearPage search(Integer size, Integer page, String query, String sortParameter, String directionParameter) {
        Direction direction = Direction.ASC;
        Sort sort = Sort.by(direction, "id");
        if (directionParameter != null) {
            direction = Direction.fromString(directionParameter);
        }
        if (sortParameter != null) {
            sort = Sort.by(direction, sortParameter);
        }
        if (query == null) {
            query = "empty";
        }
        PageRequest pageRequest = PageRequest.of(page, size, sort);
        Page<Underwear> underwearPage = underwearRepository.search(query, pageRequest);

        return UnderwearPage.builder()
                .pagesCount(underwearPage.getTotalPages())
                .underwears(from(underwearPage.getContent()))
                .build();

    }
}
