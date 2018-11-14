package com.example.dataaccess.Dao;

import com.example.dataaccess.Entity.Vehicle;

import javax.sql.DataSource;
import java.util.List;

public class PlainJdbcVehicleDao implements VehicleDao {
    private static final String INSERT_SQL  = "INSERT INTO VEHICLE (COLOR, WHEEL, SEAT, VEHICLE_NO) VALUE (?, ?, ?, ?)";
    private static final String UPDATE_SQL  = "UPDATE VEHICLE SET COLOR = ?, WHEEL = ?, SEAT = ? WHERE VEHICLE_NO = ?";
    private static final String SELECT_ALL_SQL  = "SELECT * FROM VEHICLE";
    private static final String SELECT_ONE_SQL  = "SELECT * FROM WHERE VEHICLE_NO = ?";
    private static final String DELETE_SQL  = "DELETE FROM VEHICLE WHERE VEHICLE_NO = ?";

    private final DataSource dataSource;

    public PlainJdbcVehicleDao(DataSource dataSource){
        this.dataSource = dataSource;
    }


    @Override
    public void insert(Vehicle vehicle) {

    }

    @Override
    public void insert(Iterable<Vehicle> vehicle) {

    }

    @Override
    public void update(Vehicle vehicle) {

    }

    @Override
    public void delete(Vehicle vehicle) {

    }

    @Override
    public Vehicle findByVehicleNo(String vehicleNo) {
        return null;
    }

    @Override
    public List<Vehicle> findAll() {
        return null;
    }
}
