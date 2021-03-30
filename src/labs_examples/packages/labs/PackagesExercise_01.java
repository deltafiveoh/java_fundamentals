package labs_examples.packages.labs;

/**
 * Packages Exercise 1: Protected modifier
 *
 *      1) Within this package, create two new labs_examples.packages.
 *      2) Create a new Java class in each package.
 *      3) Create at least two methods in each class, with at least one with the protected access modifier
 *      4) Demonstrate how the the protected access modifier restricts access from package to package
 *
 */

// Public is open to all packages within the program. Private variables and methods are only open to methods within the same class. This is why we often use
// public getters and setters. The variables are private to the class (encapsulated) and can not be accessed outside the class. Protected implies only that classes within the same package
// and sub-classes (children) within the package or children within another package that inherit from the protected parent can access the variables or methods inside. Default takes away the
// ability of sub-classes outside the package to modify.