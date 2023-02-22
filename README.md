# NodeChecker
Springboot Application
An API used to see running containers and check stats for raspberrypi

If you dont have java installed this API will not work!!

API Endpoints are:

GET <IP>:8080/node/docker -- gets running docker containers
Example response: 



GET <IP>:8080/node/stats  -- gets the stats of RaspberryPi
Example response:
  {
    "temp": {
        "temp": "115.16000000000001'F"
    },
    "uptime": {
        "weeks": "up 1 week",
        "days": " 3 days",
        "hours": " 7 hours",
        "minutes": " 27 minutes"
    },
    "storage": {
        "info": [
            "Filesystem                    Size  Used Avail Use% Mounted on",
            "/dev/root                      28G  3.8G   23G  15% /",
            "/dev/sda1                     255M   31M  225M  12% /boot",
            
        ]
    }
}

