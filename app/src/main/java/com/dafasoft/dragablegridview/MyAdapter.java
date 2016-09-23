package com.dafasoft.dragablegridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by zhangyulong on 16/9/22.
 */
public class MyAdapter extends BaseDragableAdapter<String> {
    public MyAdapter(Context context) {
        super(context);
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null) {
            viewHolder = new ViewHolder();
            view = mInflater.inflate(R.layout.adapter_my , null);
            viewHolder.mItemTv = (TextView) view.findViewById(R.id.tv_item);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder)view.getTag();
        }
        if (mHidePosition == i) {
            view.setVisibility(View.GONE);
        } else {
            view.setVisibility(View.VISIBLE);
        }
        viewHolder.mItemTv.setText(mList.get(i));
        return view;
    }

    class ViewHolder{
        TextView mItemTv;
    }
}
