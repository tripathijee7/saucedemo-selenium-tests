# saucedemo-selenium-tests
SauceDemo Automation Testing This repository contains an automated test script using Selenium to perform end-to-end testing on the Sauce Demo website.

Overview The script automates the following steps:

Navigate to the Sauce Demo website. Verify the page title. Perform login with valid credentials. Add the third product to the cart. Verify the product is added to the cart. Complete the checkout process. Verify the order success message. Technologies Used IDE: Eclipse or IntelliJ Automation Tool: Selenium WebDriver Language: Java Setup Instructions Clone the Repository:

bash: git clone

Install Dependencies: Ensure you have Java Development Kit (JDK) installed. Download and add the Selenium library to your project. Download the appropriate browser driver (e.g., ChromeDriver). Import the Project:

Open Eclipse or IntelliJ. Import the project as a Maven or Java project. Add the Selenium and WebDriver dependencies to your project. Set Up the Environment:

Place the browser driver executable in your system's PATH or specify its location in the script. Steps Automated Navigate to the Sauce Demo Website:

URL: https://www.saucedemo.com Verify Page Title:

Print the title of the page to the console. Login:

Username: standard_user Password: secret_sauce Click the "Login" button. Add Product to Cart:

Click "Add to Cart" for the third product on the page. Verify Product in Cart:

Click the cart icon in the top-right corner. Ensure the product is displayed in the cart. Checkout Process:

Click the "Checkout" button. Fill out the checkout form with the following details: First Name: Test Last Name: User Zip Code: 12345 Click "Continue." Complete the Order:

Click the "Finish" button. Verify Success Message:

Confirm the message "THANK YOU FOR YOUR ORDER" is displayed on the success page. Execution Run the test script in your preferred IDE (Eclipse or IntelliJ). Observe the steps being executed automatically in the browser. Expected Output The test script should: Successfully log in. Add the third product to the cart. Complete the checkout process. Display the success message: "THANK YOU FOR YOUR ORDER". Contributing Feel free to fork this repository and submit pull requests for improvements or additional test cases.
