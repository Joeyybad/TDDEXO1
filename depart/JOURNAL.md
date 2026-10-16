# Journal des cycles

Un cycle = un test écrit, vu rouge, rendu vert avec le code minimal, puis un refactoring éventuel. Une ligne par cycle.

| N° | Test   | Pourquoi maintenant | Code minimal écrit | Refactoring |
|----|--------|---------------------|--------------------|-------------|
  1 | Nominal|---------------------|assertEquals carre (3)=9|
  2 | zéro |---------------------|assertEquals carre(-4)=16|-------------|
  3 | Negatif|---------------------|assertEquals carre(0)=0|-------------|
  4 | Grand nombre|---------------------|assertEquals carre(46341) = 2147488281L|Passer en Long
