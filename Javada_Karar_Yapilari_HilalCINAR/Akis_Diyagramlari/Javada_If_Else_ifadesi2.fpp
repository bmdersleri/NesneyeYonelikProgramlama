12       	 <--SHAPES
12       	 <--LINES
id1
2       	 <--TYPE
148       	 <--LEFT
69       	 <--TOP
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
288       	 <--LEFT
64       	 <--TOP
236       	 <--WIDTH
40       	 <--HEIGHT
16777215       	 <--BACKCOLOR
0       	 <--BORDERCOLOR
0       	 <--BORDERCOLOR
-reserved 1-
-reserved 2-
INPUT
VÝZE NOTUNU GÝRÝNÝZ
VÝZE

id3
91       	 <--TYPE
610       	 <--LEFT
63       	 <--TOP
252       	 <--WIDTH
40       	 <--HEIGHT
16777215       	 <--BACKCOLOR
0       	 <--BORDERCOLOR
0       	 <--BORDERCOLOR
-reserved 1-
-reserved 2-
INPUT
FÝNAL NOTUNU GÝRÝNÝZ
FÝNAL

id8
91       	 <--TYPE
1028       	 <--LEFT
442       	 <--TOP
476       	 <--WIDTH
40       	 <--HEIGHT
16777215       	 <--BACKCOLOR
0       	 <--BORDERCOLOR
0       	 <--BORDERCOLOR
-reserved 1-
-reserved 2-
OUTPUT
ÜZGÜNÜZ, BU DERSTEN KALDINIZ!   ORTALAMANIZ =
ORTALAMA

id7
0       	 <--TYPE
656       	 <--LEFT
309       	 <--TOP
172       	 <--WIDTH
30       	 <--HEIGHT
16777215       	 <--BACKCOLOR
0       	 <--BORDERCOLOR
0       	 <--BORDERCOLOR
-reserved 1-
-reserved 2-
DIVIDE
FÝNAL
100
FÝNAL
id5
0       	 <--TYPE
660       	 <--LEFT
131       	 <--TOP
156       	 <--WIDTH
30       	 <--HEIGHT
16777215       	 <--BACKCOLOR
0       	 <--BORDERCOLOR
0       	 <--BORDERCOLOR
-reserved 1-
-reserved 2-
MULTIPLY
VÝZE
40
VÝZE
id11
0       	 <--TYPE
639       	 <--LEFT
366       	 <--TOP
204       	 <--WIDTH
30       	 <--HEIGHT
16777215       	 <--BACKCOLOR
0       	 <--BORDERCOLOR
0       	 <--BORDERCOLOR
-reserved 1-
-reserved 2-
ADD
VÝZE
FÝNAL
ORTALAMA
id12
92       	 <--TYPE
668       	 <--LEFT
431       	 <--TOP
152       	 <--WIDTH
50       	 <--HEIGHT
16777215       	 <--BACKCOLOR
0       	 <--BORDERCOLOR
0       	 <--BORDERCOLOR
-reserved 1-
-reserved 2-
IF_GREATER_EQUAL
ORTALAMA
60

id13
91       	 <--TYPE
53       	 <--LEFT
471       	 <--TOP
492       	 <--WIDTH
40       	 <--HEIGHT
16777215       	 <--BACKCOLOR
0       	 <--BORDERCOLOR
0       	 <--BORDERCOLOR
-reserved 1-
-reserved 2-
OUTPUT
TEBRIKLER, BU DERSTEN GEÇTINIZ!  ORTALAMANIZ =
ORTALAMA

id21
2       	 <--TYPE
713       	 <--LEFT
634       	 <--TOP
70       	 <--WIDTH
30       	 <--HEIGHT
16777215       	 <--BACKCOLOR
0       	 <--BORDERCOLOR
0       	 <--BORDERCOLOR
-reserved 1-
-reserved 2-
STOP



id22
0       	 <--TYPE
661       	 <--LEFT
190       	 <--TOP
156       	 <--WIDTH
30       	 <--HEIGHT
16777215       	 <--BACKCOLOR
0       	 <--BORDERCOLOR
0       	 <--BORDERCOLOR
-reserved 1-
-reserved 2-
DIVIDE
VÝZE
100
VÝZE
id23
0       	 <--TYPE
658       	 <--LEFT
250       	 <--TOP
164       	 <--WIDTH
30       	 <--HEIGHT
16777215       	 <--BACKCOLOR
0       	 <--BORDERCOLOR
0       	 <--BORDERCOLOR
-reserved 1-
-reserved 2-
MULTIPLY
FÝNAL
60
FÝNAL
  
---- LINES ---- from,to ----
id1,id2
reserved 1

id2,id3
reserved 1

id7,id11
reserved 1

id11,id12
reserved 1

id12,id13
reserved 1
EVET
id5,id22
reserved 1

id22,id23
reserved 1

id23,id7
reserved 1

id3,id5
reserved 1

id12,id8
reserved 1
HAYIR
id13,id21
reserved 1

id8,id21
reserved 1

