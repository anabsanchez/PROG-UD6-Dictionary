# Documentación - Duolingo WordKeeper


### Clases de Utilidad:

## DictionaryException

Esta clase representa una excepción específica para errores relacionados con operaciones en el diccionario.

## InputProcessor

Proporciona métodos para procesar la entrada de palabras y letras desde la consola.

- **requestWord(Scanner scanner):** Este método solicita al usuario que ingrese una palabra y la lee utilizando un objeto Scanner.

- **validateWord(String word):** Este método privado valida si la palabra ingresada cumple con el patrón de solo contener letras minúsculas del alfabeto inglés. 

- **requestLetter(Scanner scanner):** Este método solicita al usuario que ingrese una letra y la lee utilizando un objeto Scanner. 

- **validateLetter(String input):** Este método privado valida si la entrada es una sola letra minúscula del alfabeto inglés. 


### Clases Principales:

## Dictionary

Esta clase es responsable de gestionar el diccionario personal del usuario.

- **Constructor Dictionary():** Inicializa el diccionario como un nuevo HashMap.

- **addWord(String word):** Añade una palabra al diccionario. 

- **removeWord(String word):** Elimina una palabra del diccionario. 

- **containsWord(String word):** Verifica si una palabra está presente en el diccionario. 

- **getInitials():** Obtiene un conjunto de todas las letras iniciales de las palabras en el diccionario.

- **getWordsByInitial(char initial):** Obtiene un conjunto de todas las palabras en el diccionario que comienzan con una letra inicial específica. 
>Si no hay palabras en el diccionario con esa letra inicial, devuelve un conjunto vacío.


## Clase Ejecutable:

## WordKeeperApp

Esta es la clase principal de la aplicación, donde se encuentra la lógica de interacción entre nuestro programa y el usuario.

- **main(String[] args):** Inicializa el diccionario y el Scanner, y luego entra en un bucle infinito que muestra el menú y realiza acciones basadas en la entrada del usuario.

- **showMenu():** Muestra el menú de opciones disponibles para el usuario.

- **performAction(Dictionary dictionary, Scanner scanner):** Lee la opción ingresada por el usuario y realiza la acción correspondiente en función de esa opción.

- **addWord(Dictionary dictionary, Scanner scanner):** Permite al usuario agregar una palabra al diccionario. 

- **removeWord(Dictionary dictionary, Scanner scanner):** Permite al usuario eliminar una palabra del diccionario.

- **checkWord(Dictionary dictionary, Scanner scanner):** Permite al usuario verificar si una palabra está presente en el diccionario.

- **showInitials(Dictionary dictionary):** Muestra las letras iniciales presentes en el diccionario.

- **showWordsByInitial(Dictionary dictionary, Scanner scanner):** Permite al usuario obtener las palabras asociadas con una letra inicial específica. 

- **exitProgram(Scanner scanner):** Sale del programa, cierra el Scanner y finaliza la ejecución del programa.