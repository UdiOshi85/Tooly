# Tooly
### A must-to-have android library before you start coding!


[ ![Download](https://api.bintray.com/packages/udioshi85/maven/libGenericSettings/images/download.svg) ](https://bintray.com/udioshi85/maven/Tooly/_latestVersion)[ ![Library license](https://img.shields.io/badge/License-Apache--2.0-blue.svg) ]()

# Installation
    compile 'com.github.udioshi85:tooly:1.+'


### Tooly's Features:

##### Handling View's visibilities
    yourView.setVisible()
    yourView.setGone()
    yourView.setInvisible
    yourView.setVisibility(isVisible)
    
##### dp/px Convertions
    toDp: 8.toDp()
    toPx: 8.toPx()
    
##### Connections
    hasConnection(context) - Check if you have connection with a given context
    
##### Permissions
    hasPermission(context: Context, permission: String)
    hasWriteExternalStoragePermission(context)
    requestExternalStoragePermission(activity: Activity, requestCode: Int)
    hasAccessNetworkStatePermission(context: Context)
    
##### Android Versioning
    isLollipopOrAbove()
    isMarshmelloOrAbove()
    isNugatOrAbove()
    isOreoOrAbove()
    isPieOrAbove()
    
**Requests? Feedbacks? Mail! udioshi@gmail.com**
