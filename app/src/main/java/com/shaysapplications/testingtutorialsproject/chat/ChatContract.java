package com.shaysapplications.testingtutorialsproject.chat;

public interface ChatContract {
    interface View{
        void addMessage(String message);
        void enableSendbutton();
        void disableSendButton();
        void clearMessageInput();
    }

    interface Presenter{
        void sendMessage(String message);
        void messageInputChanged(String messageInput);
    }
}
