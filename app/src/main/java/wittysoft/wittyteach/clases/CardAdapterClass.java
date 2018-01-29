package wittysoft.wittyteach.clases;//package wittysoft.wittyteacher.view;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import wittysoft.wittyteach.R;

/**
 * Created by andres on 5/12/17.
 */

public class CardAdapterClass extends RecyclerView.Adapter<CardAdapterClass.ViewHolder>{

    List<ClassItem> teachers;
    //private final OnListFragmentInteractionListener mListener;

    public CardAdapterClass(){

        super();
        teachers = new ArrayList<ClassItem>();

        ClassItem teacher=new ClassItem();
        teacher.setName("Diego");
        teacher.setLastName("Corredor");
        teacher.setPhoto(R.drawable.foto1);
        teachers.add(teacher);

        teacher=new ClassItem();
        teacher.setName("nres");
        teacher.setLastName("Corredor");
        teacher.setPhoto(R.drawable.foto1);
        teachers.add(teacher);

        teacher=new ClassItem();
        teacher.setName("Dasds");
        teacher.setLastName("Corredor");
        teacher.setPhoto(R.drawable.foto1);
        teachers.add(teacher);

        teacher=new ClassItem();
        teacher.setName("nrwqees");
        teacher.setLastName("Corredor");
        teacher.setPhoto(R.drawable.foto1);
        teachers.add(teacher);

        teacher=new ClassItem();
        teacher.setName("hjkgh");
        teacher.setLastName("Corredor");
        teacher.setPhoto(R.drawable.foto1);
        teachers.add(teacher);

        teacher=new ClassItem();
        teacher.setName("oujt");
        teacher.setLastName("Corredor");
        teacher.setPhoto(R.drawable.foto1);
        teachers.add(teacher);
    }


    @Override
    public int getItemCount() {
        return teachers.size();
    }


    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {

        ClassItem teacher = teachers.get(i);
        viewHolder.photo.setImageResource(teacher.getPhoto());
        viewHolder.name.setText(teacher.getName());
        viewHolder.lastName.setText(teacher.getLastName());

//        viewHolder.mView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (null != mListener) {
//                    // Notify the active callbacks interface (the activity, if the
//                    // fragment is attached to one) that an item has been selected.
//                    mListener.onListFragmentInteraction(viewHolder.teacher);
//                }
//            }
//        });
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.class_item, viewGroup, false);

        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }


    class ViewHolder extends RecyclerView.ViewHolder{
  //      public final View mView;
        public ImageView photo;
        public TextView name;
        public TextView lastName;
     //   private TextView profession;
//        private ListView className;

        public ViewHolder(View itemView) {
            super(itemView);
//            mView=itemView;
            photo = (ImageView)itemView.findViewById(R.id.img_teacher);
            name = (TextView)itemView.findViewById(R.id.name);
            lastName = (TextView)itemView.findViewById(R.id.last_name);
          //  profession = (TextView)itemView.findViewById(R.id.tv_nature);
//            //className = (ListView) itemView.findViewById(R.id.tv_des_nature);
        }
    }
}
