package com.rt.clothing.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rt.base.BaseClass;
import com.rt.pages.clothing.TopsPage;

public class Tops_Test extends BaseClass{
	
	TopsPage obj;
	
	@BeforeMethod
	public void loadObject() {
		obj = new TopsPage(driver);
	}
	@Test
	public void verifyColorSwatchesPresenceAndEnable() throws InterruptedException {
		obj.verifyColorSwatchesPresenceAndEnable();
	}
	@Test
	public void verifyPageURL() throws InterruptedException {
		obj.verifyPageURL();
	}
	@Test
	public void verifyPageTitle() throws InterruptedException{
		obj.verifyPageTitle();
	}
	@Test
	public void verifyPageLoadTime() throws InterruptedException{
		obj.verifyPageLoadTimeOfThePage();
	}
	@Test
	public void verifyProductsOnThePage() throws InterruptedException {
		obj.verifyProductsOnThePage();
	}
	@Test
	public void verifyProductsQuickAddEnable() throws InterruptedException {
		obj.verifyProductsQuickAddEnable();
	}
	@Test
	public void verifyProductPricesPresence() throws InterruptedException {
		obj.verifyProductPricesPresence();
	}

	@Test
	public void verifyProductNamePresence() throws InterruptedException {
		obj.verifyProductNamePresence();
	}
	@Test
	public void verifyfiltersPresenceAndEnable() throws InterruptedException {
		obj.verifyfiltersPresenceAndEnable();
	}
	@Test
	public void verifySortByFilter() throws InterruptedException {
		obj.verifySortByFilter();
	}

}
