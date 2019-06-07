package com.mvpdemoapp.adapter.company;

import android.content.Context;

import com.mvpdemoapp.apiModels.companyList.CompanyData;
import com.mvpdemoapp.utils.Constants;

import java.util.List;

public class CompanyPresenter implements CompanyAdapterConfig.Presenter {


    private List<CompanyData> companyDataList;
    private Context context;

    public CompanyPresenter(List<CompanyData> companyDataList, Context context) {
        this.companyDataList = companyDataList;
    }


    @Override
    public void onBindCompanyViewHolder(CompanyViewHolder companyViewHolder, int position) {

        companyViewHolder.setCompanyTitle(companyDataList.get(position).getTitle());
        companyViewHolder.setCompanyDescription(companyDataList.get(position).getDescription());
        companyViewHolder.setCompanyImage(Constants.IMAGE_BASE_URL + "company/" + companyDataList.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return companyDataList.size();
    }
}
