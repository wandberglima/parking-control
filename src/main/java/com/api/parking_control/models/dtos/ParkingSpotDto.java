package com.api.parking_control.models.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ParkingSpotDto {

    @NotBlank
    private String parkingSpotNumber;

    @NotBlank
    @Size(max = 7)
    private String licensePlateCar;

    @NotBlank
    private String brandCar;

    @NotBlank
    private String modelCar;

    @NotBlank
    private String colorCar;

    @NotBlank
    private String responsibleName;

    @NotBlank
    private String apartment;

    @NotBlank
    private String block;

    public @NotBlank String getParkingSpotNumber() {
        return parkingSpotNumber;
    }

    public void setParkingSpotNumber(@NotBlank String parkingSpotNumber) {
        this.parkingSpotNumber = parkingSpotNumber;
    }

    public @NotBlank @Size(max = 7) String getLicensePlateCar() {
        return licensePlateCar;
    }

    public void setLicensePlateCar(@NotBlank @Size(max = 7) String licensePlateCar) {
        this.licensePlateCar = licensePlateCar;
    }

    public @NotBlank String getBrandCar() {
        return brandCar;
    }

    public void setBrandCar(@NotBlank String brandCar) {
        this.brandCar = brandCar;
    }

    public @NotBlank String getModelCar() {
        return modelCar;
    }

    public void setModelCar(@NotBlank String modelCar) {
        this.modelCar = modelCar;
    }

    public @NotBlank String getColorCar() {
        return colorCar;
    }

    public void setColorCar(@NotBlank String colorCar) {
        this.colorCar = colorCar;
    }

    public @NotBlank String getResponsibleName() {
        return responsibleName;
    }

    public void setResponsibleName(@NotBlank String responsibleName) {
        this.responsibleName = responsibleName;
    }

    public @NotBlank String getApartment() {
        return apartment;
    }

    public void setApartment(@NotBlank String apartment) {
        this.apartment = apartment;
    }

    public @NotBlank String getBlock() {
        return block;
    }

    public void setBlock(@NotBlank String block) {
        this.block = block;
    }
}
