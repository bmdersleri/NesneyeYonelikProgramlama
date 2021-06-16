13       	 <--SHAPES
14       	 <--LINES
id1
2       	 <--TYPE
742       	 <--LEFT
15       	 <--TOP
70       	 <--WIDTH
30       	 <--HEIGHT
16777215       	 <--BACKCOLOR
0       	 <--BORDERCOLOR
0       	 <--BORDERCOLOR
-reserved 1-
-reserved 2-
START



id2
91       	 <--TYPE
663       	 <--LEFT
80       	 <--TOP
228       	 <--WIDTH
40       	 <--HEIGHT
16777215       	 <--BACKCOLOR
0       	 <--BORDERCOLOR
0       	 <--BORDERCOLOR
-reserved 1-
-reserved 2-
INPUT
Bir a degeri giriniz!
a

id3
91       	 <--TYPE
662       	 <--LEFT
148       	 <--TOP
228       	 <--WIDTH
40       	 <--HEIGHT
16777215       	 <--BACKCOLOR
0       	 <--BORDERCOLOR
0       	 <--BORDERCOLOR
-reserved 1-
-reserved 2-
INPUT
Bir b degeri giriniz!
b

id4
0       	 <--TYPE
711       	 <--LEFT
222       	 <--TOP
132       	 <--WIDTH
30       	 <--HEIGHT
16777215       	 <--BACKCOLOR
0       	 <--BORDERCOLOR
0       	 <--BORDERCOLOR
-reserved 1-
-reserved 2-
ADD
a
b
Toplam
id5
92       	 <--TYPE
720       	 <--LEFT
405       	 <--TOP
112       	 <--WIDTH
50       	 <--HEIGHT
16777215       	 <--BACKCOLOR
0       	 <--BORDERCOLOR
0       	 <--BORDERCOLOR
-reserved 1-
-reserved 2-
IF_GREATER
a
b

id6
91       	 <--TYPE
249       	 <--LEFT
363       	 <--TOP
308       	 <--WIDTH
40       	 <--HEIGHT
16777215       	 <--BACKCOLOR
0       	 <--BORDERCOLOR
0       	 <--BORDERCOLOR
-reserved 1-
-reserved 2-
OUTPUT
a ve b degerinin toplami =
Toplam

id7
2       	 <--TYPE
741       	 <--LEFT
692       	 <--TOP
70       	 <--WIDTH
30       	 <--HEIGHT
16777215       	 <--BACKCOLOR
0       	 <--BORDERCOLOR
0       	 <--BORDERCOLOR
-reserved 1-
-reserved 2-
STOP



id8
91       	 <--TYPE
954       	 <--LEFT
437       	 <--TOP
340       	 <--WIDTH
40       	 <--HEIGHT
16777215       	 <--BACKCOLOR
0       	 <--BORDERCOLOR
0       	 <--BORDERCOLOR
-reserved 1-
-reserved 2-
OUTPUT
a ve b degerlerinin carpimi = 
Carpim

id9
0       	 <--TYPE
710       	 <--LEFT
280       	 <--TOP
132       	 <--WIDTH
30       	 <--HEIGHT
16777215       	 <--BACKCOLOR
0       	 <--BORDERCOLOR
0       	 <--BORDERCOLOR
-reserved 1-
-reserved 2-
MULTIPLY
a
b
Carpim
id10
0       	 <--TYPE
662       	 <--LEFT
343       	 <--TOP
228       	 <--WIDTH
30       	 <--HEIGHT
16777215       	 <--BACKCOLOR
0       	 <--BORDERCOLOR
0       	 <--BORDERCOLOR
-reserved 1-
-reserved 2-
MULTIPLY
Carpim
3
Carpimin3Kati
id11
92       	 <--TYPE
340       	 <--LEFT
431       	 <--TOP
128       	 <--WIDTH
50       	 <--HEIGHT
16777215       	 <--BACKCOLOR
0       	 <--BORDERCOLOR
0       	 <--BORDERCOLOR
-reserved 1-
-reserved 2-
IF_GREATER
Toplam
20

id12
91       	 <--TYPE
66       	 <--LEFT
525       	 <--TOP
420       	 <--WIDTH
40       	 <--HEIGHT
16777215       	 <--BACKCOLOR
0       	 <--BORDERCOLOR
0       	 <--BORDERCOLOR
-reserved 1-
-reserved 2-
INPUT
a ve b sayýsýnýnToplami 20 sayisindan büyüktür


id13
91       	 <--TYPE
513       	 <--LEFT
505       	 <--TOP
420       	 <--WIDTH
40       	 <--HEIGHT
16777215       	 <--BACKCOLOR
0       	 <--BORDERCOLOR
0       	 <--BORDERCOLOR
-reserved 1-
-reserved 2-
OUTPUT
a ve b sayisinin Toplami 20 sayisindan küçüktür


  
---- LINES ---- from,to ----
id1,id2
reserved 1

id2,id3
reserved 1

id3,id4
reserved 1

id5,id6
reserved 1
EVET
id5,id8
reserved 1
HAYIR
id8,id7
reserved 1

id4,id9
reserved 1

id9,id10
reserved 1

id10,id5
reserved 1

id11,id12
reserved 1
EVET
id11,id13
reserved 1
HAYIR
id6,id11
reserved 1

id12,id7
reserved 1

id13,id7
reserved 1

