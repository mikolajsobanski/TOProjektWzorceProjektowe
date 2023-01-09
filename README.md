# TOProjektWzorceProjektowe
```text
1.Co projekt będzie robił?
2.Z jakich wzorców będzie korzystał?
3.W jakim celu?
--------------------------------------
1 -

  Projekt będzie symulował działanie biblioteki internetowej, przy ograniczonym tempie wykonywania operacji, mogącym spowodować konieczność zakolejkowania i poprawnego obsłużenia wielu klientów.

2,3-

  1. Budowniczy -- klienci konstruowani na podstawie żądań mogą mieć różne uprawnienia, odpowiedni klienci są konstruowani przez budowniczego. 

  2. Singleton -- kolejka do której trafiają żądania klientów jest singletonem. Każde żądanie próbuje najpierw stworzyć kolejkę, ale jeśli Kolejka już istnieje, to tylko podłącza się do niej.

  3. Dekorator -- żądania klientów zawerają jedynie podstawowe informacje, niewystarczające do pełnego działania kolejki. Dodatkowe pole i/lub metody dodawane są poprzez dekorator.
  
  4. Kompozyt -- aby móc mieć dostęp do wszystkich żądań (oraz np. grup żądań), cała zawartość kolejki zawiera się w kompozycie dostarczającym metod do pracy na wszystkich żądaniach jednocześnie.
  
  5. Iterator -- po żądaniach w kolejce porusza się iterator.

  6. Polecenie -- zgodnie z wzorcem polecenie, wszystkie wymienione wyżej żądania klientów zostają zamienione w obiekty aby można było je kolejkować i przesyłać jako argumenty funkji. 

```
