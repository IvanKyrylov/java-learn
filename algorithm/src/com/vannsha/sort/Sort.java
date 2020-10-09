package com.vannsha.sort;

import java.util.List;

public interface Sort {
    <T extends Number> List<T> sort(List<T> list);
}
