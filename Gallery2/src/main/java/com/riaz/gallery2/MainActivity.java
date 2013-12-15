package com.riaz.gallery2;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        GridView mGridView;
        List<Images> mImages;

        public PlaceholderFragment() {
            mImages = new ArrayList<Images>();
            Images images = new Images("Argentina", R.drawable.argentina);
            mImages.add(images);
            images = new Images("Australia", R.drawable.australia);
            mImages.add(images);
            images = new Images("Austria", R.drawable.austria);
            mImages.add(images);
            images = new Images("Belgium", R.drawable.belgium);
            mImages.add(images);
            images = new Images("Brazil", R.drawable.brazil);
            mImages.add(images);
            images = new Images("Cameroon", R.drawable.cameroon);
            mImages.add(images);
            images = new Images("Canada", R.drawable.canada);
            mImages.add(images);
            images = new Images("Chile", R.drawable.chile);
            mImages.add(images);
            images = new Images("China", R.drawable.china);
            mImages.add(images);
            images = new Images("Denmark", R.drawable.denmark);
            mImages.add(images);
            images = new Images("Finland", R.drawable.finland);
            mImages.add(images);
            images = new Images("Argentina", R.drawable.argentina);
            mImages.add(images);
            images = new Images("Australia", R.drawable.australia);
            mImages.add(images);
            images = new Images("Austria", R.drawable.austria);
            mImages.add(images);
            images = new Images("Belgium", R.drawable.belgium);
            mImages.add(images);
            images = new Images("Brazil", R.drawable.brazil);
            mImages.add(images);
            images = new Images("Cameroon", R.drawable.cameroon);
            mImages.add(images);
            images = new Images("Canada", R.drawable.canada);
            mImages.add(images);
            images = new Images("Chile", R.drawable.chile);
            mImages.add(images);
            images = new Images("China", R.drawable.china);
            mImages.add(images);
            images = new Images("Denmark", R.drawable.denmark);
            mImages.add(images);
            images = new Images("Finland", R.drawable.finland);
            mImages.add(images);
            images = new Images("Argentina", R.drawable.argentina);
            mImages.add(images);
            images = new Images("Australia", R.drawable.australia);
            mImages.add(images);
            images = new Images("Austria", R.drawable.austria);
            mImages.add(images);
            images = new Images("Belgium", R.drawable.belgium);
            mImages.add(images);
            images = new Images("Brazil", R.drawable.brazil);
            mImages.add(images);
            images = new Images("Cameroon", R.drawable.cameroon);
            mImages.add(images);
            images = new Images("Canada", R.drawable.canada);
            mImages.add(images);
            images = new Images("Chile", R.drawable.chile);
            mImages.add(images);
            images = new Images("China", R.drawable.china);
            mImages.add(images);
            images = new Images("Denmark", R.drawable.denmark);
            mImages.add(images);
            images = new Images("Finland", R.drawable.finland);
            mImages.add(images);
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }

        @Override
        public void onViewCreated(View view, Bundle savedInstanceState) {
            super.onViewCreated(view, savedInstanceState);

            mGridView = (GridView) view.findViewById(R.id.gridView);
            mGridView.setAdapter(new GridItemsAdapter());

        }

        public class GridItemsAdapter extends BaseAdapter {

            @Override
            public int getCount() {
                return mImages.size();
            }

            @Override
            public Object getItem(int position) {
                return mImages.get(position);
            }

            @Override
            public long getItemId(int position) {
                return position;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                LayoutInflater inflater = getActivity().getLayoutInflater();
                View view = inflater.inflate(R.layout.grid_layout,null);

                ImageView imageView = (ImageView) view.findViewById(R.id.image_view);

                Images mImages = (Images) getItem(position);
                imageView.setImageResource(mImages.mImage_Drawable);
                return view;
            }
        }
    }
}
