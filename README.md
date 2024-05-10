# Problem Solid Principle Dependency Inversion Principle (DIP)

The NEU Library offers a variety of resources, including books, theses, capstones, internet access, journals, and newspapers.

Currently, the __Student__ object has methods like __borrowBook()__, __borrowJournal()__ with a parameter of title, which directly depend on specific resource types.

To adhere to the __Dependency Inversion Principle (DIP)__ and ensure flexibility for future changes (such as introducing audio books or e-journals), we need to refactor the program while maintaining __SOLID principles.__ The goal is to create a robust system that can seamlessly accommodate new resource types in the future.

# UML Class Diagram
![Blank diagram](https://github.com/Route0702/Dependency-Inversion-Principle-DIP-/assets/103111416/640daa4e-a45e-4fdf-a0d0-ac86f33a88ee)
