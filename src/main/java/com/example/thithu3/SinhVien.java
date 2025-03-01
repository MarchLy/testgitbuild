package com.example.thithu3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class SinhVien {
    private String maSV;
    private String ten;
    private int tuoi;
    private float diemTB;
    private int kyHoc;
    private String chuyenNganh;

}
