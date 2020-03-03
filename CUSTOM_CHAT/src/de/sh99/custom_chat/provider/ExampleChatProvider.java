package de.sh99.custom_chat.provider;

import com.sun.istack.internal.NotNull;
import de.sh99.vaultx.manager.ChatManager;
import de.sh99.vaultx.provider.ChatProvider;

public class ExampleChatProvider implements ChatProvider
{
    private ChatManager chatManager;

    public ExampleChatProvider(@NotNull ChatManager chatManager)
    {
        this.chatManager = chatManager;
    }

    @Override
    public ChatManager getChatManager() {
        return this.chatManager;
    }
}
