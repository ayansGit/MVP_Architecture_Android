package com.mvpdemoapp.adapter.company;

public interface CompanyAdapterConfig {

    interface View {
        void setCompanyImage(String imagePath);
        void setCompanyTitle(String companyTitle);
        void setCompanyDescription(String companyDescription);
    }

    interface Presenter {
        void onBindCompanyViewHolder(CompanyViewHolder companyViewHolder, int position);
        int getItemCount();

    }
}
