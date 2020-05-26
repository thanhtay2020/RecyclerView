package com.example.recyclerdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.fusionlab.contact.adapter.ContactAdapter;
import com.fusionlab.contact.dto.Contact;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvContact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvContact = findViewById(R.id.rv_contact);
        ContactAdapter adapter = new ContactAdapter(getContactList());
        RecyclerView.LayoutManager manager = new LinearLayoutManager(MainActivity.this);

        rvContact.setLayoutManager(manager);
        rvContact.setAdapter(adapter);
    }

    private ArrayList<Contact> getContactList(){
        ArrayList<Contact> cList = new ArrayList<>();

        Contact c1 = new Contact(1,"John","123456");
        cList.add(c1);

        Contact c2 = new Contact(2,"Than Htay Aung","123456");
        cList.add(c2);

        Contact c3 = new Contact(3,"Ye Myat Phone","123456");
        cList.add(c3);

        Contact c4 = new Contact(4,"Aung Chan Phyo","123456");
        cList.add(c4);

        Contact c5 = new Contact(5,"Kyaw Kyaw","123456");
        cList.add(c5);

        Contact c6 = new Contact(1,"John","123456");
        cList.add(c6);

        Contact c7 = new Contact(2,"Than Htay Aung","123456");
        cList.add(c7);

        Contact c8 = new Contact(3,"Ye Myat Phone","123456");
        cList.add(c8);

        Contact c9 = new Contact(4,"Aung Chan Phyo","123456");
        cList.add(c9);

        Contact c10 = new Contact(5,"Kyaw Kyaw","123456");
        cList.add(c10);

        return cList;
    }
}
