# ShopforHome Furniture


## Table of Contents
- [Problem Statement](#problem-statement)
- [Components of the Project](#components-of-the-project)
- [Core Concepts Used](#core-concepts-used)
  - [Frontend](#frontend)
  - [Backend](#backend)
  - [Database](#database)
  - [DevOps](#devops)
- [Operating Requirements](#operating-requirements)
- [Features of the Application](#features-of-the-application)
- [Recommended Technologies](#recommended-technologies)
- [Study of the System](#study-of-the-system)
  - [Modules](#modules)
    - [Admin Portal](#admin-portal)
      - [Manage Moderators](#manage-moderators)
      - [Manage Products](#manage-products)
      - [Manage Users](#manage-users)
      - [Manage Orders](#manage-orders)
    - [Moderator Module](#moderator-module)
    - [Users Portal](#users-portal)
      - [User Module](#user-module)
- [Project Users and Admin Stories](#project-users-and-admin-stories)
  - [User Stories](#user-stories)
  - [Admin Stories](#admin-stories)
- [Conclusion](#conclusion)

## Problem Statement
**Shop For Home** is a online store for shopping home décor items..

## Components of the Project
This full-stack application can be divided into three parts:
- **Frontend**
- **Backend**
- **Database**

## Core Concepts Used

### Frontend
- **HTML**
- **CSS3**
- **Bootstrap 4**
- **TypeScript**
- **Angular**
- **Angular Material** for UI components

### Backend
- **Eclipse IDE**
- **Java Programming**
- **Spring Boot DevTools**
- **Spring Web**
- **Spring Data JPA**
- **Searching and Sorting Algorithms**

### Database
- **SQL** for database management


## Operating Requirements
- **Operating Systems**:
  - Windows 7/8/10/11
  - Linux Distros
  - macOS X or later

## Features of the Application
1. **Registration**
2. **Login**
3. **Payment Gateway**
4. **Searching**
5. **Filtering**
6. **Sorting**
7. **Dynamic Data**
8. **Responsive and Compatible with Different Devices**

## Recommended Technologies
1. **Database Management**: SQL
2. **Backend Logic**: Spring Boot, Java Programming
3. **Frontend Development**: Angular, Bootstrap, HTML/CSS, JavaScript
4. **DevOps and Production Technologies**: Git, GitHub



#### Admin Portal
The administrator is the superuser of this application with exclusive access to the admin page. The admin manages all users and products. The admin can:
- Add or remove products to build a rich product line
- Edit product details like name, price, discount, and offers
- Enable or disable product items

**Sub-Modules:**
1. **Manage Moderators**
   - **Add Moderator**: Admin can add moderators who manage orders or specific product groups.
   - **Remove Moderator**: Admin can delete existing moderators.
   - **Search Moderator**: Admin can search for moderators by name.

2. **Manage Products**
   - **Add Products**: Admin can add new products with details and images.
   - **Delete Products**: Admin can delete products based on stock availability.
   - **Search Products**: Admin can search for products by name.

3. **Manage Users**
   - **View Users**: Admin can view all registered users' details except passwords.
   - **Add Users**: Admin can add users by providing necessary details.

4. **Manage Orders**
   - **View Orders**: Admin can view all user-generated orders and verify purchase details.
   - **Delete Orders**: Admin can delete orders once products are taken for delivery.

#### Moderator Module
Moderators assist the admin by managing orders and, in future updates, can manage their own products. Their privileges include:
- **Manage Products**
- **Manage Users**
- **Manage Orders**

#### Users Portal
Handles user activities, allowing end-users to:
- Sign in to maintain activity records
- Search for products based on keywords
- Add selected products to a cart
- Customize purchases
- Perform seamless payment processes
- View order summaries post-payment

**User Module:**
- **Registration**: Users register by providing essential details. Admin approves by unblocking them.
- **Login**: Users log in with username and password.
- **View Products**: Users view product lists and detailed descriptions.
- **Search Product**: Users search for products by name.
- **Add to Cart**: Users add desired products to the cart.
- **Submit Cart**: Users submit the cart with a delivery address, clearing the cart upon success.
- **History**: Users view pending orders.
- **Edit Profile**: Users can view and edit their profiles.


## Project Users and Admin Stories

### User Stories
1. **Authentication**: User should be able to login, logout, and register into the application.
2. **Product Browsing**: User should be able to see products in different categories.
3. **Sorting**: User should be able to sort the products.
4. **Cart Management**:User should be able to add products to the shopping cart.
5. **Quantity Adjustment**:Usershould be able to increase or decrease the quantity of items in the cart.
6. **Multiple Products**:User should be able to add multiple products to the cart.
7. **Wishlist**: User should have a wishlist option to save products for later.
8. **Discounts**:User should receive different discount coupons.

### Admin Stories
1. **Authentication**: Admin should be able to login, logout, and register into the application.
2. **User Management**: Admin should be able to perform CRUD (Create, Read, Update, Delete) operations on users.
3. **Product Management**: Admin should be able to perform CRUD operations on products.
4. **Bulk Upload**: Admin should have the option to bulk upload product details via CSV.
5. **Stock Management**:Admin should be able to monitor stock levels.
6. **Low Stock Alerts**:Admin should receive emails when any stock falls below 10 units.
7. **Sales Reporting**: Admin should be able to generate sales reports for specific durations.
8. **Coupon Management**: Admin should be able to set discount coupons for specific user groups.

## Conclusion
At the end of the project, we have developed a fully functional e-commerce website for furniture and home décor. The application facilitates online shopping, ensuring a smooth transition from offline to online operations.

