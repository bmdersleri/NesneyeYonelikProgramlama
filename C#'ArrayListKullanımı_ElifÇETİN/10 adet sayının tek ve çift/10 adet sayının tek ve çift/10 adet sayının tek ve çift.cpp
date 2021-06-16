ArrayList DinamikDizi = new ArrayList();

// Koleksiyona 128,18,56 değerlerini ekledik. 
DinamikDizi.Add(128);
DinamikDizi.Add(18);
DinamikDizi.Add(56);

// Koleksiyon içerisindeki öğeleri artan sırada sıraladık. (18-56-128) 
// NOT: BinarySearch() metodunu kullanabilmek için sıralama yapmamız gerek.
DinamikDizi.Sort();

// 18 değerinin indeks numarasını ekrana yazdırdık. (İndeksi:0) 
Console.WriteLine(DinamikDizi.BinarySearch(18));

