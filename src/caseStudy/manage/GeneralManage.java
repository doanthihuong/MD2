package caseStudy.manage;

import caseStudy.mode1.Bus;

public interface GeneralManage<T>{
//    void add (T t);
    T findById(int id);
//    void edit(int id, T t);
    void delete(int id);
//    void printAll();
}
