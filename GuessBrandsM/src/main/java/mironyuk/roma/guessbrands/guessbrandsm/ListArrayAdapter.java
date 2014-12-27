package mironyuk.roma.guessbrands.guessbrandsm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import mironyuk.roma.guessbrands.guessbrandsm.Models.ItemProgress;

/**
 * Created by Roma on 13.12.2014.
 */
public class ListArrayAdapter extends ArrayAdapter<ItemProgress> {

    private final Context context;
    private final int layoutResourceId;
    private ItemProgress[] values = null;

    public ListArrayAdapter(Context context, int layoutResourceId, ItemProgress[] values) {
        super(context, layoutResourceId, values);
        this.context = context;
        this.layoutResourceId = layoutResourceId;
        this.values = values;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        /*/ Get the data item for this position
        ItemProgress item = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.progress_item, parent, false);
        }
        // Lookup view for data population
        TextView tvName = (TextView) convertView.findViewById(R.id.textViewLevel);
        TextView tvHome = (TextView) convertView.findViewById(R.id.textViewPercent);
        // Populate the data into the template view using the data object
        tvName.setText(item.getLevel());
        tvHome.setText(item.getProgress());
        // Return the completed view to render on screen
        //return convertView;*/

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.progress_item, parent, false);

        LinearLayout linearLayout = (LinearLayout)rowView.findViewById(R.id.layoutItem);
        TextView textViewLevel = (TextView) rowView.findViewById(R.id.textViewLevel);
        TextView textViewPercent = (TextView) rowView.findViewById(R.id.textViewPercent);
        ProgressBar progressBar = (ProgressBar)rowView.findViewById(R.id.progressBar);

        String percent = String.valueOf(values[position].getProgress());
        textViewLevel.setText(values[position].getLevel());
        textViewPercent.setText(percent+"%");
        progressBar.setProgress(values[position].getProgress());

        return rowView;
    }
}