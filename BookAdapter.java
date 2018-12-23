package ismek.maverakutuphanesi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class BookAdapter extends BaseAdapter {

    List<BookItem> abookList;
    LayoutInflater alayoutInflater;
    public int position;

    public BookAdapter(Activity activity, List<BookItem> abookList) {
        this.alayoutInflater= (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.abookList = abookList;
    }

    @Override

    public int getCount() {
        return abookList.size();
    }

    @Override
    public Object getItem(int i) {
        return abookList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView( int i, View view, ViewGroup viewGroup) {

        final View rowView;


        rowView = alayoutInflater.inflate(R.layout.row_layout,null);

        ImageView r_coverPhoto = rowView.findViewById(R.id.b_imageView);
        TextView r_bookName = rowView.findViewById(R.id.bName);

        Button r_detailButton  = rowView.findViewById(R.id.deleteB);

        BookItem tmpObject = abookList.get(i);

        r_bookName.setText(tmpObject.getBookName());
        r_coverPhoto.setImageResource(tmpObject.getCoverPhoto());

        r_detailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent passtoDetail = new Intent(rowView.getContext(),BookDetailActivity.class);
                rowView.getContext().startActivity(passtoDetail);
            }
        });

        return rowView;
    }
}
