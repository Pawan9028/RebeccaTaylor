/*
 * package com.rt.pages.collections;
 * 
 * import java.util.List; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; import
 * org.openqa.selenium.interactions.Actions; import
 * org.openqa.selenium.support.FindBy; import
 * org.openqa.selenium.support.PageFactory; import org.testng.Assert; import
 * com.rt.utils.UtilityClass;
 * 
 * public class TheWhiteEditPage extends UtilityClass{
 * 
 * WebDriver driver; public TheWhiteEditPage(WebDriver driver) { super(driver);
 * this.driver = driver; PageFactory.initElements(driver,this); }
 * 
 * @FindBy(xpath = "//span[text()='Collections']") WebElement clothingTab;
 * 
 * @FindBy(xpath =
 * "//li[@class='menu-lv-item menu-lv-2 text-left   menu-lv-blink']/a/span")
 * List<WebElement> listOfMegaMenu;
 * 
 * @FindBy(xpath = "//div[@class='sidebarBlock-headingWrapper']")
 * List<WebElement> filters;
 * 
 * @FindBy(xpath = "//div[@class='label-tab hidden-on-mobile']") WebElement
 * sortBy;
 * 
 * @FindBy(xpath =
 * "//ul[@class='dropdown-menu list-unstyled hidden-on-mobile']/li/span")
 * List<WebElement> sortByList;
 * 
 * @FindBy(xpath = "//div[@class='card-product']") List<WebElement>
 * listOfProducts;
 * 
 * @FindBy(xpath = "//form[@class='variants']/a[text()='Quick Add']")
 * List<WebElement> listOfQuickAdd;
 * 
 * @FindBy(xpath =
 * "//div[@class='card-information']/div[@class='card-information__wrapper text-center']/h3/a"
 * ) List<WebElement> listOfProductName;
 * 
 * @FindBy(xpath = "//div[@class='card-price']") List<WebElement>
 * listOfProductPrice;
 * 
 * @FindBy(xpath = "//a[@class='active swatch-item']") List<WebElement>
 * activeColorSwatch;
 * 
 * @FindBy(xpath = "//a[@class='swatch-item']") List<WebElement> colorSwatch;
 * 
 * @FindBy(xpath =
 * "//div[@class='needsclick  kl-private-reset-css-Xuajs1']/button[@class='needsclick klaviyo-close-form go1982198487 kl-private-reset-css-Xuajs1']"
 * ) private WebElement pop_up;
 * 
 * @FindBy(xpath = "//a[@class='button button--secondary']") WebElement
 * showMoreProductButton;
 * 
 * @FindBy(xpath = "//div[@class='pagination-page-item pagination-page-total']")
 * WebElement paginationResult;
 * 
 * public void methodToOpenTheWhiteEditPage() { Actions action = new
 * Actions(driver); action.moveToElement(clothingTab).build().perform();
 * listOfMegaMenu.get(8).click(); } public void pop_up_Handle() {
 * System.out.println("Checking for Pop_up is present or not");
 * if(pop_up.isDisplayed()) { System.out.println("Pop_up is present.");
 * pop_up.click(); }else { System.out.println("Pop_up is not present."); } }
 * 
 * public void loopForIsDisplayed(List<WebElement> ele, int no) { for (int i =
 * no; i < ele.size(); i++) { Assert.assertTrue(ele.get(i).isDisplayed(),
 * "Webelement not displayed."); } }
 * 
 * public void loopForIsEnabled(List<WebElement> ele, int no) { for (int i = no;
 * i < ele.size(); i++) { Assert.assertTrue(ele.get(i).isEnabled(),
 * "Webelement not enabled."); } } public void
 * verifyColorSwatchesPresenceAndEnable() throws InterruptedException {
 * pop_up_Handle(); methodToOpenTheWhiteEditPage();
 * loopForIsDisplayed(activeColorSwatch, 0); loopForIsDisplayed(colorSwatch, 0);
 * loopForIsEnabled(activeColorSwatch, 0); loopForIsEnabled(colorSwatch, 0);
 * Thread.sleep(10000); System.out.
 * println("Color swatches below the products on PLP is displayed and enabled."
 * ); }
 * 
 * public void verifyfiltersPresenceAndEnable() { pop_up_Handle();
 * methodToOpenTheWhiteEditPage(); loopForIsDisplayed(filters, 0);
 * System.out.println("Filters are present on the page.");
 * loopForIsEnabled(filters, 0); System.out.println("Filters are enabled."); }
 * 
 * public void verifySortByFilter() throws InterruptedException {
 * pop_up_Handle(); methodToOpenTheWhiteEditPage();
 * Assert.assertTrue(sortBy.isEnabled(), "Sort By filter is not enabled.");
 * System.out.println("Sort By filter is enabled."); sortBy.click();
 * Thread.sleep(10000); for (int i = 0; i < sortByList.size() - 6; i++) {
 * Assert.assertTrue(sortByList.get(i).isDisplayed(),
 * "Sort by filters are not displayed."); System.out.println("Sort By filter -"
 * + sortByList.get(i).getText()); } for (int i = 4; i < sortByList.size() - 2;
 * i++) { Assert.assertTrue(sortByList.get(i).isDisplayed(),
 * "Sort by filters are not displayed."); System.out.println("Sort By filter -"
 * + sortByList.get(i).getText()); } }
 * 
 * public void verifyProductPricesPresence() throws InterruptedException {
 * pop_up_Handle(); methodToOpenTheWhiteEditPage(); for (int i = 0; i <
 * listOfProductPrice.size(); i++) {
 * Assert.assertTrue(listOfProductPrice.get(i).isDisplayed(),
 * "Prices of the products are not displayed."); } Thread.sleep(100);
 * System.out.println("Prices of the products are displayed."); }
 * 
 * public void verifyProductNamePresence() throws InterruptedException {
 * pop_up_Handle(); methodToOpenTheWhiteEditPage(); for (int i = 0; i <
 * listOfProductName.size(); i++) {
 * Assert.assertTrue(listOfProductName.get(i).isDisplayed(),
 * "Product names are not displayed."); } Thread.sleep(100);
 * System.out.println("Product names are displayed."); }
 * 
 * public void verifyProductsOnThePage() throws InterruptedException {
 * pop_up_Handle(); methodToOpenTheWhiteEditPage(); for (int i = 0; i <
 * listOfProducts.size(); i++) {
 * Assert.assertTrue(listOfProducts.get(i).isDisplayed(),
 * "Product images not displayed."); } Thread.sleep(100);
 * System.out.println("Images of the products are displayed."); }
 * 
 * public void verifyProductsQuickAddEnable() throws InterruptedException {
 * methodToOpenTheWhiteEditPage(); for (int i = 0; i < listOfQuickAdd.size();
 * i++) { Assert.assertTrue(listOfQuickAdd.get(i).isEnabled(),
 * "Products Quick Add button is not displayed."); } Thread.sleep(100);
 * System.out.
 * println("Quick Add button on the products card is displayed and enabled."); }
 * 
 * public void verifyPageURL() { pop_up_Handle();
 * methodToOpenTheWhiteEditPage();
 * verifyPageURL("https://rebeccataylor.com/collections/the-white-edit"); }
 * 
 * public void verifyPageTitle() { pop_up_Handle();
 * methodToOpenTheWhiteEditPage();
 * verifyPageTitle("Women's White Dresses & Clothing | Rebecca Taylor"); }
 * public void verifyPageLoadTimeOfThePage() { pop_up_Handle();
 * methodToOpenTheWhiteEditPage(); verifyPageLoadTime(); } }
 */