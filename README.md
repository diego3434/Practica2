Sistema  JavaFX

## Descripción del Potecyo

Aumento de un menu principal para el perfil de ADMINISTRADOR en donde de momento solo se le presentara la parte visual de un menu de un sistema de compras
en donde se epodra previsualizar como ira tomando forma el sistema 

## Captura del Dashboard

<img width="618" height="434" alt="image" src="https://github.com/user-attachments/assets/c9153518-45e5-4abf-b26b-deae4c27c5a3" />



## Tecnologías Utilizadas

* Java
* JavaFX
* Maven

## Funcionalidades Implementadas

* Inicio de sesión.
* Selección de rol (Administrador y Cajero).
* Navegación entre pantallas según el rol.
* Interfaz gráfica desarrollada con JavaFX.

## Estructura del Proyecto

```text
 C:.
│   .gitattributes
│   .gitignore
│   mvnw
│   mvnw.cmd
│   pom.xml
│   
├───.idea
│       .gitignore
│       compiler.xml
│       encodings.xml
│       jarRepositories.xml
│       misc.xml
│       vcs.xml
│       workspace.xml
│       
├───.mvn
│   └───wrapper
│           maven-wrapper.jar
│           maven-wrapper.properties
│           
├───.qodo
├───Crud
│       .gitattributes
│       README.md
│       
├───src
│   └───main
│       ├───java
│       │   │   module-info.java
│       │   │   
│       │   └───com
│       │       └───example
│       │           └───practica2
│       │                   AdministradorController.java
│       │                   CajeroController.java
│       │                   HelloApplication.java
│       │                   Launcher.java
│       │                   LoginController.java
│       │                   MenuController.java
│       │                   
│       └───resources
│           └───com
│               └───example
│                   └───practica2
│                           Administrador.fxml
│                           Cajero.fxml
│                           estilos.css
│                           Login.fxml
│                           Menu.fxml
│                           
└───target
    ├───classes
    │   │   module-info.class
    │   │   
    │   └───com
    │       └───example
    │           └───practica2
    │                   Administrador.fxml
    │                   AdministradorController.class
    │                   Cajero.fxml
    │                   CajeroController.class
    │                   estilos.css
    │                   HelloApplication.class
    │                   Launcher.class
    │                   Login.fxml
    │                   LoginController.class
    │                   Menu.fxml
    │                   MenuController.class
    │                   
    └───generated-sources
        └───annotations
```

## Ejecución del Proyecto

1. Clonar el repositorio.
2. Abrir el proyecto en IntelliJ IDEA.
3. Descargar las dependencias Maven.
4. Ejecutar la clase `Launcher`.
5. Iniciar sesión con las credenciales configuradas en el sistema.
   Administrador / admin123 / admin123
