# WordKeeperApp

Esta es la clase principal de la aplicación, donde se encuentra la lógica de interacción entre nuestro programa y el usuario.
<br><br>

## Métodos

#### - main(String[] args) 
&nbsp;&nbsp;&nbsp;&nbsp;
Inicializa el diccionario y el Scanner, y luego entra en un bucle infinito que muestra el menú y realiza acciones basadas en la entrada del usuario.

#### - showMenu() 
&nbsp;&nbsp;&nbsp;&nbsp;
Muestra el menú de opciones disponibles para el usuario.

#### - performAction(Dictionary dictionary, Scanner scanner) 
&nbsp;&nbsp;&nbsp;&nbsp;
Lee la opción ingresada por el usuario y realiza la acción correspondiente en función de esa opción.

#### - addWord(Dictionary dictionary, Scanner scanner) 
&nbsp;&nbsp;&nbsp;&nbsp;
Permite al usuario agregar una palabra al diccionario. 

#### - removeWord(Dictionary dictionary, Scanner scanner) 
&nbsp;&nbsp;&nbsp;&nbsp;
Permite al usuario eliminar una palabra del diccionario.

#### - checkWord(Dictionary dictionary, Scanner scanner) 
&nbsp;&nbsp;&nbsp;&nbsp;
Permite al usuario verificar si una palabra está presente en el diccionario.

#### - showInitials(Dictionary dictionary) 
&nbsp;&nbsp;&nbsp;&nbsp;
Muestra las letras iniciales presentes en el diccionario.

#### - showWordsByInitial(Dictionary dictionary, Scanner scanner) 
&nbsp;&nbsp;&nbsp;&nbsp;
Permite al usuario obtener las palabras asociadas con una letra inicial específica. 

#### - exitProgram(Scanner scanner) 
&nbsp;&nbsp;&nbsp;&nbsp;
Sale del programa, cierra el Scanner y finaliza la ejecución del programa.
<br><br>

[<- Volver](../documentation.md)