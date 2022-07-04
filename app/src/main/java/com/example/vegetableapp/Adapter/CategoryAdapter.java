//package com.example.vegetableapp.Adapter;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.constraintlayout.widget.ConstraintLayout;
//import androidx.core.content.ContextCompat;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.example.vegetableapp.CategoryDomain;
//import com.example.vegetableapp.R;
//
//import java.util.ArrayList;
//
//public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {
//
//    ArrayList<CategoryDomain> categoryDomainList;
//
//    public CategoryAdapter(ArrayList<CategoryDomain> categoryDomainList) {
//        this.categoryDomainList = categoryDomainList;
//    }
//
//    @NonNull
//    @Override
//    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View inflate= LayoutInflater.from(parent.getContext()).inflate(R.layout.,parent,false);
//        return new ViewHolder(inflate);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        holder.categoryName.setText(categoryDomainList.get(position).getTitle());
//        String picURL="";
//
//        switch (position){
//            case 0:{
//                picURL="tomato";
//                holder.mlayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.category_background1));
//            }
//
//            case 1:{
//                picURL="carrot";
//                holder.mlayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.category_background2));
//            }
//
//            case 2:{
//                picURL="brinjal";
//                holder.mlayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.category_background3));
//            }
//
//            case 3:{
//                picURL="cauliflower";
//                holder.mlayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.category_background4));
//            }
//
//            case 4:{
//                picURL="onion";
//                holder.mlayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.category_background5));
//            }
//        }
//
//        int drawableResourceID=holder.itemView.getContext().getResources().getIdentifier(picURL,"drawable",holder.itemView.getContext().getPackageName());
//        Glide
//    }
//
//    @Override
//    public int getItemCount() {
//        return 0;
//    }
//
//    public class ViewHolder extends RecyclerView.ViewHolder{
//
//        TextView categoryName;
//        ImageView categoryPic;
//        ConstraintLayout mlayout;
//
//        public ViewHolder(@NonNull View itemView) {
//            super(itemView);
//            categoryName=itemView.findViewById(R.id.categoryName);
//            categoryPic=itemView.findViewById(R.id.categoryPic);
//            mlayout=itemView.findViewById(R.id.mainLayout);
//        }
//    }
//}
