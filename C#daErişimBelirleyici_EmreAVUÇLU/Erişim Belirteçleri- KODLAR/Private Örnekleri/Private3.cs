using System;

namespace Private3
{
    class Box
    {
        //Kutu Uygulaması
    }

 class Container
    {
        private Box _box1;
        private Box _box2;


        private Container()
        {
            _box1 = new Box(); //Nesne oluşturuldu
            _box2 = new Box(); //Nesne oluşturuldu

        }
    }
}
