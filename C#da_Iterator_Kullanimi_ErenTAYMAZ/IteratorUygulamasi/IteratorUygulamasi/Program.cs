using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace IteratorUygulamasi
{
    struct Personel                                 //
    {
        public int Id { get; set; }
        public string Adi { get; set; }             //
        public string SoyAdi { get; set; }          //
    }
    interface IAggregate
    {
        IIterator CreateIterator();
    }
    interface IIterator
    {
        //Bir sonraki adımda eleman var mı?
        bool HasItem();
        //Bir sonraki adımdaki elemanı getir.
        Personel NextItem();
        //Mevcut elemanı getir.
        Personel CurrentItem();
    }
    class PersonelAggregate : IAggregate
    {
        List<Personel> PersonelListesi = new List<Personel>();
        public void Add(Personel Model) => PersonelListesi.Add(Model);
        public Personel GetItem(int index) => PersonelListesi[index];
        public int Count { get => PersonelListesi.Count; }
        public IIterator CreateIterator() => new PersonelIterator(this);
    }
    class PersonelIterator : IIterator
    {
        PersonelAggregate aggregate;
        int currentindex;
        public PersonelIterator(PersonelAggregate aggregate) => this.aggregate = aggregate;
        public Personel CurrentItem() => aggregate.GetItem(currentindex);
        public bool HasItem()
        {
            if (currentindex < aggregate.Count)
                return true;
            return false;
        }
        public Personel NextItem()
        {
            if (HasItem())
                return aggregate.GetItem(currentindex++);
            return new Personel();
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            PersonelAggregate aggregate = new PersonelAggregate();
            aggregate.Add(new Personel { Id = 1, Adi = "Eren", SoyAdi = "Taymaz" });
            aggregate.Add(new Personel { Id = 2, Adi = "Beyza", SoyAdi = "Yazar" });
            aggregate.Add(new Personel { Id = 3, Adi = "Serkan", SoyAdi = "Takkım" });
            aggregate.Add(new Personel { Id = 4, Adi = "Ömer", SoyAdi = "Solmaz" });
            aggregate.Add(new Personel { Id = 5, Adi = "Fatma", SoyAdi = "Yılmaz" });

            IIterator iterasyon = aggregate.CreateIterator();
            while (iterasyon.HasItem())
            {
                Console.WriteLine($"ID : {iterasyon.CurrentItem().Id}\nAdı : {iterasyon.CurrentItem().Adi}\nSoyadı : {iterasyon.CurrentItem().SoyAdi}\n*****");
                iterasyon.NextItem();
            }

            Console.Read();
        }
    }
}
