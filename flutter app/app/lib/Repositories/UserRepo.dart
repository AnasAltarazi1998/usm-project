import 'dart:convert' as convert;
import 'dart:convert';
import 'package:http/http.dart' as http;
import 'package:usm_mobile/Models/user_model.dart';
import 'package:usm_mobile/Repositories/Constants.dart';

class UserRepo {
  
  final users_base_url = '$base_url/users';

  Future<UserModel> register() async {
    final customurl = users_base_url + '/register';

    final response = await http.get(customurl);
    if (response.statusCode == 200) {
      UserModel res = UserModel.fromJson(convert.jsonDecode(response.body));
      return res;
    } else
      return null;
  }

  Future<UserModel> signin(String email, String password) async {
    final req_url = '$users_base_url/signin/$email/$password';
    final response = await http.get(req_url);
    if (response.statusCode == 200) {
      UserModel res = UserModel.fromJson(convert.jsonDecode(response.body));
      return res;
    } else {
      return null;
    }
  }

  Future<List<dynamic>> search(String value) async {
    final req_url = "$users_base_url/search/$value";
    final response = await http.get(req_url);
    if (response.statusCode == 200) {
      //print("${response.body} is the response of search req");
      List<dynamic> res =(jsonDecode(response.body));
      return res;
    } else {
      print("${response.statusCode}");
      return null;
    }
  }
}
