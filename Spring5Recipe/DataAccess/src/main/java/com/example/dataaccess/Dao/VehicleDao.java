package com.example.dataaccess.Dao;

import com.example.dataaccess.Entity.Vehicle;

import java.util.List;

// 자동차 레코드 CRUD 데이터 엑세스 추상화
public interface VehicleDao {
    void insert(Vehicle vehicle);
    void insert(Iterable<Vehicle> vehicle);
    void update(Vehicle vehicle);
    void delete(Vehicle vehicle);
    Vehicle findByVehicleNo(String vehicleNo);
    List<Vehicle> findAll();
}
