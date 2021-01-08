import 'package:flutter/material.dart';
import 'package:get/get.dart';

class BoardTitle extends StatelessWidget {
  String name;
  BoardTitle({Key key, this.name}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.all(5.0),
      child: Card(
        shape: RoundedRectangleBorder(
            borderRadius: BorderRadius.all(Radius.circular(100)),
            side: BorderSide(color: Color(0xAA707070))),
        color: Color.fromARGB(255, 67, 66, 93),
        child: Padding(
          padding: const EdgeInsets.fromLTRB(4, 1, 4, 1),
          child: Row(
            mainAxisAlignment: MainAxisAlignment.spaceBetween,
            children: [
              Padding(
                padding: const EdgeInsets.fromLTRB(8, 1, 8, 1),
                child: CircleAvatar(
                  radius: 26,
                  backgroundImage: AssetImage(
                    "assets/images/logo.png",
                  ),
                ),
              ),
              Text(
                name,
                style: TextStyle(
                  fontFamily: "Roboto",
                  fontSize: 25,
                  color: Color(0xAAE7E7EA),
                  fontWeight: FontWeight.bold,
                ),
              ),
              Padding(
                padding: const EdgeInsets.fromLTRB(8, 1, 8, 1),
                child: CircleAvatar(
                  radius: 26,
                  backgroundImage: AssetImage(
                    "assets/images/logo.png",
                  ),
                ),
              ),
            ],
          ),
        ),
      ),
    );
  }
}
