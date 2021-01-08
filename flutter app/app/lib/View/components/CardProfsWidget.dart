import 'package:flutter/material.dart';
import 'package:get/get.dart';
import 'package:usm_mobile/Models/profs_model.dart';

class CardPro extends StatelessWidget {
  Profs profs;
  CardPro({this.profs, Key key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Container(
      width: Get.width * 0.22,
      height: Get.height * 0.13,
      child: Card(
        elevation: 7,
        clipBehavior: Clip.antiAlias,
        child: Padding(
          padding: const EdgeInsets.symmetric(vertical: 8),
          child: Column(
              crossAxisAlignment: CrossAxisAlignment.center,
              mainAxisAlignment: MainAxisAlignment.spaceAround,
              children: [
                CircleAvatar(
                  radius: 23,
                  backgroundImage: NetworkImage("${profs.image}"),
                  backgroundColor: Colors.transparent,
                ),
                Text(
                  '${profs.name}',
                  style: TextStyle(
                    fontFamily: "Roboto",
                    color: Colors.black,
                    fontSize: 6,
                    fontWeight: FontWeight.bold,
                  ),
                ),
                Text(
                  '${profs.spec}',
                  style: TextStyle(
                    fontFamily: "Roboto",
                    color: Color(0xAAB39DD8),
                    fontSize: 6,
                    fontWeight: FontWeight.bold,
                  ),
                ),
              ]),
        ),
      ),
    );
  }
}
