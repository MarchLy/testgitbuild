package com.example.thithu3;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
    private List<SinhVien> listSinhVien = new ArrayList<>();

    public List<SinhVien> getAllSinhVien(){
        return listSinhVien;
    }

    public void addSinhVien(SinhVien sinhVien){
        listSinhVien.add(sinhVien);
    }

    public void deleteSinhVien(SinhVien sinhVien){
        listSinhVien.remove(sinhVien);
    }

    public void updateSinhVien(SinhVien sinhVien){
        int index = listSinhVien.indexOf(sinhVien);
        if(index!= -1){
            listSinhVien.set(index, sinhVien);
        }
    }

//    public SinhVien findById(int id){
//        for(SinhVien sinhVien : listSinhVien){
//            if(sinhVien.getId() == id){
//                return sinhVien;
//            }
//        }
//        return null;
//    }

}
