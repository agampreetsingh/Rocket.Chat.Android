package chat.rocket.android.profile.presentation

import chat.rocket.android.core.behaviours.LoadingView
import chat.rocket.android.core.behaviours.MessageView
import chat.rocket.core.model.Myself

interface ProfileView : LoadingView, MessageView {

    /**
     * Shows the user profile.
     *
     * @param avatarUrl The user avatar URL.
     * @param name The user display name.
     * @param username The user username.
     * @param email The user email.
     */
    fun showProfile(avatarUrl: String, name: String, username: String, email: String)

    /**
     * Shows a profile update successfully message
     */
    fun showProfileUpdateSuccessfullyMessage()
}