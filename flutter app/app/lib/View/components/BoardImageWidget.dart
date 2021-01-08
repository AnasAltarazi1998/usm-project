import 'package:flutter/material.dart';
import 'package:get/get.dart';

class BoardImage extends StatelessWidget {
  String imgUrl;

  BoardImage({
    Key key,
    @required this.imgUrl,
  }) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Card(
      clipBehavior: Clip.antiAliasWithSaveLayer,
      child: Image.network(
        "$imgUrl",
        fit: BoxFit.fill,
        height: Get.height * 0.22,
        width: Get.width,
      ),
      margin: EdgeInsets.symmetric(horizontal: 12),
    );
  }
}
