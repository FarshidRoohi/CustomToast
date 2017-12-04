# Custom Toast
- add library gradle : 

```Gradle
    compile 'com.zarinpal:toast:0.0.3'
        
```
- Use example : 

```Java
     // show custom toast 
      new CustomToast(getApplicationContext())
                .setMessage("create Toast")
                .setIcon(R.mipmap.ic_launcher_round)
                .setColor(Color.GRAY, Color.WHITE)
                .setDurationToast(Toast.LENGTH_SHORT)
                .show();
```