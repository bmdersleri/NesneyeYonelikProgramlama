
ArrayList DinamikDizi = new ArrayList();

// Koleksiyona 128,18,56 değerlerini ekledik. 
DinamikDizi.Add(128);
DinamikDizi.Add(18);
DinamikDizi.Add(56);

/* 56 değeri koleksiyonda mevcut olduğu için Contains() metodu TRUE * döndürecek ve ekrana "Mevcut." yazılacaktır. */
if (DinamikDizi.Contains(56))
Console.WriteLine("Mevcut.");
else
Console.WriteLine("Mevcut Değil.");
