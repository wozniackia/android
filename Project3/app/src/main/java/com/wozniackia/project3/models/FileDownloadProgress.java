package com.wozniackia.project3.models;

import android.os.Parcel;
import android.os.Parcelable;

public class FileDownloadProgress implements Parcelable {
    public static final Creator<FileDownloadProgress> CREATOR = new Creator<FileDownloadProgress>() {
        @Override
        public FileDownloadProgress createFromParcel(Parcel in) {
            return new FileDownloadProgress(in);
        }

        @Override
        public FileDownloadProgress[] newArray(int size) {
            return new FileDownloadProgress[size];
        }
    };
    private final Integer bytesDownloaded;
    private final Integer totalBytes;
    private final String status;

    protected FileDownloadProgress(Parcel in) {
        if (in.readByte() == 0) {
            bytesDownloaded = null;
        } else {
            bytesDownloaded = in.readInt();
        }
        if (in.readByte() == 0) {
            totalBytes = null;
        } else {
            totalBytes = in.readInt();
        }
        status = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        if (bytesDownloaded == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(bytesDownloaded);
        }
        if (totalBytes == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(totalBytes);
        }
        parcel.writeString(status);
    }
}
