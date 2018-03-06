package com.example.lessr.gitreference;

/**
 * Created by lessr on 3/4/2018.
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class GitReferenceAdapter extends BaseAdapter{
    private Context mContext;
    private LayoutInflater mInflater;
    private ArrayList<GitReference> mDataSource;

    public GitReferenceAdapter(Context context, ArrayList<GitReference> arrayList) {
        this.mContext = context;
        this.mDataSource = arrayList;
        mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return mDataSource.size();
    }

    @Override
    public Object getItem(int i) {
        return mDataSource.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View rowView = mInflater.inflate(R.layout.layout, viewGroup, false);


        TextView command = rowView.findViewById(R.id.command);
        TextView example = rowView.findViewById(R.id.example);
        TextView explanation = rowView.findViewById(R.id.explanation);
        TextView section = rowView.findViewById(R.id.section);

        GitReference gitReference = (GitReference) getItem(i);

        command.setText("Command: " + gitReference.getCommand());
        example.setText("Example: " + gitReference.getExample());
        explanation.setText("Explanation: " + gitReference.getExplanation());
        section.setText("Section: " + gitReference.getSection());

        return rowView;
    }

}
