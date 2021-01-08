class UserModel {
  int id;
  String name;
  String email;
  String password;
  String img;
  String age;

  UserModel(
      {this.id, this.name, this.email, this.password, this.img, this.age});

  UserModel.fromJson(Map<String, dynamic> json) {
    id = json['id'];
    name = json['name'];
    email = json['email'];
    password = json['password'];
    img = json['img'];
    age = json['age'];
  }

  Map<String, dynamic> toJson() {
    final Map<String, dynamic> data = new Map<String, dynamic>();
    data['id'] = this.id;
    data['name'] = this.name;
    data['email'] = this.email;
    data['password'] = this.password;
    data['img'] = this.img;
    data['age'] = this.age;
    return data;
  }
}
