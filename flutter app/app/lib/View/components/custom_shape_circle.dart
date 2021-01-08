import 'package:flutter/material.dart';

class CustomShapeCircle extends StatelessWidget {
  const CustomShapeCircle({Key key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    final mq = MediaQuery.of(context);

    return Positioned(
      top: mq.size.height * 0.15,
      right: 38,
      child: Column(
        children: [
          Container(
            height: 30,
            width: 35,
            decoration: BoxDecoration(
              shape: BoxShape.circle,
              color: Colors.white,
            ),
            child: Icon(
              Icons.add_a_photo,
              color: Color(0XFF545871),
            ),
          ),
        ],
      ),
    );
  }
}
