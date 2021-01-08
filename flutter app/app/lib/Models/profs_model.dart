class Profs {
  String name;
  String image;
  String spec;

  Profs({this.name, this.image, this.spec});

  Profs.fromJson(Map<String, dynamic> json) {
    name = json['name'];
    image = json['image'];
    spec = json['spec'];
  }

  Map<String, dynamic> toJson() {
    final Map<String, dynamic> data = new Map<String, dynamic>();
    data['name'] = this.name;
    data['image'] = this.image;
    data['spec'] = this.spec;
    return data;
  }
}
