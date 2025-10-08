# PR-Eclipse-02-EjemploLibreria
### 1. ¿Funcionaría si exporto el proyecto a un `.zip` y se lo paso a un amigo o me lo llevo al ordenador de casa? Razona la respuesta.
Si funcionaria, los proyectos de java son fácilmente exportables y ejecutables, el zip contendría toda la estructura del mismo, con lo que Eclipse ya puede trabajar con él de la misma manera que lo hace el creador original.
### 2. ¿Qué pasaría si eliminamos el archivo `.jar` de la carpeta `lib` (o lo movemos a otro directorio para probarlo)? ¿Qué ha pasado y por qué?
El proyecto deja de funcionar, al no encontrar eclipse una libreria de donde acceder a las clases.
### 3. Si agrego la librería con **Add External JARs...** ¿Observas alguna diferencia en la configuración del *Build Path*? ¿Crees que si lo exporto a `.zip` y se lo paso a un compañero funcionaría?
El código funciona exactamente igual. Pero al exportar el zip el .jar ya no vendría incluido por lo que no le funcionaría a nuestro compañero, solo sería posible si él/ella también configura su build path.
### 4. ¿Por qué **no es recomendable** usar **Add External JARs...** en proyectos que vas a compartir?
Porque tendriamos que mandar los .jar por otra vía o decirles donde obtenerlos, además de tener que configurar de nuevo el build path. En resumen es mucho más difícil que añadiendo el jar a nuestro proyecto de forma interna, sin necesidad de pasar más archivos ni de configurar de nuevo.



