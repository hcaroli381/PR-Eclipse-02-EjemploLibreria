# PR-Eclipse-02-EjemploLibreria
### 1. ¿Funcionaría si exporto el proyecto a un `.zip` y se lo paso a un amigo o me lo llevo al ordenador de casa? Razona la respuesta.
Si funcionaria, los proyectos de java son fácilmente exportables y ejecutables en varios dispositivos gracias a crear el archivo ".class". Java crea un híbrido entre .java y ejecutable que se interpreta en la JVM, que es compatible con la exportacion a distintos sistemas.
### 2. ¿Qué pasaría si eliminamos el archivo `.jar` de la carpeta `lib` (o lo movemos a otro directorio para probarlo)? ¿Qué ha pasado y por qué?
El proyecto deja de funcionar, al no poder exportar la libreria LocalDate de ningún sitio. 
### 3. Si agrego la librería con **Add External JARs...** ¿Observas alguna diferencia en la configuración del *Build Path*? ¿Crees que si lo exporto a `.zip` y se lo paso a un compañero funcionaría?
El código funciona exactamente igual. Pero al exportar el zip el .jar ya no vendría incluido por lo que no le funcionaría a nuestro compañero.
### 4. ¿Por qué **no es recomendable** usar **Add External JARs...** en proyectos que vas a compartir?
Porque tendriamos que mandar los .jar por otra vía o decirles donde obtenerlos, es mucho más difícil que añadiendo el jar a nuestro proyecto de forma interna.



