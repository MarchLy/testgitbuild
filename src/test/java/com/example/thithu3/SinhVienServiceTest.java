package com.example.thithu3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinhVienServiceTest {

    private SinhVienService service;

    @Test
    void testUpdateSinhVienService(){
        service = new SinhVienService();
        SinhVien sinhVien = new SinhVien("1234567890", "John Doe", 31, 18, 1, "New York");
        SinhVien sinhVienUpdate = new SinhVien("1234567890", "John Doe", 31, 20, 3, "Los Angeles");

        service.updateSinhVien(sinhVienUpdate);

        assertEquals(sinhVienUpdate.getTen(), sinhVien.getTen());
        assertEquals(sinhVienUpdate.getTuoi(), sinhVien.getTuoi());
    }

}