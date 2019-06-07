package com.mvpdemoapp.adapter.company;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.mvpdemoapp.R;
import com.squareup.picasso.Picasso;

public class CompanyViewHolder extends RecyclerView.ViewHolder implements CompanyAdapterConfig.View, View.OnClickListener {


    private final ImageView ivCompanyLogo;
    private final TextView tvCompanyName;
    private final TextView tvCompanyDesc;
    private final LinearLayout llMain;
    private CompanyAdapterConfig.Presenter presenter;

    public CompanyViewHolder(@NonNull View itemView, CompanyAdapterConfig.Presenter presenter) {
        super(itemView);

        this.presenter = presenter;
        ivCompanyLogo = (ImageView)itemView.findViewById(R.id.ivCompanyLogo);
        tvCompanyName = (TextView)itemView.findViewById(R.id.tvCompanyName);
        tvCompanyDesc = (TextView)itemView.findViewById(R.id.tvCompanyDesc);
        llMain = (LinearLayout) itemView.findViewById(R.id.llMain);

        llMain.setOnClickListener(this);
    }

    @Override
    public void setCompanyImage(String imagePath) {
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


    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.llMain:
                presenter.onItemClick(getAdapterPosition());
                break;
        }
    }
}
