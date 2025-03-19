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
  


# Prototype

## Sistema de Gestión de Documentos

## Contexto del problema
La empresa "DocuSolutions" ofrece un sistema de gestión documental para profesionales y empresas. Los usuarios necesitan crear frecuentemente documentos como contratos, currículums e informes, pero el proceso de crear estos documentos desde cero es tedioso y propenso a errores.

## Los usuarios pierden tiempo valioso:

- Dando formato a documentos nuevos.
- Recordando qué secciones incluir en cada tipo de documento.
- Manteniendo consistencia entre documentos similares.
- Actualizando manualmente múltiples documentos cuando cambia alguna información estándar.

# Implementación

## Componentes principales:

## Prototipo de documento:

Interfaz base que define la estructura común y el método de clonación
Contiene información básica como título, fecha, autor y secciones


## Tipos de documentos concretos:

- **Contrato**: Incluye cláusulas legales, información de partes involucradas y términos
- **Currículum**: Contiene datos personales, experiencia, educación y habilidades
- **Informe**: Estructurado con resumen ejecutivo, hallazgos, conclusiones y recomendaciones


## Administrador de documentos:

Mantiene un registro de todas las plantillas disponibles.
Permite a los usuarios buscar y seleccionar plantillas adecuadas.
Facilita la clonación y personalización de documentos.
  
