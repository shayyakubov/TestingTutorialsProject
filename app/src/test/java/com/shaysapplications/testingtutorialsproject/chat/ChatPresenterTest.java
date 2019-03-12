package com.shaysapplications.testingtutorialsproject.chat;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

public class ChatPresenterTest {
    private ChatPresenter chatPresenter;
    @Mock
    private ChatContract.View chatView;
    private String message = "hello world";

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        chatPresenter = new ChatPresenter(chatView);
    }

    @Test
    public void sendMessageNullStringNoMessageSent() {
        chatPresenter.sendMessage(null);
        verify(chatView,never()).addMessage(anyString());

    }

    @Test
    public void sendMessageEmptyStringNoMessageSent() {
        chatPresenter.sendMessage("");
        verify(chatView,never()).addMessage(anyString());
    }

    @Test
    public void sendMessageCorrectStringMessageSent() {

        chatPresenter.sendMessage(message);
        verify(chatView).addMessage(message);
    }


    @Test
    public void messageInputChangedNullStringSendButtonDisabled(){
        chatPresenter.messageInputChanged(null);
        verify(chatView).disableSendButton();
    }

    @Test
    public void messageInputChangedEmptyStringSendButtonDisabled(){
        chatPresenter.messageInputChanged("");
        verify(chatView).disableSendButton();
    }

    @Test
    public void messageInputChangedCorrectStringSendButtonEnabled(){
        chatPresenter.messageInputChanged(message);
        verify(chatView).enableSendbutton();
    }
}