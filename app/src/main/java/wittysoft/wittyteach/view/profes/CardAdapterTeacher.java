package wittysoft.wittyteach.view.profes;//package wittysoft.wittyteacher.view;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import wittysoft.wittyteach.R;

/**
 * Created by andres on 5/12/17.
 */

public class CardAdapterTeacher extends RecyclerView.Adapter<CardAdapterTeacher.ViewHolder>{

    List<TeacherItem> teachers;
    //private final OnListFragmentInteractionListener mListener;

    public CardAdapterTeacher(){

        super();
        teachers = new ArrayList<TeacherItem>();

        TeacherItem teacher=new TeacherItem();
        teacher.setName("Diego");
        teacher.setLastName("Corredor");
        teacher.setPhoto(R.drawable.canyon);
        teacher.setLesson("Matematicas, Fisica, Algebra");
        teacher.setDescription("Me gusta el futbol el deporte y otras cosas");
        teachers.add(teacher);

        teacher=new TeacherItem();
        teacher.setName("nres");
        teacher.setLastName("Corredor");
        teacher.setPhoto(R.drawable.foto1);
        teacher.setLesson("Matematicas, Fisica, Algebra");
        teacher.setDescription("Me gusta el futbol el deporte y otras cosas");
        teachers.add(teacher);

        teacher=new TeacherItem();
        teacher.setName("Dasds");
        teacher.setLastName("Corredor");
        teacher.setPhoto(R.drawable.foto1);
        teacher.setLesson("Matematicas, Fisica, Algebra");
        teacher.setDescription("Me gusta el futbol el deporte y otras cosas");
        teachers.add(teacher);

        teacher=new TeacherItem();
        teacher.setName("nrwqees");
        teacher.setLastName("Corredor");
        teacher.setPhoto(R.drawable.foto1);
        teacher.setLesson("Matematicas, Fisica, Algebra");
        teacher.setDescription("Me gusta el futbol el deporte y otras cosas");
        teachers.add(teacher);

        teacher=new TeacherItem();
        teacher.setName("hjkgh");
        teacher.setLastName("Corredor");
        teacher.setPhoto(R.drawable.foto1);

        teacher.setLesson("Matematicas, Fisica, Algebra");
        teacher.setDescription("Me gusta el futbol el deporte y otras cosas");
        teachers.add(teacher);

        teacher=new TeacherItem();
        teacher.setName("oujt");
        teacher.setLastName("Corredor");
        teacher.setPhoto(R.drawable.foto1);
        teacher.setLesson("Matematicas, Fisica, Algebra");
        teacher.setDescription("Me gusta el futbol el deporte y otras cosas");

        teachers.add(teacher);
    }


    @Override
    public int getItemCount() {
        return teachers.size();
    }


    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {

        TeacherItem teacher = teachers.get(i);
        viewHolder.photo.setImageResource(teacher.getPhoto());
        viewHolder.name.setText(teacher.getName());
        viewHolder.lastName.setText(teacher.getLastName());
        viewHolder.description.setText(teacher.getDescription());
        viewHolder.lesson.setText(teacher.getLesson());


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
                .inflate(R.layout.profes_item, viewGroup, false);

        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }


    class ViewHolder extends RecyclerView.ViewHolder{
  //      public final View mView;
        public ImageView photo;
        public TextView name;
        public TextView lastName;
        private TextView description;
        private TextView lesson;

        public ViewHolder(View itemView) {
            super(itemView);
//            mView=itemView;
            photo = (ImageView)itemView.findViewById(R.id.img_teacher);
            name = (TextView)itemView.findViewById(R.id.name);
            lastName = (TextView)itemView.findViewById(R.id.last_name);
            description = (TextView)itemView.findViewById(R.id.description);
            lesson = (TextView) itemView.findViewById(R.id.lesson);
        }
    }
}
