import 'package:flutter/material.dart';
import 'package:get/get.dart';
import 'package:usm_mobile/Controllers/UserController.dart';

class CustomText extends StatelessWidget {
  final String text;
  final double fontSize;
  final Color color;
  final FontWeight fontWeight;
  CustomText(
      {this.text = '',
      this.fontSize = 13,
      this.color = Colors.white,
      this.fontWeight});

  @override
  Widget build(BuildContext context) {
    final mq = MediaQuery.of(context);

    return Container(
      margin: EdgeInsets.only(top: mq.size.width * 0.05),
      width: mq.size.width * 0.37,
      height: mq.size.height * 0.033,
      decoration: BoxDecoration(
          color: new Color(0Xfff1f1f1), borderRadius: BorderRadius.circular(5)),
      child: Center(
        child: GetBuilder<UserController>(
          builder: (_) => Text(
            text,
            style: TextStyle(
                color: color,
                fontFamily: "Segoe",
                fontSize: fontSize,
                fontWeight: fontWeight),
          ),
        ),
      ),
    );
  }
}
