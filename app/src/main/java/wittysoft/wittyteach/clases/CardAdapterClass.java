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
        teacher.setName("Matemáticas");
        teacher.setTime("14:00");
        teacher.setDate("02/02/1988");
        teacher.setDuration("2 Horas");
        teacher.setSite("Biblioteca Luis Angel Arango");
        teacher.setState("Pendiente");
        teacher.setTeacher("Luis Alejandro Galvis");
        teacher.setValue(15.000);
        teachers.add(teacher);

        teacher=new ClassItem();
        teacher.setName("Matemáticas");
        teacher.setTime("14:00");
        teacher.setDate("02/02/2018");
        teacher.setDuration("4 Horas");
        teacher.setSite("Casa");
        teacher.setState("Pendiente");
        teacher.setTeacher("Luis Alejandro Galvis");
        teacher.setValue(45.000);
        teachers.add(teacher);

//        teacher=new ClassItem();
//        teacher.setName("nres");
//        teacher.setDate("02/02/1988");
//        teacher.setDuration("2 Horas");
//        teacher.setSite("Biblioteca Luis Angel Arango");
//        teacher.setState("True");
//        teacher.setTeacher("Luis");
//        teacher.setValue(15.0);
//        teachers.add(teacher);
//
//        teacher=new ClassItem();
//        teacher.setName("Dasds");
//        teacher.setDate("02/02/1988");
//        teacher.setDuration("2 Horas");
//        teacher.setSite("Biblioteca Luis Angel Arango");
//        teacher.setState("True");
//        teacher.setTeacher("Luis");
//        teacher.setValue(15.0);
//        teachers.add(teacher);
//
//        teacher=new ClassItem();
//        teacher.setName("nrwqees");
//        teacher.setDate("02/02/1988");
//        teacher.setDuration("2 Horas");
//        teacher.setSite("Biblioteca Luis Angel Arango");
//        teacher.setState("True");
//        teacher.setTeacher("Luis");
//        teacher.setValue(15.0);
//        teachers.add(teacher);
//
//        teacher=new ClassItem();
//        teacher.setName("hjkgh");
//        teacher.setDate("02/02/1988");
//        teacher.setDuration("2 Horas");
//        teacher.setSite("Biblioteca Luis Angel Arango");
//        teacher.setState("True");
//        teacher.setTeacher("Luis");
//        teacher.setValue(15.0);
//        teachers.add(teacher);
//
//        teacher=new ClassItem();
//        teacher.setName("oujt");
//        teacher.setDate("02/02/1988");
//        teacher.setDuration("2 Horas");
//        teacher.setSite("Biblioteca Luis Angel Arango");
//        teacher.setState("True");
//        teacher.setTeacher("Luis");
//        teacher.setValue(15.0);
//        teachers.add(teacher);
    }


    @Override
    public int getItemCount() {
        return teachers.size();
    }


    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {

        ClassItem teacher = teachers.get(i);
        //viewHolder.photo.setImageResource(teacher.getPhoto());
        viewHolder.name.setText(teacher.getName());
        viewHolder.date.setText(teacher.getDate());
        viewHolder.time.setText(teacher.getTime());
        viewHolder.duration.setText(teacher.getDuration());
    //    viewHolder.state.setText(teacher.getState());
        viewHolder.teacher.setText(teacher.getTeacher());
        viewHolder.site.setText(teacher.getSite());
        viewHolder.value.setText(String.valueOf(teacher.getValue()));


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

        public TextView name;
        public TextView date;
        public TextView time;
        public TextView duration;
     //   public TextView state;
        public TextView teacher;
        public TextView site;
        public TextView value;


        public ViewHolder(View itemView) {
            super(itemView);
            name = (TextView)itemView.findViewById(R.id.name);
            date = (TextView)itemView.findViewById(R.id.date);
            time = (TextView)itemView.findViewById(R.id.time);
            duration = (TextView)itemView.findViewById(R.id.duration);
       //     state = (TextView)itemView.findViewById(R.id.state);
            teacher = (TextView)itemView.findViewById(R.id.teacher);
            site = (TextView)itemView.findViewById(R.id.site);
            value = (TextView)itemView.findViewById(R.id.value);
        }
    }
}
