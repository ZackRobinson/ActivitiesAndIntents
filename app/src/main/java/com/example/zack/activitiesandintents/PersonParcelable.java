package com.example.zack.activitiesandintents;

import android.os.Parcel;
import android.os.Parcelable;


/**
 * Created by Zack on 8/31/2017.
 */

public class PersonParcelable implements Parcelable {
    String name;
    String gender;

    public PersonParcelable(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    protected PersonParcelable(Parcel in) {
        name = in.readString();
        gender = in.readString();
    }

    public static final Creator<PersonParcelable> CREATOR = new Creator<PersonParcelable>() {
        @Override
        public PersonParcelable createFromParcel(Parcel in) {
            return new PersonParcelable(in);
        }

        @Override
        public PersonParcelable[] newArray(int size) {
            return new PersonParcelable[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "PersonSerializable{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(gender);
    }
}
