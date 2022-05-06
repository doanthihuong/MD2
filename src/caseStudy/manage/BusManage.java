package caseStudy.manage;

import caseStudy.mode1.Bus;

import java.util.ArrayList;
import java.util.List;

public class BusManage implements GeneralManage {
    List<Bus> busList = new ArrayList<>();

    public void add(Bus bus) {
        busList.add(bus);
    }

    public void display(Object o) {
        for (int i = 0; i < busList.size(); i++) {
            System.out.println(busList.get(i));

        }
    }

    @Override
    public Bus findById(int id) {
        return busList.get(findIndexById(id));
    }


    public void edit(int id, Bus bus) {
        busList.set(findIndexById(id), bus);
    }


    public void delete(int id) {
        int index = findIndexById(id);
        if (index == -1) {
            System.out.println(" ID không có trong danh sách ");
        } else {
            busList.remove(findIndexById(id));
            System.out.println("---------- Xóa thành công-------------");
        }
    }

    public void deleteAll() {
        busList.removeAll(busList);
    }

    public void printAll(String licensePlate) {
        for (int i=0; i<busList.size(); i++) {
            if(busList.get(i).getLicensePlate().contains(licensePlate)){
                System.out.println(busList.get(i));
            }
        }
        System.out.println("Xe không có danh sách");
    }



    public int findIndexById(int id) {
        for (int i=0; i<busList.size(); i++) {
            if (busList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}