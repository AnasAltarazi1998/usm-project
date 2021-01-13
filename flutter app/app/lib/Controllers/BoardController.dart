import 'package:get/get.dart';

import 'package:get/get.dart';
import 'package:usm_mobile/Models/BoardModel.dart';
import 'package:usm_mobile/Repositories/BoardRepo.dart';

class BoardController extends GetxController {
  BoardModel b = BoardModel(name: 'test');
  List<BoardModel> search_result = [];
  BoardController() {
    search_result.add(b);
  }
  BoardRepo boardRepo = Get.put(BoardRepo(), tag: 'boardRepo');
  searchControl(String value) async {
    search_result = await boardRepo.search(value);
    update();
  }
}
