import 'package:flutter/material.dart';
import 'package:get/get.dart';

class PostCardDivider extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Container(
      height: 20,
      child: Row(
        children: [
          Padding(
            padding: EdgeInsets.all(1),
            child: CircleAvatar(
              radius: 2,
              backgroundColor: Colors.black.withOpacity(0.2),
            ),
          ),
          Padding(
            padding: EdgeInsets.all(1),
            child: CircleAvatar(
              radius: 2,
              backgroundColor: Colors.black.withOpacity(0.2),
            ),
          ),
          Padding(
            padding: EdgeInsets.all(1),
            child: CircleAvatar(
              radius: 2,
              backgroundColor: Colors.black.withOpacity(0.2),
            ),
          )
        ],
      ),
    );
  }
}
