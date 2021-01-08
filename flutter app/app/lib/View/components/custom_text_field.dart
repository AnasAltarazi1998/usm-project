import 'package:flutter/material.dart';

class CustomTextField extends StatelessWidget {
  String hintText;
  String labelText;
  CustomTextField({
    this.hintText,
    this.labelText,
    Key key,
  }) : super(key: key);

  @override
  Widget build(BuildContext context) {
    final mq = MediaQuery.of(context);

    return SingleChildScrollView(
      child: Column(
        children: [
          Container(
            height: mq.size.height * 0.037,
            child: TextField(
              decoration: InputDecoration(
                hintText: hintText,
                labelText: labelText,
                labelStyle: TextStyle(
                    fontSize: 8,
                    color: Colors.white,
                    fontWeight: FontWeight.bold),
                hintStyle: TextStyle(
                    fontSize: 10,
                    fontWeight: FontWeight.bold,
                    color: new Color(0XFF2F2939)),
                focusedBorder: OutlineInputBorder(
                  borderRadius: BorderRadius.circular(5),
                  borderSide: BorderSide(
                    color: Color(0XFF9f8ac5),
                    width: 1,
                  ),
                ),
                border: OutlineInputBorder(
                  borderRadius: BorderRadius.circular(5),
                  borderSide: new BorderSide(
                      color: Color(0XFF9f8ac5).withOpacity(0.9), width: 1),
                ),
                suffixIcon: IconButton(
                  padding: EdgeInsets.only(left: 5.5),
                  icon: Icon(
                    Icons.settings,
                    size: 15,
                    color: Colors.black54,
                  ),
                  onPressed: () {},
                ),
              ),
            ),
          ),
        ],
      ),
    );
  }
}
