package com.kashish.springboot_beginner.models;

public class User{
private int id;
private String name;
private String gender;
private String image;
public User(){

}
public User(int id, String name, String gender, String image){
    this.id=id;
    this.name=name;
    this.gender=gender;
    this.image=image;
}
public int GetId(){
    return id;  
}
public void SetId(int id){
    this.id=id;
}
public String GetName(){
    return name;  
}
public void SetName(String name){
    this.name=name;
}
public String GetGender(){
    return gender;  
}
public void SetGender(String gender){
    this.gender=gender;
}
public String GetImage(){
    return image;  
}
public void SetImage(String image){
    this.image=image;
}
}