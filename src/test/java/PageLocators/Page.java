package PageLocators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import runners.BaseClass;


public class Page extends BaseClass{
	
	public  Page() {
		PageFactory.initElements(getDriver(), this);}
//@FindBy(xpath="//i[@class='main-menu__user__right main-menu__usedevtools://devtools/bundled/devtools_app.html?remoteBase=https://chrome-devtools-frontend.appspot.com/serve_file/@89e2380a3e36c3464b5dd1302349b1382549290d/&can_dock=true&panel=elements&dockSide=undocked#r__right-login main-menu__user__right-login--email icon-user2']")
//private WebElement ac;

//@FindBy(id="input-loginbox-email")  
//private WebElement user;


//@FindBy(id="input-loginbox-password")
//private WebElement pass;
//
//@FindBy(xpath="//span[@class='branded-button-label']")
//private List<WebElement>btn;
//
//
//public List<WebElement> getBtn() {
//	return btn;
//}
//public void setBtn(List<WebElement> btn) {
//	this.btn = btn;
//}
//public WebElement getUser() {
//	return user;
//}
//public void setUser(WebElement user) {
//	this.user = user;
//}
//public WebElement getPass() {
//	return pass;
//}
//public void setPass(WebElement pass) {
//	this.pass = pass;
//}
//public WebElement getAc() {
//	return ac;
//}
//public void setAc(WebElement ac) {
//	this.ac = ac;

@FindBy(id="product-search-field")
private WebElement search;


@FindBy(xpath="//button[@class='search-nav__button search-nav__button--blue']")
private List<WebElement>btn;


public WebElement getSearch() {
	return search;
}


public void setSearch(WebElement search) {
	this.search = search;
}


public List<WebElement> getBtn() {
	return btn;
}


public void setBtn(List<WebElement> btn) {
	this.btn = btn;
}

}










	



		
		
	


