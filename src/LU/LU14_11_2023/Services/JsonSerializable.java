package LU.LU14_11_2023.Services;

import java.util.Map;

public interface JsonSerializable<T> {

    Map<Long, T> loadFromJson();

    void saveToJson(Map<Long, T> map);
}
