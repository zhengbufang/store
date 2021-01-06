package com.zy.infter;

import java.util.List;

@FunctionalInterface
public interface Report<T, Z> {

    default String desc() {
        return "顶层报表";
    }
    List<T> selectList(Z dto);

}
