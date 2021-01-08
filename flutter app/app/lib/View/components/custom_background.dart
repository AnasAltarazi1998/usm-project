import 'package:flutter/material.dart';

class CustomBackGround extends StatelessWidget {
  const CustomBackGround({Key key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    final mq = MediaQuery.of(context);
    return Container(
      margin: EdgeInsets.only(
        left: mq.size.width * 0.2,
      ),
      height: MediaQuery.of(context).size.height,
      width: mq.size.width * 0.8,
      decoration: BoxDecoration(
        image: DecorationImage(
          image: AssetImage('assets/images/p2.png'),
          fit: BoxFit.fill,
        ),
      ),
    );
  }
}
