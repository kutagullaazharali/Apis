package com.example.api;

public class ApiResponse<T> {
    private String status;
    private int count;
    private T data;

    public ApiResponse(String status, int count, T data) {
        this.status = status;
        this.count = count;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public int getCount() {
        return count;
    }

    public T getData() {
        return data;
    }
}
