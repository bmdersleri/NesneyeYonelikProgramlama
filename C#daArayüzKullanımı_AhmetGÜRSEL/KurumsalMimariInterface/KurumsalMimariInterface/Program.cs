using System;

namespace KurumsalMimariInterface
{
    class Program
    {
        static void Main(string[] args)
        {
            DBManager example1 = new DBManager(new MsSQLDB());
            DBManager example2 = new DBManager(new OracleDB());
            DBManager example3 = new DBManager(new MongoDB());

            example1.delete();

            example2.update();

            example3.save();

            Console.ReadLine();
        }
    }
    class DBManager
    {
        private IRepository _repository;
        public DBManager(IRepository repository)
        {
            _repository = repository;
        }

        public void delete()
        {
            _repository.delete();
        }
        public void update()
        {
            _repository.update();
        }
        public void insert()
        {
            _repository.insert();
        }
        public void save()
        {
            _repository.save();
        }
    }
    interface IRepository
    {
        void delete();
        void insert();
        void update();
        void save();
    }
    class MsSQLDB : IRepository
    {
        public void delete()
        {
            Console.WriteLine("MsSQL > delete()");
        }
        public void insert()
        {
            Console.WriteLine("MsSQL > insert()");
        }
        public void update()
        {
            Console.WriteLine("MsSQL > update()");
        }
        public void save()
        {
            Console.WriteLine("MsSQL > save()");
        }

    }
    class OracleDB : IRepository
    {
        public void delete()
        {
            Console.WriteLine("OracleDB > delete()");
        }
        public void insert()
        {
            Console.WriteLine("OracleDB > insert()");
        }
        public void update()
        {
            Console.WriteLine("OracleDB > update()");
        }
        public void save()
        {
            Console.WriteLine("OracleDB > save()");
        }
    }
    class MongoDB : IRepository
    {
        public void delete()
        {
            Console.WriteLine("MongoDB > delete()");
        }
        public void insert()
        {
            Console.WriteLine("MongoDB > insert()");
        }
        public void update()
        {
            Console.WriteLine("MongoDB > update()");
        }
        public void save()
        {
            Console.WriteLine("MongoDB > save()");
        }
    }
}
