import 'package:flutter/material.dart';
import 'package:get/get.dart';

class Description extends StatelessWidget {
  String description;
  Description({@required this.description, Key key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Container(
      margin: const EdgeInsets.symmetric(horizontal: 8),
      child: Card(
        shape: RoundedRectangleBorder(
          side: BorderSide(color: Color(0xAA707070)),
          borderRadius: BorderRadius.all(Radius.circular(50)),
        ),
        color: Color(0x85B39DDB),
        child: Padding(
          padding: const EdgeInsets.all(16),
          child: Center(
            child: Text(
              description,
              textAlign: TextAlign.center,
              style: TextStyle(
                  fontFamily: "Roboto",
                  color: Colors.black,
                  fontSize: 8.5,
                  fontStyle: FontStyle.italic),
            ),
          ),
        ),
      ),
    );
  }
}
