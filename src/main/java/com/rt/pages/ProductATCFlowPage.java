/*
 * package com.rt.pages; import java.util.List;
 * 
 * import org.openqa.selenium.JavascriptExecutor; import
 * org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement; import
 * org.openqa.selenium.interactions.Actions; import
 * org.openqa.selenium.support.FindBy; import
 * org.openqa.selenium.support.PageFactory; import org.testng.Assert;
 * 
 * public class ProductATCFlowPage {
 * 
 * public WebDriver driver;
 * 
 * public ProductATCFlowPage(WebDriver driver) { this.driver = driver;
 * PageFactory.initElements(driver, this); }
 * 
 * @FindBy(xpath = "//span[text()='COLLECTIONS']") WebElement collectionsTab;
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
 * @FindBy(xpath =
 * "//div[@class='addmore-main-section']/div[contains(text(),'More Colors')]")
 * private List<WebElement> listOfMoreColorsBtn;
 * 
 * @FindBy(xpath =
 * "//div[@class='size-option-cust size-option-cust-if']/span[@class='size-option']"
 * ) List<WebElement> listOfProductSize;
 * 
 * @FindBy(xpath = "//a[contains(text(),' View Bag')]") private WebElement
 * viewBag;
 * 
 * @FindBy(xpath = "//input[@name='quantity']") private List<WebElement>
 * listOfProductQty;
 * 
 * @FindBy(xpath =
 * "//div[@class='card-information']/div[@class='card-information__wrapper text-left']/h3/a"
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
 * @FindBy(xpath = "//button[text()='+ Add To Cart']")List<WebElement> atc;
 * 
 * @FindBy(xpath = "//span[text()='Shopping Bag']") WebElement shoppingText;
 * 
 * @FindBy(xpath =
 * "//div[@class='footer-block__item footer-block__column footer-block__newsletter newsletter__ text-left   newletter-colm']/div/h2"
 * ) private WebElement footerSignUpText;
 * 
 * @FindBy(xpath =
 * "//details[@class='search_details search_details--popup header--icon-border']"
 * ) private WebElement searchIcon;
 * 
 * @FindBy(xpath = "//input[@id='Search-In-Modal-Menu-Plain']")private
 * WebElement searchBox;
 * 
 * @FindBy(xpath = "//div[@class='swiper-wrapper']")private
 * List<WebElement>listOfSearchProducts;
 * 
 * @FindBy(id = "product-add-to-cart")private WebElement addToCartBtn;
 * 
 * @FindBy(xpath =
 * "//div[@class='header--account header--icon-border h-100 d-flex flex-align-center p-relative']"
 * ) private WebElement account_tab;
 * 
 * @FindBy(id = "CustomerEmail") private WebElement emailID;
 * 
 * @FindBy(id = "CustomerPassword") private WebElement pass;
 * 
 * @FindBy(xpath = "//button[@class='button button-1 button-checkout']")private
 * WebElement checkoutBtn;
 * 
 * @FindBy(xpath = "//div[@class='_1fragem1y _1fragemlj']/div/span/a")private
 * List<WebElement>listOfCheckoutPageLogo;
 * 
 * @FindBy(xpath =
 * "//div[@class='account-action']/a[contains(text(),'Logout')]")private
 * WebElement logOutBtn;
 * 
 * @FindBy(xpath =
 * "//div[@class='form-actions']/input[@class='button button-2']")private
 * List<WebElement> listOfSubmitBtn;
 * 
 * @FindBy(xpath =
 * "//div[@class='header-logo header-item header-item--side d-flex flex-align-center d-flex fs-0 fg-0 pt-2 pb-5']"
 * ) private WebElement logo;
 * 
 * ///// General flow methods ///////// public void pop_up_Handle() throws
 * InterruptedException {
 * System.out.println("Checking for Pop_up is present or not");
 * Thread.sleep(10000); if(pop_up.isDisplayed()) { pop_up.click();
 * System.out.println("Pop_up is present and handled."); }else {
 * System.out.println("Pop_up is not present."); } } /// LOG In method ?////
 * public void logInMethod() throws InterruptedException { pop_up_Handle();
 * account_tab.click(); emailID.sendKeys("pavan@aristasystems.in");
 * pass.sendKeys("Pawan@12345"); Thread.sleep(1000);
 * listOfSubmitBtn.get(1).click(); } ///Search product method/// public void
 * productSearchMethod() throws InterruptedException { searchIcon.click();
 * Thread.sleep(1000); searchBox.sendKeys("dress"); Thread.sleep(100);
 * listOfSearchProducts.get(1).click(); } ///add product to cart method////
 * public void productATCmethod() throws InterruptedException {
 * addToCartBtn.click(); viewBag.click(); Thread.sleep(1000); String prductQty =
 * listOfProductQty.get(0).getAttribute("value"); Assert.assertEquals(prductQty,
 * "1","Product quantity in cart is not equal to 1."); System.out.
 * println("Quick Add option on the products card is displayed and enabled.");
 * //logo.click(); } ///log out method//// public void logOutMethod() throws
 * InterruptedException { account_tab.click(); Thread.sleep(1000);
 * JavascriptExecutor js = (JavascriptExecutor) driver;
 * js.executeScript("arguments[0].scrollIntoView();", logOutBtn);
 * Thread.sleep(1000); logOutBtn.click(); } public void checkoutTest() throws
 * InterruptedException { checkoutBtn.click(); Thread.sleep(1000);
 * listOfCheckoutPageLogo.get(1).click(); }
 * 
 * public void VerifyPageScrollable() throws InterruptedException {
 * JavascriptExecutor js = (JavascriptExecutor) driver; //
 * js.executeScript("window.scrollBy(0, 2500)"); Thread.sleep(1000);
 * js.executeScript("arguments[0].scrollIntoView();", footerSignUpText);
 * Thread.sleep(10000);
 * js.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
 * //js.executeScript("arguments[0].scrollIntoView();", addToCartBtn);
 * //System.out.println(footerSignUpText.getText()); } //// User general flow of
 * shopping/// public void verifyUserFlowOfShopping() throws
 * InterruptedException { pop_up_Handle(); //logInMethod();
 * productSearchMethod(); VerifyPageScrollable(); productATCmethod();
 * checkoutTest(); //logOutMethod(); System.out.
 * println("General user shopping flow is tested by searching the 'Dress' products and added to the cart."
 * ); } }
 */