# Proyecto-Parqueadero
Sistema para gestionar un parqueadero en Java usando herencia.
# Gestión de un Parqueadero 🚗

Este proyecto es una aplicación de consola en Java que simula la gestión de un parqueadero. El sistema está diseñado para registrar diferentes tipos de vehículos, gestionar su entrada y salida, y calcular el costo de la estadía basándose en el tiempo y el tipo de vehículo.

El núcleo del proyecto es la aplicación del concepto de **herencia** de la Programación Orientada a Objetos, donde las clases `Automovil`, `Motocicleta` y `Camion` heredan de una clase base `Vehiculo`.

## ✨ Características Principales

- **Sistema de Herencia:** Modela distintos tipos de vehículos a partir de una clase base común.
- **Registro de Vehículos:** Permite registrar la entrada de automóviles, motocicletas y camiones, capturando automáticamente la hora de ingreso.
- **Gestión de Salidas:** Registra la salida de un vehículo usando su placa y calcula el costo total.
- **Cálculo de Tarifas Dinámico:** Aplica una tarifa por hora diferente según el tipo de vehículo (`instanceof`). La fracción de hora se cobra como hora completa.
- **Reporte en Tiempo Real:** Ofrece una opción para listar todos los vehículos que se encuentran actualmente dentro del parqueadero.
- **Interfaz de Consola:** Incluye un menú interactivo para que el usuario pueda operar el sistema fácilmente.

## 📐 Diagrama de Clases (UML)

La arquitectura del sistema, centrada en la herencia, se representa en el siguiente diagrama:

![Diagrama de Clases del Parqueadero](diagrama_parqueadero.png)

## 🛠️ Tecnologías Utilizadas

- **Lenguaje:** Java
- **Control de Versiones:** Git
- **Alojamiento:** GitHub

## 🚀 Cómo Ejecutar el Proyecto

Para compilar y ejecutar este proyecto en tu máquina local, sigue estos pasos.

**Requisitos:**
- Tener instalado el JDK (Java Development Kit) versión 8 o superior.
- Tener Git instalado.

**Pasos:**

1.  **Clona el repositorio:** Abre una terminal y ejecuta el siguiente comando (reemplaza el nombre del repo si usaste uno diferente).
    ```bash
    git clone [https://github.com/ValRes0911/Proyecto-Parqueadero.git](https://github.com/ValRes0911/Proyecto-Parqueadero.git)
    ```

2.  **Navega al directorio del proyecto:**
    ```bash
    cd Proyecto-Parqueadero
    ```

3.  **Compila los archivos Java:**
    ```bash
    javac *.java
    ```

4.  **Ejecuta la clase principal para iniciar el menú:**
    ```bash
    java Main
    ```

## 👤 Autor

* **Valeri Paola Restrepo Lombana**