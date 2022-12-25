package com.domain.belajarspringdasar.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor // untuk membuat constructor secara otomatis menggunakna lombok
@Data // supaya terdapat getter dan setter
public class FooBar {
    private Foo foo;
    private Bar bar;
    // foo dan bar otomatis menjadi parameter constructor FooBar

}
