# Order Management System (Gestión de Pedidos)

## Project overview

Simple Java console application that manages customer orders. It was made for the
*Entornos de Desarrollo* subject and it shows basic object-oriented programming:
inheritance, abstract classes and polymorphism.

Main classes (package `modelo`):

| Class | Description |
|-------|-------------|
| `Cliente` | Customer: name, email and address |
| `Producto` | Abstract class for every product (name and base price) |
| `ProductoFisico` | Physical product: price + 21% VAT + shipping cost |
| `ProductoDigital` | Digital product: price + 21% VAT - 15% discount |
| `Pedido` | Order of a customer with a list of products and its total |

The class `principal.Main` creates some products, customers and orders and prints
a summary of each order.

## Project structure

The project follows a simple Maven structure:

- `src/main/java/modelo/` contains the main domain classes.
- `src/main/java/principal/` contains the application entry point.
- `src/test/java/` contains the unit tests.
- `pom.xml` contains the Maven project configuration.
- `README.md` contains the project documentation.
- `CONTRIBUTING.md` contains the contribution guidelines.

## Prerequisites

- [Java JDK 17](https://adoptium.net/) or higher
- [Apache Maven](https://maven.apache.org/) 3.6 or higher
- [Git](https://git-scm.com/)

You can check your versions with:

```bash
java -version
mvn -version
git --version
```

## Setup

1. Clone the repository:

   ```bash
   git clone https://github.com/millannnn120/gestion-pedidos-proyecto.git
   cd <your-repository>
   ```

2. Compile the project:

   ```bash
   mvn compile
   ```

3. Run the program:

   ```bash
   mvn exec:java -Dexec.mainClass="principal.Main"
   ```

   Or, without the exec plugin:

   ```bash
   java -cp target/classes principal.Main
   ```

4. Run the unit tests (JUnit 5):

   ```bash
   mvn test
   ```

5. (Optional) Generate the Javadoc HTML documentation:

   ```bash
   mvn javadoc:javadoc
   ```

   The result is created in `target/site/apidocs/index.html`.

## Contributing

Please read [CONTRIBUTING.md](CONTRIBUTING.md) before opening a Pull Request.
