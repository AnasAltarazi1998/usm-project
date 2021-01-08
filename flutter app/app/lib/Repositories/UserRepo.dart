import 'dart:convert' as convert;
import 'package:http/http.dart' as http;
import 'package:usm_mobile/Models/user_model.dart';

class UserRepo {
  final baseurl = 'http://syberctf.hadara-group.com:8083/users';

  Future<UserModel> register() async {
    final customurl = baseurl + '/register';

    final response = await http.get(customurl);
    if (response.statusCode == 200) {
      UserModel res = UserModel.fromJson(convert.jsonDecode(response.body));
      return res;
    } else
      return null;
  }

  Future<UserModel> signin(String email, String password) async {
    final customurl = '$baseurl/signin/$email/$password';
    final response = await http.get(customurl);
    if (response.statusCode == 200) {
      UserModel res = UserModel.fromJson(convert.jsonDecode(response.body));
      return res;
    } else {
      return null;
    }
  }
}
