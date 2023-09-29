#  Ecommerce Website Automation Testing
Automating the testing process for an ecommerce website, combining my proficiency in Selenium WebDriver, TestNG, and Maven. 

https://www.saucedemo.com

**Objective:**  
The objective of this automated testing project is to validate the functionality and user flow of an ecommerce website. The automation tests cover various scenarios, including user login, product browsing, cart management, checkout process, and user logout.  

**Automation Framework:**  
The automated tests are implemented using the Selenium WebDriver framework in Java, with TestNG as the testing framework. The project is structured in Maven to manage dependencies, and tests are executed on Edge and Chrome for cross-browser compatibility.  

**Test Cases:**

**Step 1:** Log-in  
Action: Log in with user-id="standard_user" and password="secret_sauce".  
Expected Result: Successful login, landing on the all products page.

**Step 2:** Navigate to Product Page  
Action: Click on a product to go to the specified product page.  
Expected Result: Successfully navigated to the product page.

**Step 3:** Add to Cart  
Action: Add the product to the cart.  
Expected Result: Product added to the cart successfully.

**Step 4:** Return to All Products Page  
Action: Navigate back to the all products page.  
Expected Result: Successfully returned to the all products page.

**Step 5:** Add Multiple Products  
Action: Add a bunch of products directly from the all products page.  
Expected Result: Multiple products added to the cart.

**Step 6:** Go to Cart  
Action: Navigate to the cart.  
Expected Result: Successfully reached the shopping cart page.

**Step 7:** Remove Product  
Action: Remove a product from the cart.  
Expected Result: Selected product removed from the cart.

**Step 8:** Checkout  
Action: Initiate the checkout process.  
Expected Result: Successfully initiated the checkout process.

**Step 9:** Add Information  
Action: Add personal information for checkout.  
Expected Result: Information added successfully.

**Step 10:** Continue  
Action: Continue with the checkout process.  
Expected Result: Successfully moved to the next step of checkout.

**Step 11:** Print Payment Information  
Action: Print payment information.  
Expected Result: Payment information displayed.

**Step 12:** Print Shipping Information  
Action: Print shipping information.  
Expected Result: Shipping information displayed.

**Step 13:** Print Price Information  
Action: Print price information.  
Expected Result: Price information displayed.

**Step 14:** Finish  
Action: Complete the checkout process.  
Expected Result: Checkout completed successfully.

**Step 15:** Print Order Confirmation  
Action: Print order complete confirmation.  
Expected Result: Order completion confirmation displayed.

**Step 16:** Back Home  
Action: Navigate back to the home page.  
Expected Result: Successfully returned to the home page.

**Step 17:** Open Nav Menu  
Action: Open the navigation menu.  
Expected Result: Navigation menu displayed.

**Step 18:** Log-out  
Action: Log out from the application.  
Expected Result: Successfully logged out.  



**Here are the main functions verified through this project:**

**1. User Authentication (Login and Logout):**  
The ability of users to log in with valid credentials.  
Secure handling of authentication errors.  
Proper session management and logout functionality.

**2. Product Management:**  
Navigation to product details page.  
Adding products to the shopping cart.  
Viewing and removing products from the cart.  
Handling product quantity and variations.

**3. Shopping Cart Functionality:**  
Proper calculation and display of total prices in the cart.  
Ability to add and remove multiple products.  
Handling edge cases, such as an empty cart.

**4. Checkout Process:**  
Initiation of the checkout process.  
Step-by-step progression through the checkout stages.  
Collection of user information for shipping and payment.  
Proper validation of user inputs during checkout.

**5. Order Confirmation:**  
Confirmation of the completed order.  
Display of order details, including payment and shipping information.
