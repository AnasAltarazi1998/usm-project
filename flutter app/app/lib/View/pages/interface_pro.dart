import 'dart:ui';

import 'package:flutter/material.dart';
import 'package:get/get.dart';
import 'package:usm_mobile/Controllers/UserController.dart';
import 'package:usm_mobile/Models/user_model.dart';
import 'package:usm_mobile/View/components/CustomAppBar.dart';
import 'package:usm_mobile/View/components/custom_background.dart';
import 'package:usm_mobile/View/components/custom_circle_avatar.dart';
import 'package:usm_mobile/View/components/custom_text.dart';
import 'package:usm_mobile/View/components/tiles.dart';

class InterFacePro extends StatefulWidget {
  final selected;

  InterFacePro({Key key, @required this.selected}) : super(key: key);

  @override
  _InterFaceProState createState() => _InterFaceProState();
}

class _InterFaceProState extends State<InterFacePro> {
  UserController userController;
  UserModel u;
  @override
  void initState() {
    // TODO: implement initState
    userController = Get.find(tag: 'userController');
    u = userController.userinfo;
    super.initState();
  }

  @override
  Widget build(BuildContext context) {
    final mq = MediaQuery.of(context);
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        appBar: CustomAppBar(),
        //backgroundColor: Colors.amber,
        body: Stack(
          children: [
            CustomBackGround(),
            SingleChildScrollView(
              child: Container(
                width: Get.width * 0.2,
                color: Color.fromARGB(255, 67, 66, 93),
                height: Get.height,
                child: Column(
                  crossAxisAlignment: CrossAxisAlignment.center,
                  mainAxisAlignment: MainAxisAlignment.start,
                  children: [
                    SingleChildScrollView(
                      child: Container(
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
                    ),
                    Tiles(
                      selected: widget.selected ?? 6,
                    ),
                  ],
                ),
              ),
            ),
            //

            Container(
              margin: EdgeInsets.only(
                left: mq.size.width * 0.25,
                // top: mq.size.height * 0.1,
              ),
              child: Row(
                //
                mainAxisAlignment: MainAxisAlignment.start,
                children: [
                  Column(
                    children: <Widget>[
                      CustomCircleAvatar(image_name: 'assets/images/2.png'),
                      SizedBox(
                        height: 28,
                      ),
                      CustomText(
                        text: u.name,
                        color: new Color(0Xff939393),
                        fontWeight: FontWeight.bold,
                      ),
                      CustomText(
                        text: "Age : ${u.age} ",
                        color: new Color(0Xff939393),
                        fontWeight: FontWeight.bold,
                      ),
                      CustomText(
                        text: u.email,
                        color: new Color(0Xff939393),
                        fontWeight: FontWeight.bold,
                        fontSize: 13,
                      ),
                    ],
                  ),
                ],
              ),
            ),
          ],
        ),
      ),
    );
  }
}
