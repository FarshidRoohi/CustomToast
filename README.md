# Custom Toast

[![API](https://img.shields.io/badge/API-9%2B-blue.svg?style=flat)][![](https://jitpack.io/v/GrenderG/Toasty.svg)](https://jitpack.io/#GrenderG/Toasty)  
- add library gradle : 

```Gradle
    compile 'com.zarinpal:toast:0.0.3'
        
```
# Usage : 

```Java
     // show custom toast 
      new CustomToast(getApplicationContext())
                .setMessage("create Toast")
                .setIcon(R.mipmap.ic_launcher_round)
                .setColor(Color.GRAY, Color.WHITE)
                .setDurationToast(Toast.LENGTH_SHORT)
                .show();
```