package xget.mc.mypartner.data.sources

import com.russhwolf.settings.Settings
import com.russhwolf.settings.long
import com.russhwolf.settings.string
import xget.mc.mypartner.viewmodel.screens.Level1Navigation

class MySettings (s : Settings) {


    // here we define all our local settings properties,
    // by using the MultiplatformSettings library delegated properties

    var listCacheTimestamp by s.long(defaultValue = 0)
    var savedLevel1URI by s.string(defaultValue = Level1Navigation.ChatScreen.screenIdentifier.URI)


}