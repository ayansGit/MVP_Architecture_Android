package com.mvpdemoapp.adapter.company;

import com.mvpdemoapp.apiModels.companyList.CompanyData;

public interface CompanyAdapterConfig {

    interface View {
        void setCompanyImage(String imagePath);
        void setCompanyTitle(String companyTitle);
        void setCompanyDescription(String companyDescription);
    }

    interface Presenter {
        void onBindCompanyViewHolder(CompanyViewHolder companyViewHolder, int position);
        int getItemCount();
        void onItemClick(int position);
    }

    interface OnItemClickListener{
        void setOnItemClickListener(CompanyData companyData);
    }
}
