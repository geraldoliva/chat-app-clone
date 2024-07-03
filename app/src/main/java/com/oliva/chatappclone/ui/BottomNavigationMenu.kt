package com.oliva.chatappclone.ui

import androidx.navigation.NavDestination
import com.oliva.chatappclone.DestinationScreen
import com.oliva.chatappclone.R

enum class BottomNavigationItem(val icon: Int, val navDestination: DestinationScreen) {
    PROFILE(R.drawable.baseline_profile, DestinationScreen.Profile),
    CHATLIST(R.drawable.baseline_chat, DestinationScreen.ChatList),
    STATUSLIST(R.drawable.baseline_status, DestinationScreen.StatusList)
}