
package com.mvpdemoapp.apiModels.companyList;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CompanyListResponse implements Parcelable
{

    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("data")
    @Expose
    private List<CompanyData> data = null;
    @SerializedName("message")
    @Expose
    private String message;
    public final static Creator<CompanyListResponse> CREATOR = new Creator<CompanyListResponse>() {


        @SuppressWarnings({
            "unchecked"
        })
        public CompanyListResponse createFromParcel(Parcel in) {
            return new CompanyListResponse(in);
        }

        public CompanyListResponse[] newArray(int size) {
            return (new CompanyListResponse[size]);
        }

    }
    ;

    protected CompanyListResponse(Parcel in) {
        this.status = ((Integer) in.readValue((Integer.class.getClassLoader())));
        in.readList(this.data, (CompanyData.class.getClassLoader()));
        this.message = ((String) in.readValue((String.class.getClassLoader())));
    }

    public CompanyListResponse() {
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<CompanyData> getData() {
        return data;
    }

    public void setData(List<CompanyData> data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(status);
        dest.writeList(data);
        dest.writeValue(message);
    }

    public int describeContents() {
        return  0;
    }

}
