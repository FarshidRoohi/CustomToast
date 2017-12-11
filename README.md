# Custom Toast

![API](https://img.shields.io/badge/API-14%2B-blue.svg?style=flat)
- add library gradle : 

```Gradle
    compile 'com.zarinpal:toast:0.0.4'
        
```
`Usage` : 

```Java
      // show custom toast
        new Toast(getApplicationContext())
            .setMessage("zarinpal Toast")
            .setColor(Color.GRAY, Color.WHITE)
            .setIcon(R.mipmap.ic_launcher_round)
            .setDurationToast(Toast.LENGTH_SHORT)
            .show();
```