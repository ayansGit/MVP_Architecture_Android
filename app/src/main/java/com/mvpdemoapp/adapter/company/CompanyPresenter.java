package com.mvpdemoapp.adapter.company;

import android.content.Context;

import com.mvpdemoapp.apiModels.companyList.CompanyData;
import com.mvpdemoapp.utils.Constants;

import java.util.List;

public class CompanyPresenter implements CompanyAdapterConfig.Presenter {


    private Context context;
    private List<CompanyData> companyDataList;
    private CompanyAdapterConfig.OnItemClickListener onItemClickListener;

    public CompanyPresenter() {
    }

    public CompanyPresenter(List<CompanyData> companyDataList, Context context) {
        this.context = context;
        this.companyDataList = companyDataList;
    }

    public CompanyPresenter(Context context, List<CompanyData> companyDataList, CompanyAdapterConfig.OnItemClickListener onItemClickListener) {
        this.context = context;
        this.companyDataList = companyDataList;
        this.onItemClickListener = onItemClickListener;
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

    @Override
    public void onItemClick(int position) {

        onItemClickListener.setOnItemClickListener(companyDataList.get(position));
    }


}
