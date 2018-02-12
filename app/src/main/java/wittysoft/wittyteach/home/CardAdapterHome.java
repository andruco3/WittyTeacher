package wittysoft.wittyteach.home;//package wittysoft.wittyteacher.view;

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

public class CardAdapterHome extends RecyclerView.Adapter<CardAdapterHome.ViewHolder>{

    List<HomeItem> teachers;

    public CardAdapterHome(){

        super();
        teachers = new ArrayList<HomeItem>();

        HomeItem teacher=new HomeItem();
        teacher.setName("Libros de cuentos en la tierra del olvido");
        teacher.setDescription("En el corregimiento de Nazareth se erige un pequeño centro cultural que acoge y forma a los niños wayúu cada tarde. Un lugar de paz entre tanta miseria en el que Isabel Fernández González, su coordinadora, hace de madre y de guía.");
        teacher.setPhoto(R.drawable.articulo1);
        teachers.add(teacher);

        teacher=new HomeItem();
        teacher.setName("El hombre que recorre Latinoamérica en busca de la mejor escuela");
        teacher.setDescription("Bruno Iriarte emprendió una travesía desde México hasta Argentina a bordo de una vieja camioneta Volkswagen para conocer las mejores experiencias en educación del continente. Esta es su historia.");
        teacher.setPhoto(R.drawable.articulo2);
        teachers.add(teacher);

//        teacher=new HomeItem();
//        teacher.setName("soy una cosa ");
//        teacher.setDescription("fea 4");
//        teacher.setPhoto(R.drawable.foto1);
//        teachers.add(teacher);
//
//        teacher=new HomeItem();
//        teacher.setName("soy una cosa ");
//        teacher.setDescription("fea 5");
//        teacher.setPhoto(R.drawable.foto1);
//        teachers.add(teacher);
//
//        teacher=new HomeItem();
//        teacher.setName("soy una cosa ");
//        teacher.setDescription("fea 6");
//        teacher.setPhoto(R.drawable.foto1);
//        teachers.add(teacher);
//
//        teacher=new HomeItem();
//        teacher.setName("soy una cosa ");
//        teacher.setDescription("fea 7");
//        teacher.setPhoto(R.drawable.foto1);
//        teachers.add(teacher);
    }


    @Override
    public int getItemCount() {
        return teachers.size();
    }


    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {

        HomeItem teacher = teachers.get(i);
        viewHolder.photo.setImageResource(teacher.getPhoto());
        viewHolder.name.setText(teacher.getName());
        viewHolder.description.setText(teacher.getDescription());
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.home_item, viewGroup, false);

        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }


    class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView photo;
        public TextView name;
        public TextView description;
     //   private TextView profession;
//        private ListView className;

        public ViewHolder(View itemView) {
            super(itemView);
            photo = (ImageView)itemView.findViewById(R.id.img_home);
            name = (TextView)itemView.findViewById(R.id.name);
            description = (TextView)itemView.findViewById(R.id.description);
          //  profession = (TextView)itemView.findViewById(R.id.tv_nature);
//            //className = (ListView) itemView.findViewById(R.id.tv_des_nature);
        }
    }
}
