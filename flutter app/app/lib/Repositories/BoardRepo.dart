import 'dart:convert';

import 'package:usm_mobile/Models/BoardModel.dart';
import 'package:usm_mobile/Repositories/Constants.dart';
import 'package:http/http.dart' as http;

class BoardRepo {
  final board_base_url = "$base_url/boards";
  Future<List<dynamic>> search(String value) async {
    final req_url = "$board_base_url/search/$value";
    final response = await http.get(req_url);
    if (response.statusCode == 200) {
      print("${response.body} is the response of search req");
      List<dynamic> res =(jsonDecode(response.body));
      return res;
    } else {
      print("${response.statusCode}");
      return null;
    }
  }
}
