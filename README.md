# Factory Method

## 📌 Sistema de Gestión de Pedidos para Restaurante de Comida Rápida

## 📝 Descripción del Problema

Un restaurante de comida rápida necesita implementar un sistema para manejar su menú y proceso de pedidos. El restaurante ofrece los siguientes productos:

- **🍔 Comidas individuales**

- **🥤 Bebidas**

- **🥗 Ensaladas**

- **🍰 Postres**

Además, el restaurante ofrece opciones de combos que agrupan diferentes productos a precios especiales. Los combos están categorizados en tres tipos:

- **💰 Lite-Combo**: Opción económica con una selección limitada de productos.

- **👨‍👩‍👧‍👦 Family-Combo**: Opción intermedia diseñada para grupos familiares.

- **🔥 Mega-Combo**: Opción premium con la mayor variedad de productos.

Cada tipo de combo incluye diferentes combinaciones de comidas, bebidas, ensaladas y/o postres según su categoría y precio.

## ✅ Requisitos del Sistema

## El sistema debe permitir:

- **📌 Selección de Productos**: Permitir a los clientes seleccionar productos individuales o combos.

- **📦 Gestión de Inventario**: Manejar correctamente el inventario de productos.

- **💲 Cálculo de Precios**: Calcular los precios adecuadamente según la selección (productos individuales vs. combos).

- **⚙️ Personalización de Combos**: Facilitar la personalización de combos según las preferencias del cliente.

- **⏳ Optimización del Pedido**: Optimizar el proceso de pedido para reducir los tiempos de espera.
  

## 📌 Diagrama UML




# Prototype

## Sistema de Paquetes Turísticos para Agencia de Viajes
📝 Descripción del Problema
Una agencia de viajes ofrece diversos paquetes turísticos a sus clientes, incluyendo:

- **🏝️ Tour Sigiriya**
- **💑 Tour de Luna de Miel**
- **🏔️ Tour por la Región Montañosa**
- **🏙️ Tour Urbano**

## Cada tour está compuesto por múltiples elementos como:

- **🏨 Alojamientos**
- **🚗 Transporte**
- **🍽️ Comidas incluidas**
- **🎭 Actividades y excursiones**
- **🧑‍🔧 Guías turísticos**

Actualmente, cuando un cliente solicita un paquete personalizado, los agentes deben crear completamente un nuevo objeto Tour desde cero, configurando manualmente todos los componentes aunque muchos sean idénticos a tours existentes. Este proceso es:

- **⏰ Lento e ineficiente**
- **⚠️ Propenso a errores**
- **🔄 Repetitivo**
- **🧩 Difícil de mantener consistente**

# ✅ Requisitos del Sistema
## El sistema debe permitir:

- **📌 Creación de Tours Base: Definir paquetes turísticos estándar que sirvan como plantillas.**
- **🔄 Clonación de Tours: Permitir copiar rápidamente un tour existente como punto de partida.**
- **⚙️ Personalización Eficiente: Modificar solo los aspectos específicos que necesiten cambios.**
- **📊 Gestión de Variantes: Manejar eficientemente múltiples variantes de un mismo tour base.**
- **💸 Cálculo de Precios: Recalcular automáticamente los precios según las modificaciones realizadas.**
- **📝 Historial de Personalizaciones: Mantener registro de las personalizaciones populares para convertirlas en nuevos prototipos.**

# 🔄 Beneficios de la Solución con Patrón Prototype
## La implementación del patrón Prototype ofrecerá:

- **⚡ Mayor velocidad en la creación de paquetes personalizados**
- **🎯 Precisión en la configuración de nuevos tours**
- **🔄 Consistencia en la estructura y calidad de los paquetes**
- **🛠️ Facilidad de mantenimiento al actualizar precios o políticas**
- **🔍 Trazabilidad de las personalizaciones realizadas**

# 💡 Caso de Uso Práctico
Un agente de viajes atiende a una pareja que desea un Tour de Luna de Miel personalizado:

El agente selecciona el prototipo "Tour de Luna de Miel Estándar"
El sistema clona este prototipo, creando una copia exacta
El agente personaliza solo los aspectos solicitados:

Extiende la duración de 7 a 10 días
Reemplaza un hotel por otro de preferencia
Agrega una excursión adicional
Cambia el tipo de transporte en una etapa del tour


En lugar de recrear todo el paquete desde cero, el agente modifica únicamente los elementos necesarios, manteniendo toda la estructura y beneficios del paquete original.

## 📌 Diagrama UML
![WhatsApp Image 2025-03-22 at 7 37 55 AM](https://github.com/user-attachments/assets/72055e04-efc4-4daf-a92b-a25e8ccdb028)
  
