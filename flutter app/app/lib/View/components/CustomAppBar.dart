import 'package:flutter/material.dart';

class CustomAppBar extends StatefulWidget implements PreferredSizeWidget {
  CustomAppBar({Key key})
      : preferredSize = Size.fromHeight(60),
        super(key: key);

  @override
  final Size preferredSize; // default is 56.0

  @override
  _CustomAppBarState createState() => _CustomAppBarState();
}

class _CustomAppBarState extends State<CustomAppBar> {
  @override
  Widget build(BuildContext context) {
    return AppBar(
      backgroundColor: Colors.white,
      title: Row(
        mainAxisAlignment: MainAxisAlignment.spaceBetween,
        children: [
          Row(
            children: [
              IconButton(
                icon: Icon(
                  Icons.keyboard_backspace,
                  color: Color(0XAABCBCCB),
                ),
                onPressed: () => {},
              )
            ],
          ),
          Row(
            // mainAxisAlignment: MainAxisAlignment.end,
            children: [
              Container(
                height: 15,
                child: VerticalDivider(
                  // width: 20,
                  thickness: 1,
                ),
              ),
              Container(
                padding: EdgeInsets.only(right: 5),
                child: Text(
                  'Katia Al-Ghazi',
                  style: TextStyle(
                    color: Color(0xAA4D4F5C),
                    fontSize: 10,
                  ),
                ),
              ),
              CircleAvatar(
                backgroundImage: AssetImage(
                  'assets/images/2.png',
                ),
              ),
            ],
          ),
        ],
      ),
    );
  }
}
