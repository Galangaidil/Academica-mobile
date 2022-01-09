package com.example.academica;

import android.os.Parcel;
import android.os.Parcelable;

public class CourseRVModal implements Parcelable {
    private String courseName;
    private String coursePrice;
    private String courseSuitedFor;
    private String courseImageLink;
    private String courseLink;
    private String courseDescription;
    private String courseId;

    public CourseRVModal(){

    }

    public CourseRVModal(String courseName, String coursePrice, String courseSuitedFor, String courseImageLink, String courseLink, String courseDescription, String courseId) {
        this.courseName = courseName;
        this.coursePrice = coursePrice;
        this.courseSuitedFor = courseSuitedFor;
        this.courseImageLink = courseImageLink;
        this.courseLink = courseLink;
        this.courseDescription = courseDescription;
        this.courseId = courseId;
    }

    protected CourseRVModal(Parcel in) {
        courseName = in.readString();
        coursePrice = in.readString();
        courseSuitedFor = in.readString();
        courseImageLink = in.readString();
        courseLink = in.readString();
        courseDescription = in.readString();
        courseId = in.readString();
    }

    public static final Creator<CourseRVModal> CREATOR = new Creator<CourseRVModal>() {
        @Override
        public CourseRVModal createFromParcel(Parcel in) {
            return new CourseRVModal(in);
        }

        @Override
        public CourseRVModal[] newArray(int size) {
            return new CourseRVModal[size];
        }
    };

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(String coursePrice) {
        this.coursePrice = coursePrice;
    }

    public String getCourseSuitedFor() {
        return courseSuitedFor;
    }

    public void setCourseSuitedFor(String courseSuitedFor) {
        this.courseSuitedFor = courseSuitedFor;
    }

    public String getCourseImageLink() {
        return courseImageLink;
    }

    public void setCourseImageLink(String courseImageLink) {
        this.courseImageLink = courseImageLink;
    }

    public String getCourseLink() {
        return courseLink;
    }

    public void setCourseLink(String courseLink) {
        this.courseLink = courseLink;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(courseName);
        parcel.writeString(coursePrice);
        parcel.writeString(courseSuitedFor);
        parcel.writeString(courseImageLink);
        parcel.writeString(courseLink);
        parcel.writeString(courseDescription);
        parcel.writeString(courseId);
    }
}
