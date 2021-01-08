import 'profs_model.dart';
import 'scholarship_model.dart';

class BoardModel {
  String name;
  List<Scholarship> scholarship;
  List<Profs> profs;
  String image;
  String description;

  BoardModel(
      {this.name, this.scholarship, this.profs, this.image, this.description});

  BoardModel.fromJson(Map<String, dynamic> json) {
    name = json['name'];
    if (json['scholarship'] != null) {
      scholarship = new List<Scholarship>();
      json['scholarship'].forEach((v) {
        scholarship.add(new Scholarship.fromJson(v));
      });
    }
    if (json['profs'] != null) {
      profs = new List<Profs>();
      json['profs'].forEach((v) {
        profs.add(new Profs.fromJson(v));
      });
    }
    image = json['image'];
    description = json['description'];
  }

  Map<String, dynamic> toJson() {
    final Map<String, dynamic> data = new Map<String, dynamic>();
    data['name'] = this.name;
    if (this.scholarship != null) {
      data['scholarship'] = this.scholarship.map((v) => v.toJson()).toList();
    }
    if (this.profs != null) {
      data['profs'] = this.profs.map((v) => v.toJson()).toList();
    }
    data['image'] = this.image;
    data['description'] = this.description;
    return data;
  }
}
