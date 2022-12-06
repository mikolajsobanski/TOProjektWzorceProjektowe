# TOProjektWzorceProjektowe
```text
1.Co projekt będzie robił?
2.Z jakich wzorców będzie korzystał?
3.W jakim celu?
--------------------------------------
1 -

  Biblioteka internetowa

2,3-

  1. Konstruowany jest obiekt Klient, typ Klienta (zwykły/VIP/admin) decyduje o obiektcie z wykorzystaniem BUDOWNICZEGO

  2. Klient dodaje siebie do Kolejki, będącej SINGLETONEM (jeśli nie isntieje to najpierw jest tworzona)

  3. Kolejka powoli obsługuje obiekty w sobie, uniwersalna obsługa różnego typu obiektów zapewniona przez DEKORATORY

  4. W przypadku gdy spełniony jest dany warunek (np. pełna kolejka lub brak jakiegoś zasobu), Kolejka zgłasza to do KOMPOZYTU z wszystkich Klientów przez ITERATOR '

  5. Jeśli Kolejka skończy wszystko obsługiwać, to zapisuje efekty swojej pracy w PAMIĄTCE, a następnie się usuwa

  6. Klient posługuje sie menu, do którego wykorzystywany jest wzorzec COMMAND

```
