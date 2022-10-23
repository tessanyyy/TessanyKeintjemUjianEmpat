package com.juaracoding.appium.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class Calculator {
    public AndroidDriver<MobileElement> driver;

    public Calculator(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //Locator
    @AndroidFindBy(id = "com.google.android.calculator:id/digit_1")
    MobileElement btnSatu;
    @AndroidFindBy(id = "com.google.android.calculator:id/digit_2")
    MobileElement btnDua;
    @AndroidFindBy(id = "com.google.android.calculator:id/digit_3")
    MobileElement btnTiga;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_4")
    MobileElement btnEmpat;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_6")
    MobileElement btnEnam;
    @AndroidFindBy(id = "com.google.android.calculator:id/eq")
    MobileElement btnSamaDengan;
    @AndroidFindBy(id = "com.google.android.calculator:id/op_add")
    MobileElement btnTambah;
    @AndroidFindBy(id = "com.google.android.calculator:id/op_sub")
    MobileElement btnKurang;
    @AndroidFindBy(id = "com.google.android.calculator:id/op_mul")
    MobileElement btnPerkalian;
    @AndroidFindBy(id = "com.google.android.calculator:id/op_div")
    MobileElement btnPembagian;
    @AndroidFindBy(id = "com.google.android.calculator:id/result_final")
    MobileElement hasil;


    public void calcKurang() {
        btnEmpat.click();
        System.out.println("Click button angka 4");
        btnKurang.click();
        System.out.println("Click button kurang");
        btnDua.click();
        System.out.println("Click button angka 2");
        btnSamaDengan.click();
        System.out.println("Click button sama dengan");
    }

    public void calcKali() {
        btnDua.click();
        System.out.println("Click button angka 2");
        btnPerkalian.click();
        System.out.println("Click button perkalian");
        btnTiga.click();
        System.out.println("Click button angka 3");
        btnSamaDengan.click();
        System.out.println("Click button sama dengan");
    }

    public void calcBagi() {
        btnEnam.click();
        System.out.println("Click button angka 6");
        btnPembagian.click();
        System.out.println("Click button pembagian");
        btnTiga.click();
        System.out.println("Click button angka 3");
        btnSamaDengan.click();
        System.out.println("Click button sama dengan");
    }

    public String getTxtHasil() {
        return hasil.getText();
    }

}