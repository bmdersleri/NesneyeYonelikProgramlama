

ArrayList DinamikDizi = new ArrayList();

// Koleksiyona 128,18,56 değerlerini ekledik. 
DinamikDizi.Add(128);
DinamikDizi.Add(18);
DinamikDizi.Add(56);

// foreach ile koleksiyonun tüm elemanlarını ekrana yazdırdık. 
foreach(var i in DinamikDizi)
Console.WriteLine(i);

// 18 değerini koleksiyondan çıkardık. 
DinamikDizi.Remove(18);

// Bu sefer for döngüsü ile koleksiyonun tüm elemanlarını ekrana yazdırdık.
for (int i = 0; i < DinamikDizi.Count; i++)
    Console.WriteLine(DinamikDizi[i]);
