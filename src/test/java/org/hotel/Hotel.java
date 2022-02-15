package org.hotel;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;

public class Hotel {
	public static void main(String[] args, int CCcvv) throws Exception {
		BaseClass baseClass = new BaseClass();
		baseClass.getdriver();
		baseClass.Url("https://adactinhotelapp.com/");
		baseClass.sleep(2000);
	   WebElement txtUser = baseClass.FindLocatorById("username");
	   String userName = baseClass.getData("Sheet1", 1, 0);
	   baseClass.TypeText(txtUser, userName);
	   WebElement btnLogin = baseClass.FindLocatorById("login");
	   btnLogin.click();
	   
	   baseClass.sleep(2000);
	   WebElement dDnLocation = baseClass.FindLocatorById("location");
	   baseClass.dDnByIndex(dDnLocation, 1);
	   WebElement dDnHotel = baseClass.FindLocatorById("hotels");
	   baseClass.dDnByIndex(dDnHotel, 1);
	   WebElement dDnRoom = baseClass.FindLocatorById("room_type");
	   baseClass.dDnByIndex(dDnRoom, 1);
	   WebElement dDnRoomNos = baseClass.FindLocatorById("room_nos");
	   baseClass.dDnByIndex(dDnRoomNos, 1);
	   WebElement dDnAdultRoom = baseClass.FindLocatorByClassName("adult_room");
	   baseClass.dDnByIndex(dDnAdultRoom, 1);
	   WebElement dDnChildRoom = baseClass.FindLocatorById("child_room");
	   baseClass.dDnByIndex(dDnChildRoom, 1);
	   WebElement btnSubmit = baseClass.FindLocatorById("Submit");
	   baseClass.Click(btnSubmit);
	   
	   baseClass.sleep(2000);
	   
	   WebElement clkCheckBox = baseClass.FindLocatorById("radiobutton_0");
	   baseClass.Click(clkCheckBox);
	   WebElement btnContinue = baseClass.FindLocatorById("continue");
	   baseClass.Click(btnContinue);
	   
	   baseClass.sleep(2000);
	   
	   WebElement txtFirstName = baseClass.FindLocatorById("first_name");
	   String firstName = baseClass.getData("Sheet1", 8, 1);
	   baseClass.TypeText(txtFirstName, firstName);
	   WebElement txtLastName = baseClass.FindLocatorById("last_namae");
	   String lastName = baseClass.getData("Sheet1", 9, 1);
	   baseClass.TypeText(txtLastName, lastName);
	   WebElement txtAddress = baseClass.FindLocatorById("address");
	   String address = baseClass.getData("Sheet1", 11, 1);
	   baseClass.TypeText(txtAddress, address);
	   WebElement txtCvv = baseClass.FindLocatorById("cc_num");
	   String ccNum = baseClass.getData("Sheet1", 12, 1);
	   baseClass.TypeText(txtCvv, ccNum);
	   WebElement dDnCCType = baseClass.FindLocatorById("cc_type");
	   baseClass.dDnByIndex(dDnCCType, 1);
	   WebElement dDnCCExpMonth = baseClass.FindLocatorById("cc_exp_month");
	   baseClass.dDnByIndex(dDnCCExpMonth, 5);
	   WebElement dDnExpYear = baseClass.FindLocatorById("cc_exp_year");
	   baseClass.dDnByIndex(dDnExpYear, 12);
	   WebElement txtCCcvv = baseClass.FindLocatorById("cc_cvv");
	   String CCcvv1 = baseClass.getData("Sheet1", 14, 1);
	   baseClass.TypeText(txtCCcvv, CCcvv1);
	   WebElement btnBook = baseClass.FindLocatorById("book_now");
	   baseClass.Click(btnBook);
	   
	   baseClass.sleep(2000);
	   
	   WebElement txtOrderNo = baseClass.FindLocatorById("order_no");
	   String OrderNo = baseClass.getAttribe(txtOrderNo);
	   baseClass.writedata("Sheet1", 15, 1, OrderNo);
	   
	}
	   
}	   


