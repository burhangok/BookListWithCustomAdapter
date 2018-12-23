package ismek.maverakutuphanesi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    //Components
    public ListView booksListView;


    //Variables
    public List<BookItem> booksList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        booksListView  = findViewById(R.id.m_listview);

        booksList.add(new BookItem("Book 1",R.drawable.book1));

        booksList.add(new BookItem("Book 2",R.drawable.book2));

        booksList.add(new BookItem("Book 3",R.drawable.book3));


        BookAdapter aBook = new BookAdapter(MainActivity.this,booksList);

        booksListView.setAdapter(aBook);

    }
}
