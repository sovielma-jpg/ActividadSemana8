## Llanquihue Tour App – Integrando Interfaces, Polimorfismo y Estructuras Dinámicas

Llanquihue Tour App es una aplicación desarrollada en Java que permite gestionar distintas entidades relacionadas con la operación de una agencia de turismo. El proyecto fue implementado aplicando conceptos fundamentales de Programación Orientada a Objetos (POO), tales como:

- Interfaces
- Herencia
- Polimorfismo
- Encapsulamiento
- Colecciones dinámicas (ArrayList)
- Validación de tipos mediante instanceof
- Interfaz gráfica básica con JOptionPane
- El sistema permite registrar y visualizar información de diferentes entidades de la empresa, como guías turísticos, vehículos y colaboradores externos.

## Objetivos de la actividad

- Implementar una interfaz común para distintas entidades.
- Aplicar herencia y reutilización de código.
- Utilizar polimorfismo mediante colecciones genéricas.
- Diferenciar objetos en tiempo de ejecución usando instanceof.
- Desarrollar una interfaz gráfica básica para el ingreso y visualización de datos.
- Mantener una estructura modular organizada en paquetes.

## Estructura del proyecto

LlanquihueTourApp
│
├── src
│   │
│   ├── data
│   │   ├── GestorEntidades
│   │
│   ├── model
│   │   └── ColaboradorExterno
│   │   ├── GuiaTuristico
│   │   ├── Persona
│   │   ├── Registrable
│   │   └── Vehiculo
│   │
│   └── ui
│       └── LlanquihueTourApp.java
│
└── README.md


