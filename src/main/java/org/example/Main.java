package org.example;

import org.example.configuration.SessionFactoryUtil;
import org.example.dao.CompanyDao;
import org.example.entity.Company;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SessionFactoryUtil.getSessionFactory().openSession();

        Company company = new Company(
                "Neste2",
                LocalDate.of(2000, 3,3),
                1000
        );
        int company_id = 5;

        try {
            Company company1 = CompanyDao.getCompanyById(company_id);
            System.out.println(company1);

            company1.setName("Nestle edited");
            CompanyDao.updateCompany(company1);

            System.out.println(CompanyDao.getCompanyById(company1.getId()));
            CompanyDao.deleteCompany(company1);
        } catch (Exception e) {
            System.out.println("Not company with id " + company_id);
        }


        CompanyDao.getCompanies()
                .stream()
                .forEach(System.out::println);
    }
}