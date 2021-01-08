import 'package:flutter/material.dart';

class University extends StatefulWidget {
  University({Key key}) : super(key: key);

  @override
  _UniversityState createState() => _UniversityState();
}

class _UniversityState extends State<University> {
  @override
  Widget build(BuildContext context) {
    return FlatButton(
      onPressed: () {},
      child: Container(
        padding: EdgeInsets.only(bottom: 10, top: 10),
        child: Row(
          // mainAxisAlignment: MainAxisAlignment.spaceAround,
          crossAxisAlignment: CrossAxisAlignment.center,
          children: <Widget>[
            new Container(
              width: 60,
              height: 60,
              child: CircleAvatar(
                radius: 40,
                backgroundImage: AssetImage('assets/images/damascus_logo.jpg'),
              ),
            ),
            Container(
              child: Text(
                "Damascus University",
                style: TextStyle(fontWeight: FontWeight.bold, fontSize: 18),
              ),
            ),
          ],
        ),
      ),
    );
  }
}
