import 'package:flutter/material.dart';
//import 'package:get/get.dart';

class MyDivider extends StatelessWidget {
  const MyDivider({
    Key key,
  }) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Container(
      padding: const EdgeInsets.symmetric(horizontal: 75),
      child: Divider(color: Color(0xAA836FA9), thickness: 2),
    );
  }
}
