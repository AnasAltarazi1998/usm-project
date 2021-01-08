import 'package:flutter/material.dart';
import 'package:get/get.dart';
import 'package:usm_mobile/View/components/CustomAppBar.dart';
import 'package:usm_mobile/View/components/post_UI.dart';
import 'package:usm_mobile/View/components/tiles.dart';
import 'package:usm_mobile/View/components/SearchUI.dart';

class Community_Page extends StatefulWidget {
  Community_Page({Key key}) : super(key: key);

  @override
  Community_Page_State createState() => Community_Page_State();
}

class Community_Page_State extends State<Community_Page> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Row(
        children: [
          Container(
            width: Get.width * 0.2,
            color: Color.fromARGB(255, 67, 66, 93),
            height: Get.height,
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.center,
              mainAxisAlignment: MainAxisAlignment.start,
              children: [
                Container(
                  width: Get.width,
                  padding: EdgeInsets.only(top: 30),
                  color: Color.fromARGB(255, 60, 59, 84),
                  child: Column(
                    crossAxisAlignment: CrossAxisAlignment.center,
                    children: [
                      Container(
                        height: 24,
                        width: 24,
                        child: Image(
                            image: AssetImage(
                          "assets/images/logo.png",
                          // height: 100,
                        )),
                      ),
                      SizedBox(
                        height: 8,
                      ),
                      Text(
                        "USM",
                        style: TextStyle(
                            color: Colors.white,
                            fontFamily: "Segoe",
                            fontSize: 16,
                            fontWeight: FontWeight.bold),
                      ),
                      Text(
                        "UNIVERSITY",
                        style: TextStyle(
                          color: Colors.white,
                          fontFamily: "Segoe",
                          fontSize: 9,
                        ),
                      ),
                      SizedBox(
                        height: 10,
                      ),
                    ],
                  ),
                ),
                Tiles(
                  selected: 4,
                ),
              ],
            ),
          ),
          Container(
            width: Get.width * 0.8,
            child: Post_ui(),
          ),
        ],
      ),
    );
  }
}
