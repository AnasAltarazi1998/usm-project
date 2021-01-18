import 'package:flutter/material.dart';
import 'package:get/get.dart';
import 'package:usm_mobile/View/components/CustomAppBar.dart';
import 'package:usm_mobile/View/components/post_UI.dart';
import 'package:usm_mobile/View/components/tiles.dart';
import 'package:usm_mobile/View/components/SearchUI.dart';

import '../components/side_bar.dart';

class Community_Page extends StatefulWidget {
  Community_Page({Key key}) : super(key: key);

  @override
  Community_Page_State createState() => Community_Page_State();
}

class Community_Page_State extends State<Community_Page> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: CustomAppBar(),
      body: Row(
        children: [
          Side_bar(selected: 1),
          Container(
            width: Get.width * 0.8,
            child: Post_ui(),
          ),
        ],
      ),
    );
  }
}
