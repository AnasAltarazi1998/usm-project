class Scholarship {
  String title;
  String attach;
  String date;
  String expiredDate;

  Scholarship({this.title, this.attach, this.date, this.expiredDate});

  Scholarship.fromJson(Map<String, dynamic> json) {
    title = json['title'];
    attach = json['attach'];
    date = json['date'];
    expiredDate = json['expiredDate'];
  }

  Map<String, dynamic> toJson() {
    final Map<String, dynamic> data = new Map<String, dynamic>();
    data['title'] = this.title;
    data['attach'] = this.attach;
    data['date'] = this.date;
    data['expiredDate'] = this.expiredDate;
    return data;
  }
}
