package com.rt.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.rt.utils.UtilityClass;

public class SalePage extends UtilityClass{
	
	WebDriver driver;

	public SalePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//span[text()='SALE']")
	WebElement saleLink;
	@FindBy(xpath = "//div[@class='sidebarBlock-headingWrapper']")
	List<WebElement> filters;

	@FindBy(xpath = "//div[@class='label-tab hidden-on-mobile']")
	WebElement sortBy;
	@FindBy(xpath = "//ul[@class='dropdown-menu list-unstyled hidden-on-mobile']/li/span")
	List<WebElement> sortByList;

	@FindBy(xpath = "//div[@class='card-product']")
	List<WebElement> listOfProducts;
	@FindBy(xpath = "//form[@class='variants']/a[text()='Quick Add']")
	List<WebElement> listOfQuickAdd;
	@FindBy(xpath = "//div[@class='card-information__wrapper text-left']/h3/a")
	List<WebElement> listOfProductName;
	@FindBy(xpath = "//span[@class='price-item price-item--sale']")
	List<WebElement> listOfProductPrice;

	@FindBy(xpath = "//a[@class='button button--secondary']")
	WebElement showMoreProductButton;
	@FindBy(xpath = "//div[@class='pagination-page-item pagination-page-total']")
	WebElement paginationResult;

	public void openSaleLink() {
		saleLink.click();
	}

	public void loopForIsDisplayed(List<WebElement> ele, int no) {
		for (int i = no; i < ele.size(); i++) {
			Assert.assertTrue(ele.get(i).isDisplayed(), "Webelement not displayed.");
		}
	}

	public void loopForIsEnabled(List<WebElement> ele, int no) {
		for (int i = no; i < ele.size(); i++) {
			Assert.assertTrue(ele.get(i).isEnabled(), "Webelement not enabled.");
		}
	}

	/*
	 * public void verifyfiltersPresenceAndEnable() { openSaleLink();
	 * loopForIsDisplayed(filters, 0);
	 * System.out.println("Filters are present on the page.");
	 * loopForIsEnabled(filters, 0); System.out.println("Filters are enabled."); }
	 * 
	 * public void verifySortByFilter() throws InterruptedException {
	 * openSaleLink(); Assert.assertTrue(sortBy.isEnabled(),
	 * "Sort By filter is not enabled.");
	 * System.out.println("Sort By filter is enabled."); sortBy.click();
	 * Thread.sleep(10000); for (int i = 0; i < sortByList.size() - 6; i++) {
	 * Assert.assertTrue(sortByList.get(i).isDisplayed(),
	 * "Sort by filters are not displayed."); System.out.println("Sort By filter -"
	 * + sortByList.get(i).getText()); } for (int i = 4; i < sortByList.size() - 2;
	 * i++) { Assert.assertTrue(sortByList.get(i).isDisplayed(),
	 * "Sort by filters are not displayed."); System.out.println("Sort By filter -"
	 * + sortByList.get(i).getText()); } }
	 */

	public void verifyProductPricesPresence() throws InterruptedException {
		openSaleLink();
		for (int i = 0; i < listOfProductPrice.size(); i++) {
			Assert.assertTrue(listOfProductPrice.get(i).isDisplayed(), "Prices of the products are not displayed.");
		}
		
		  Thread.sleep(10000); showMoreProductButton.click();
		  loopForIsDisplayed(listOfProductPrice, 20); Thread.sleep(10000);
		  showMoreProductButton.click(); Thread.sleep(10000);
		  loopForIsDisplayed(listOfProductPrice,40); Thread.sleep(10000);
		  //showMoreProductButton.click(); 
		  Thread.sleep(10000);
		  //loopForIsDisplayed(listOfProductPrice,60);
		 
		System.out.println("Prices of the products are displayed.");
		System.out.println(paginationResult.getText() + " ");
	}

	public void verifyProductNamePresence() throws InterruptedException {
		openSaleLink();
		for (int i = 0; i < listOfProductName.size(); i++) {
			Assert.assertTrue(listOfProductName.get(i).isDisplayed(), "Product names are not displayed.");
		}
		
		  Thread.sleep(10000); showMoreProductButton.click();
		  loopForIsDisplayed(listOfProducts, 20); Thread.sleep(10000);
		  showMoreProductButton.click(); Thread.sleep(10000);
		  loopForIsDisplayed(listOfProducts, 40);
		 
		System.out.println("Product names are displayed.");
		System.out.println(paginationResult.getText() + " ");
	}

	public void verifyProductsOnThePage() throws InterruptedException {
		openSaleLink();
		for (int i = 0; i < listOfProducts.size(); i++) {
			Assert.assertTrue(listOfProducts.get(i).isDisplayed(), "Product images not displayed.");
		}
		
		  Thread.sleep(10000); showMoreProductButton.click();
		  loopForIsDisplayed(listOfProducts, 20); Thread.sleep(10000);
		  showMoreProductButton.click(); Thread.sleep(10000);
		  loopForIsDisplayed(listOfProducts, 40);
		 

		System.out.println("Images of the products are displayed.");
		System.out.println(paginationResult.getText() + " ");
	}

	public void verifyProductsQuickAddEnable() throws InterruptedException {
		openSaleLink();
		for (int i = 0; i < listOfQuickAdd.size(); i++) {
			Assert.assertTrue(listOfQuickAdd.get(i).isEnabled(), "Products Quick Add button is not displayed.");
		}
		
		  Thread.sleep(10000); showMoreProductButton.click(); loopForIsEnabled(filters,
		  20); showMoreProductButton.click(); loopForIsEnabled(filters, 40);
		 
		System.out.println("Quick Add button on the products card is displayed and enabled.");
		System.out.println(paginationResult.getText() + " ");
	}

	public void verifyPageURL() {
		openSaleLink();
		verifyPageURL("https://rebeccataylor.com/collections/sale");
	}

	public void verifyPageTitle() {
		openSaleLink();
		verifyPageTitle("Women's Clothing & Dresses Sale | Rebecca Taylor");
	}
	public void verifyPageLoadTimeOfThePage() {
		openSaleLink();
		verifyPageLoadTime();
	}

}
