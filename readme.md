Enunciado del Ejercicio: Sistema de Gestión de Productos con MVC y Manejo de Excepciones

Eres el desarrollador encargado de implementar un sistema básico para gestionar un inventario de productos en una tienda. El programa debe seguir los principios del diseño Modelo-Vista-Controlador (MVC) y manejar correctamente las excepciones comunes. Las funcionalidades son las siguientes:

1. Modelo (Producto)

Define una clase Producto con los siguientes atributos y métodos:

Atributos privados:

int id: Identificador único del producto.

String nombre: Nombre del producto.

double precio: Precio del producto.


Métodos:

Constructor que inicialice todos los atributos.

Métodos getter y setter para cada atributo, con validación en el setter (por ejemplo, el precio no puede ser negativo).

Método toString para devolver una representación textual del producto.



2. Modelo (Inventario)

Define una clase Inventario que represente la lógica del negocio para gestionar los productos:

Atributos:

Una lista (List<Producto>) para almacenar los productos.


Métodos:

void agregarProducto(Producto producto): Añade un producto al inventario. Si ya existe un producto con el mismo ID, lanza una excepción.

void eliminarProductoPorId(int id): Elimina un producto por su ID. Si no existe el producto, lanza una excepción.

List<Producto> buscarProductoPorNombre(String nombre): Devuelve una lista de productos que coincidan parcialmente con el nombre proporcionado. Si no hay coincidencias, devuelve una lista vacía.

List<Producto> obtenerTodosLosProductos(): Devuelve la lista completa de productos.

Manejo de excepciones específicas como:

IllegalArgumentException para validaciones de parámetros inválidos.

NoSuchElementException si no se encuentra un producto.




3. Vista (VistaConsola)

Define una clase VistaConsola para interactuar con el usuario a través de la consola:

Métodos:

void mostrarMensaje(String mensaje): Muestra un mensaje al usuario.

void mostrarError(String mensaje): Muestra un mensaje de error.

void mostrarListaProductos(List<Producto> productos): Muestra los productos de la lista.

Métodos para leer datos del usuario (por ejemplo, ID, nombre, precio).



4. Controlador (Controlador)

Define una clase Controlador que sirva como intermediario entre la vista y el modelo:

Atributos:

Una instancia de Inventario.

Una instancia de VistaConsola.


Métodos:

void iniciar(): Maneja el flujo principal del programa (el menú interactivo).

Métodos específicos para cada acción del menú:

void agregarProducto(): Solicita los datos del producto desde la vista y lo agrega al inventario.

void eliminarProducto(): Solicita el ID desde la vista y elimina el producto.

void buscarProducto(): Solicita un nombre desde la vista y muestra los productos encontrados.

void mostrarTodosLosProductos(): Muestra todos los productos disponibles.




5. Clase Principal (Main)

Crea una clase Main con el método main que:

1. Inicializa el Inventario, la VistaConsola y el Controlador.


2. Llama al método iniciar del controlador para arrancar el programa.




---

6. Manejo de Excepciones

El programa debe manejar las siguientes excepciones:

Validar que el precio sea un número positivo al crear o actualizar un producto.

Prevenir IDs duplicados al agregar un producto.

Manejar intentos de eliminar o buscar productos inexistentes con un mensaje amigable.

Capturar excepciones inesperadas para evitar que el programa se detenga abruptamente.



---

Menú Interactivo

El menú debe permitir al usuario realizar las siguientes operaciones hasta que elija salir:

1. Agregar un producto.


2. Eliminar un producto por ID.


3. Buscar un producto por nombre.


4. Mostrar todos los productos.


5. Salir.



Asegúrate de que cada opción esté claramente presentada al usuario y que el programa maneje errores de entrada de forma adecuada.


---

Con este enunciado, practicas conceptos básicos y avanzados de Java, como diseño orientado a objetos, manejo de excepciones, colecciones, y patrones de diseño como MVC.