# DASACompiler

El objetivo del lenguaje DASA es dar una introducción a los algoritmos básicos de analítica. Se permite el manejo de arreglos como tablas y las funciones especiales permiten hacer un análisis básico de los datos. También se podrán imprimir gráficas del análisis para ver los resultados. El lenguaje es de tipo imperativo debido a que permite al usuario seguir un paradigma de programación común además de la facilidad de llamar los métodos. Lo mejor de todo, es que lo hace con la sintaxis que tú ya conoces y con la que estás familiarizado.

## ¡Antes de programar!

No te olvides de instalar lo siguiente:

* Instala [Python3](www.python.org/downloads)
* Instala [ANTLR](www.antlr.org/download.html)

Para poder correr tu programa en consola, usa el siguiente comando

```
Python3 DASAcompiler.py nombre_del_archivo.ds
```

## Tipos 

**DASA** te permite utilizar los tipos tradicionales como lo son:

* Int
* Float
* Bool
* String
* Null

## Variables

Si quieres declarar alguna variable puedes hacerlo de la siguiente manera:

```
define Int : i1 = 15;
define Float : f1 = 3;
define Bool: b1 = True;
define String: s1= "Captain Marvel";
```

¡Cabe mencionar que **DASA** también te permite declarar **arreglos y matrices** !
Puedes inicializarlas desde la declaración o después en tu código.
```
define Int[3] : arr1;
define Int[3][2] : arr2 = [[10, 20], [30, 40], [50, 60]];
```

Ahora haz magia con tus variables, utiliza cualquiera de los siguientes operadores:
```
+, -, *, /, %, >, <, >=, <=, =, ==, !=, &&, ||, !
```
**DASA** usa la lógica común de los tipos, es decir, no puedes guardar un Float en un Int, pero si podrias hacer una división (la cual terminará siendo un Float). Tampoco se puede sumar un String con un Int, aunque tenemos un pequeño **hack** (del cual te hablaremos más adelante) que te ayudara a poder realizar esto :).

## Funciones

La funciones dentro de **DASA** tienen un formato muy similar al de otro lenguajes de programación, a continuación te mostramos una función sencilla sin valores de retorno:
```
func f1(Int: i, Int: y){
    print (i*y);
}

```
Como sabemos que esto es muy sencillo para ti, te mostramos como usar recursión en el clásico ejemplo de factorial:

```
func factorial(Int: i) : Int{
    if(i == 0){
        return 1;
    } else{
        return i * factorial(i-1);
    }
}

main(){
    define Int : n;
    input(n);
    print(factorial(n));
}
```

Como puedes apreciar, todo el código debe ser llamado dentro de un main para ser ejecutado. Las funciones deben estar declaradas antes del main para poder usarse.

## Funciones especiales

¿Recuerdas que te mencione de un pequeño **hack** ? Hablaba de las funciones especiales que trae **DASA** por si mismo, ¡sin necesidad de incluir más librerías!

Supongamos que tienes las siguientes variables declaradas:
```
define Float : y;
define Int : x = 40;
define Bool : w = False;
define String : z = "100";
define Float[3] : arr = [6,7,8] ;
```

Podras usar las siguientes funciones en ellas:
```
size(arr);       # 3
isNull(y);       # True
toString(w);     # un String con valor de "False"
toFloat(x);      # 40.0
toInt(z);        # un Int con valor de 100, esto fallará si 
                 # el String tiene letras o espacios.
```


Por último, pero no menos importante, tenemos las funciones que hacen brillar a **DASA**:

Supongamos que tienes la siguiente matriz de datos:
```
define Int[3][11] : data= [[1, 4, 7, 2, 6, 2, 8, 2, 9, 2, 2],[6, 2, 9, 1, 9, 3, 7, 4, 8, 2, 5], [1, 3, 6, 2, 9, 3, 6, 5, 10, 12, 4]]
```

### Describe

Usa la función de describre para obtener información de estadistica básica de tus datos(no tienen que ser númericos).
```
describe(data);

#Output:
            col1       col2       col3
count  11.000000  11.000000  11.000000
mean    4.090909   5.090909   5.545455
std     2.879394   2.913916   3.503245
25%     2.000000   2.500000   3.000000
50%     2.000000   5.000000   5.000000
75%     6.500000   7.500000   7.500000
max     9.000000   9.000000  12.000000
```

### Regression

Esta función te genera un modelo lineal de multiples variable contra una, lo que te permitira hacer pronostico usando el modelo generado.

```
regression(data);

#Output:

Coefficient of determination: 0.5098343758217816
Equation: y= (0.7225877192982461)*x0 + 2.1348684210526296
```

### Cluster

Con la función cluster podras dividir tu información en grupos y conocer sus respectivos los centroides. La cantidad de grupos que desees los envias como el segundo parametro.

```
cluster(data, 2);

#Output:

Centroids for 2 clusters:
         [7.5  8.25]
         [2.14285714 3.28571429]
```

### Plot

Finalmente, para que puedas comprender a la perfección tus datos, utiliza plot para graficar tus datos. Tu primer parametro es el nombre de la estructura con tus datos y el segundo es el nombre de la gráfica (sin extensión). Esta imagen se guardará en el mismo directorio.

```
plot(data, "imagename");

#Output:
Plot saved to imagename.png
```






