import 'package:flutter/material.dart';

class CustomCircleAvatar extends StatelessWidget {
  final String image_name;
  CustomCircleAvatar({this.image_name});

  @override
  Widget build(BuildContext context) {
    final mq = MediaQuery.of(context);

    return CircleAvatar(
      backgroundColor: Colors.white,
      backgroundImage: AssetImage(
        image_name,
      ),
      radius: 70.0,
      child: Container(
        margin: EdgeInsets.only(
          top: mq.size.height * 0.16,
          left: mq.size.width * 0.18,
        ),
        child: CircleAvatar(
          backgroundColor: Color(0XFF5ee2a0),
          radius: 16.0,
        ),
      ),
    );
  }
}
