package personal.aron.devstuff.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import personal.aron.devstuff.R;
import personal.aron.devstuff.dto.Module;
import personal.aron.devstuff.general.Utils;

/**
 * Created by a596771 on 28-02-2017.
 */

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder> {

    private Context mContext;
    private Module[] moduleList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, desc;
        public ImageView thumbnail, overflow;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            desc = (TextView) view.findViewById(R.id.desc);
            thumbnail = (ImageView) view.findViewById(R.id.thumbnail);
        }
    }

    public HomeAdapter(Context mContext, Module[] moduleList) {
        this.mContext = mContext;
        this.moduleList = moduleList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.home_row_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        final Module module = moduleList[position];
        holder.title.setText(module.getName());
        holder.desc.setText(module.getDesc());
        //holder.thumbnail.setImageResource(module.getThumbnail());
        Picasso.with(mContext).load(module.getThumbnail()).placeholder(R.drawable.demo_bg).into(holder.thumbnail);

        holder.thumbnail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openModuleByTag(mContext,module.getModuleTag(),null);
            }
        });

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openModuleByTag(mContext,module.getModuleTag(),null);
            }
        });

    }

    @Override
    public int getItemCount() {
        return moduleList.length;
    }
}