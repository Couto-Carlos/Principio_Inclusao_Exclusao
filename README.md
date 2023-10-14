Este trabalho apresenta um programa Java que permite calcular a quantidade de elementos na união de conjuntos, fazendo uso do Princípio da Inclusão-Exclusão. O Princípio da Inclusão-Exclusão é uma técnica matemática amplamente utilizada para calcular a cardinalidade da união de múltiplos conjuntos. O código Java desenvolvido recebe uma quantidade finita de conjuntos e elementos e calcula a quantidade total de elementos na união desses conjuntos. Para alcançar esse objetivo, o programa utiliza estruturas de dados do tipo lista para representar os conjuntos, permitindo a adição de elementos de maneira flexível. Em seguida, aplica o Princípio da Inclusão-Exclusão, somando o tamanho de cada conjunto e subtraindo o tamanho das interseções iterativamente. Isso resulta no número desejado de elementos na união dos conjuntos. O trabalho fornece um exemplo prático de aplicação do código, mas pode ser adaptado para calcular a união de qualquer número de conjuntos e elementos de entrada. A abordagem utilizada neste trabalho não depende do uso de estruturas de dados baseadas em hash, tornando-a adequada para diferentes tipos de conjuntos.

Metodos Utilizados:

RetainAll:

o retainAll é um método de conjuntos (ou no caso de List, ele é tratado como um conjunto) em Java que realiza a operação de interseção entre dois conjuntos, removendo todos os elementos que não estão presentes em ambos os conjuntos.

Para explicar mais detalhadamente, considere dois conjuntos A e B:

A = {1, 2, 3, 4, 5}
B = {3, 4, 5, 6, 7}

Se você chamar o método A.retainAll(B), o conjunto A será modificado para conter apenas os elementos que estão presentes em ambos A e B. O resultado será:

A = {3, 4, 5}

/*
* EXEMPLO: Adicionar os elementos aos sets
* List<List<Integer>> sets = new ArrayList<>();
* List<Integer> conjunto1 = new ArrayList<>();
* 
* conjunto1.add(1);
* conjunto1.add(2);
* conjunto1.add(3);
* 
* List<Integer> conjunto2 = new ArrayList<>();
* conjunto2.add(3);
* conjunto2.add(4);
* 
* List<Integer> conjunto3 = new ArrayList<>();
* conjunto3.add(4);
* conjunto3.add(5);
* 
* sets.add(conjunto1);
* sets.add(conjunto2);
* sets.add(conjunto3);
*/