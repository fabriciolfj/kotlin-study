# kotlin-study


```
// INVARIANTE (padrão)
class Box<T>          // Nem in nem out
// Box<Dog> ≠ Box<Animal>

// COVARIANTE (out)
class Producer<out T> // Só produz T
// Producer<Dog> é subtipo de Producer<Animal>
// "Se Dog é Animal, então Producer<Dog> é Producer<Animal>"

// CONTRAVARIANTE (in)  
class Consumer<in T>  // Só consome T
// Consumer<Animal> é subtipo de Consumer<Dog>
// "Se Animal pode processar qualquer coisa, pode processar Dog"
```