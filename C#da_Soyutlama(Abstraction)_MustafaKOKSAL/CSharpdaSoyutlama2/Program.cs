using System;

namespace CSharpdaSoyutlama1
{
    public abstract class MobilePhone
    {
        public void Calling();
        public void SendSMS();
    }
    public class Samsung : MobilePhone { }
    public class Nokia2700 : MobilePhone
    {
        public void FMRadio();
        public void MP3();
        public void Camera();
    }
    public class BlackBerry : MobilePhone
    {
        public void FMRadio();
        public void MP3();
        public void Camera();
        public void Recording();
        public void ReadAndSendEmails();
    }
}
