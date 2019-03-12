package com.shaysapplications.testingtutorialsproject.chat;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class MessagesAdapter extends ArrayAdapter<String>{

    public MessagesAdapter(Context context, int resource) {
        super(context, resource);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }
}
