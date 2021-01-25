package com.example.layout;

import android.content.Context;
import android.media.Image;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView txtPaymentStatus;
        public TextView txtStatusMessage;
        public TextView txtOrderId;
        public TextView txtDateTime;
        public TextView txtTotalAmount;
        public TextView txtTitle;
        public TextView txtPack;
        public TextView txtQuantity;
        public TextView txtMeetupLocation;
        public TextView txtDepartureDate;
        public ImageView imageProduct;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtPaymentStatus = itemView.findViewById(R.id.text_payment_status);
            txtStatusMessage = itemView.findViewById(R.id.text_status_message);
            txtOrderId = itemView.findViewById(R.id.text_order_id);
            txtDateTime = itemView.findViewById(R.id.text_date_time);
            txtTotalAmount = itemView.findViewById(R.id.text_total_amount);
            txtTitle = itemView.findViewById(R.id.text_title);
            txtPack = itemView.findViewById(R.id.text_package);
            txtQuantity = itemView.findViewById(R.id.text_quantity);
            txtMeetupLocation = itemView.findViewById(R.id.text_meetup_location);
            txtDepartureDate = itemView.findViewById(R.id.text_departure_date);
            imageProduct = itemView.findViewById(R.id.image_product);
        }
    }

    private ArrayList<OrderModel> orderList;
    private Context context;

    public ItemAdapter(Context context, ArrayList<OrderModel> order) {
        this.context = context;
        this.orderList = order;
    }

    @NonNull
    @Override
    public ItemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context =parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View contactView = inflater.inflate(R.layout.item_recyclerview,parent,false);

        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final OrderModel orderModel = orderList.get(position);

        holder.txtPaymentStatus.setText(orderModel.getPaymentStatus());
        holder.txtStatusMessage.setText(orderModel.getStatusMessage());
        holder.txtTitle.setText(orderModel.getTitle());
        holder.txtOrderId.setText(orderModel.getOrderId());
        holder.txtDepartureDate.setText(orderModel.getDepartureDate());
        holder.txtMeetupLocation.setText(orderModel.getMeetupLocation());
        holder.txtQuantity.setText(orderModel.getQuantity());
        holder.txtPack.setText(orderModel.getPack());
        holder.txtTotalAmount.setText(orderModel.getTotalAmount());
        holder.txtDateTime.setText(orderModel.getDateTime());
        Glide.with(context).load(orderModel.getImage()).into(holder.imageProduct);
        //Picasso.get().load(Uri.parse(orderModel.getImage())).into(holder.imageProduct);
    }

    @Override
    public int getItemCount() {
        return orderList.size();
    }
}
