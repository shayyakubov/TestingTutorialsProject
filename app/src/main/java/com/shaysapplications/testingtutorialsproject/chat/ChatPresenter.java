package com.shaysapplications.testingtutorialsproject.chat;

public class ChatPresenter implements ChatContract.Presenter {

    private ChatContract.View chatView;

    public ChatPresenter(ChatContract.View view) {
        chatView = view;
    }

    @Override
    public void sendMessage(String message) {
        if(message==null||message.isEmpty()){
            return;
        }
        chatView.addMessage(message);
    }

    @Override
    public void messageInputChanged(String messageInput) {
            if(messageInput == null|| messageInput.isEmpty()){
                chatView.disableSendButton();
            }
            chatView.enableSendbutton();
    }
}
