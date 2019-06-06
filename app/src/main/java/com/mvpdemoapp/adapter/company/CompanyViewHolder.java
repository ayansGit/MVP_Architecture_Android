package com.mvpdemoapp.adapter.company;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.mvpdemoapp.R;
import com.squareup.picasso.Picasso;

public class CompanyViewHolder extends RecyclerView.ViewHolder implements CompanyAdapterConfig.View {


    private final ImageView ivCompanyLogo;
    private final TextView tvCompanyName;
    private final TextView tvCompanyDesc;

    public CompanyViewHolder(@NonNull View itemView) {
        super(itemView);

        ivCompanyLogo = (ImageView)itemView.findViewById(R.id.ivCompanyLogo);
        tvCompanyName = (TextView)itemView.findViewById(R.id.tvCompanyName);
        tvCompanyDesc = (TextView)itemView.findViewById(R.id.tvCompanyDesc);
    }

    @Override
    public void setCompanyImage(String imagePath, Context context) {
        Picasso.get().load(imagePath).into(ivCompanyLogo);

    }

    @Override
    public void setCompanyTitle(String companyTitle) {

        tvCompanyName.setText(companyTitle);
    }

    @Override
    public void setCompanyDescription(String companyDescription) {

        tvCompanyDesc.setText(companyDescription);
    }
}
