package com.mvpdemoapp.adapter.company;

import android.content.Context;

public interface CompanyAdapterConfig {

    interface View {
        void setCompanyImage(String imagePath, Context context);
        void setCompanyTitle(String companyTitle);
        void setCompanyDescription(String companyDescription);
    }

    interface Presenter {
        void onBindCompanyViewHolder(CompanyViewHolder companyViewHolder, int position);
        int getItemCount();

    }
}
