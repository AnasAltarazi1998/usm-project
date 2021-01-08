import 'package:flutter/material.dart';
import 'package:get/get.dart';

class ScholarShipsCard extends StatelessWidget {
  String img, title, description;

  ScholarShipsCard({this.img, this.title, this.description, Key key})
      : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Container(
      margin: EdgeInsets.all(9.5),
      //width: Get.width * 0.5,
      height: Get.height * 0.2,
      child: Card(
        shape: RoundedRectangleBorder(
          borderRadius: BorderRadius.all(Radius.circular(60)),
        ),
        color: Colors.purple[50],
        child: Padding(
          padding: const EdgeInsets.all(10),
          child: Center(
            child: Column(
              mainAxisAlignment: MainAxisAlignment.spaceAround,
              children: [
                Row(
                  mainAxisAlignment: MainAxisAlignment.center,
                  children: [
                    CircleAvatar(
                      radius: 26,
                      backgroundImage: AssetImage(
                        "assets/images/logo.png",
                      ),
                    ),
                    Padding(
                      padding: const EdgeInsets.only(left: 12),
                      child: Text(
                        title,
                        style: TextStyle(
                          fontFamily: "Roboto",
                          fontSize: 19,
                        ),
                      ),
                    ),
                  ],
                ),
                Padding(
                  padding: const EdgeInsets.fromLTRB(5, 4, 5, 10),
                  child: Text(
                    description,
                    style: TextStyle(
                      fontSize: 10,
                      fontFamily: "Roboto",
                      color: Color.fromARGB(255, 112, 112, 112),
                    ),
                  ),
                ),
              ],
            ),
          ),
        ),
      ),
    );
  }
}
