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