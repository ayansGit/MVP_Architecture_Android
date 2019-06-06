package com.mvpdemoapp.adapter.company;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.mvpdemoapp.R;
import com.mvpdemoapp.apiModels.companyList.CompanyData;

import java.util.List;

public class CompanyAdapter extends RecyclerView.Adapter<CompanyViewHolder> {

    CompanyAdapterConfig.Presenter presenter;

    public CompanyAdapter(Context context, List<CompanyData> companyDataList) {
        presenter = new CompanyPresenter(companyDataList, context);
    }

    @NonNull
    @Override
    public CompanyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new CompanyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_company_list_layout,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CompanyViewHolder companyViewHolder, int i) {
        presenter.onBindCompanyViewHolder(companyViewHolder,i);
    }

    @Override
    public int getItemCount() {
        return presenter.getItemCount();
    }
}
