package caseStudy.manage;

import caseStudy.mode1.Bus;

import java.util.ArrayList;
import java.util.List;

public class BusManage implements GeneralManage {
    List<Bus> busList = new ArrayList<>();
    public List<Bus> getBusList() {
        return busList;
    }
    @Override
    public void add(Object o) {
        Bus bus = null;
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

    @Override
    public void edit(int id, Object o) {
        Bus bus = new Bus();
        busList.set(findIndexById(id), bus);
    }


    @Override
    public void delete(int id) {
        busList.remove(findIndexById(id));
    }

    @Override
    public void printAll() {
        for (int i=0; i<busList.size(); i++) {
            System.out.println(busList.get(i));
        }
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