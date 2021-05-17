package ru.itis.springbootdemo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.itis.springbootdemo.models.Underwear;

import java.util.List;
import java.util.stream.Collectors;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UnderwearDto {
    private Long id;
    private String name;
    private String color;
    private String size;
    private Integer price;
    private String type;
    private String image;

    public static UnderwearDto from(Underwear underwear) {
        return UnderwearDto.builder()
                .id(underwear.getId())
                .name(underwear.getName())
                .color(underwear.getColor())
                .size(underwear.getSize())
                .price(underwear.getPrice())
                .type(underwear.getType())
                .image(underwear.getImage())
                .build();
    }

    public static List<UnderwearDto> from(List<Underwear> underwears) {
        return underwears.stream().map(UnderwearDto::from).collect(Collectors.toList());
    }
}
