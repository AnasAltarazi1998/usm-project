import 'package:flutter/material.dart';
import 'package:get/get.dart';
import 'package:usm_mobile/view/components/CustomAppBar.dart';
import 'package:usm_mobile/view/components/custom_background.dart';
import 'package:usm_mobile/view/components/custom_circle_avatar.dart';
import 'package:usm_mobile/view/components/custom_shape_circle.dart';
import 'package:usm_mobile/view/components/custom_text_field.dart';
import 'package:usm_mobile/view/components/tiles.dart';

class InterfaceSetting extends StatefulWidget {
  final selected;
  InterfaceSetting({Key key, @required this.selected}) : super(key: key);

  @override
  _InterfaceSettingState createState() => _InterfaceSettingState();
}

class _InterfaceSettingState extends State<InterfaceSetting> {
  @override
  Widget build(BuildContext context) {
    final mq = MediaQuery.of(context);

    return MaterialApp(
      home: Scaffold(
        appBar: CustomAppBar(),
        //backgroundColor: Colors.amber,
        body: Stack(
          children: [
            Row(
              children: [
                SingleChildScrollView(
                  child: Container(
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
                          selected: widget.selected ?? 6,
                        ),
                      ],
                    ),
                  ),
                ),
                // Container(
                //   width: Get.width * 0.8,
                //   child: Text(
                //     " هون حطو \n القصص تبعكن و تركو width*0.8 ",
                //     style: TextStyle(
                //       fontSize: 48,
                //     ),
                //   ),
                // ),
              ],
            ),
            CustomBackGround(),
            SingleChildScrollView(
              child: Column(
                // mainAxisAlignment: MainAxisAlignment.start,
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  Container(
                    margin:
                        EdgeInsets.only(top: mq.size.height * 0.039, left: 85),
                    width: mq.size.width * 0.4,
                    child: Column(
                      children: [
                        CustomTextField(
                          hintText: "Name",
                          labelText: "FIRST NAME",
                        ),
                        SizedBox(
                          height: mq.size.height * 0.025,
                        ),
                        CustomTextField(
                          hintText: "Name",
                          labelText: "LAST NAME",
                        ),
                        SizedBox(
                          height: mq.size.height * 0.025,
                        ),
                        CustomTextField(
                          hintText: "********",
                          labelText: "PASSWORD ",
                        ),
                        SizedBox(
                          height: mq.size.height * 0.025,
                        ),
                        CustomTextField(
                          hintText: "EMAIL",
                          labelText: "EXAMPL@gmail.com",
                        ),
                        SizedBox(
                          height: mq.size.height * 0.025,
                        ),
                        CustomTextField(
                          hintText: "computer science",
                          labelText: "SPECILAIZATION",
                        ),
                        SizedBox(
                          height: mq.size.height * 0.025,
                        ),
                        CustomTextField(
                          hintText: "DD/MM/YYYY",
                          labelText: "BIRTHDATE",
                        ),
                        SizedBox(
                          height: mq.size.height * 0.025,
                        ),
                        CustomTextField(
                          hintText: "YYY",
                          labelText: "REGISTERATION YEAR",
                        ),
                        SizedBox(
                          height: mq.size.height * 0.025,
                        ),
                        CustomTextField(
                          hintText: "YYY",
                          labelText: "CURRENT YEAR",
                        ),
                      ],
                    ),
                  ),
                ],
              ),
            ),
            CustomCircleAvatar(
              image_name: 'assets/images/2.png',
            ),
            CustomShapeCircle(),
          ],
        ),
      ),
    );
  }
}
