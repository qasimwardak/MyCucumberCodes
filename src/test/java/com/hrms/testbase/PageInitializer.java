package com.hrms.testbase;

import com.hrms.pages.*;

public class PageInitializer extends BaseClass {

    public static LoginPage loginPage;
    public static DashboardPage dashboardPage;
    public static EmployeeListPage employeeListPage;
    public static AddEmployeePage addEmployeePage;
    public static PersonalDetailPage personalDetailPage;


    public static void initializePageObject(){
        loginPage=new LoginPage();
        dashboardPage=new DashboardPage();
        employeeListPage=new EmployeeListPage();
        addEmployeePage=new AddEmployeePage();
        personalDetailPage=new PersonalDetailPage();

    }
}
