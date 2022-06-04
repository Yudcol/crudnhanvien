/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author trand
 */
public class NhanVien {
    
    public String id; //id
    public String name; // tên
    public String cid; // chứng minh nhân dân
    public String birth; // ngày sinh
    public int sex; // giới tính
    public String address; // địa chỉ
    public String nation; // dân tộc
    public String religion; // tôn giáo
    public int department; // phòng ban
    public int position; // vị trí
    public int contract;  //loại hợp đồng
    public String contractTime; // thời gian hết hạn hợp đồng
    public String imgpath; // link ảnh

    public NhanVien() {
    }

    public NhanVien(String id, String name, String cid, String birth, int sex, String address, String nation, String religion, int department, int position, int contract, String contractTime, String imgpath) {
        this.id = id;
        this.name = name;
        this.cid = cid;
        this.birth = birth;
        this.sex = sex;
        this.address = address;
        this.nation = nation;
        this.religion = religion;
        this.department = department;
        this.position = position;
        this.contract = contract;
        this.contractTime = contractTime;
        this.imgpath = imgpath;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getContract() {
        return contract;
    }

    public void setContract(int contract) {
        this.contract = contract;
    }

    public String getContractTime() {
        return contractTime;
    }

    public void setContractTime(String contractTime) {
        this.contractTime = contractTime;
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }

    

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof NhanVien a)
               return this.id.equals(a.id);
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash =  37*hash + Objects.hashCode(this.id);
        return hash;
    }
}
