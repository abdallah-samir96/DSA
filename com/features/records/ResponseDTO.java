package com.features.records;

import java.io.Serializable;

public record ResponseDTO<T>(T data, long offset, long limit, int totalSize) implements Serializable {
}
