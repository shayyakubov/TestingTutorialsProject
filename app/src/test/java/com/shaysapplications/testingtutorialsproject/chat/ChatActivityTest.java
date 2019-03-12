package com.shaysapplications.testingtutorialsproject.chat;

import android.widget.EditText;
import android.widget.ImageView;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(RobolectricTestRunner.class)
public class ChatActivityTest {
    public static final String MESSAGE = "Normal Message";
    private ChatActivity chatActivity;
    private EditText messageInput;
    private ImageView sendButton;

    @Mock
    private MessagesAdapter messagesAdapter;
    @Mock
    private List<String> listOfMessages;
    @Mock
    private ChatPresenter chatPresenter;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        chatActivity = Robolectric.buildActivity(ChatActivity).create().start().resume().get();

    }
}