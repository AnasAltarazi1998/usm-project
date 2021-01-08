import 'package:flutter/material.dart';
import 'package:get/get.dart';
import 'package:usm_mobile/View/components/tiles.dart';

class Side_bar extends StatefulWidget {
  final selected;

  const Side_bar({Key key, @required this.selected}) : super(key: key);
  @override
  _Side_Bar_State createState() => _Side_Bar_State();
}

// ignore: camel_case_types
class _Side_Bar_State extends State<Side_bar> {
  @override
  Widget build(BuildContext context) {
    return Row(
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
                selected: widget.selected ?? 6,
              ),
            ],
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
    );
  }
}
