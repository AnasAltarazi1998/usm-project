import 'package:flutter/material.dart';

class RadioList extends StatefulWidget {
  @override
  _RadioListState createState() => _RadioListState();
}

int val = 0;

class _RadioListState extends State<RadioList> {
  @override
  Widget build(BuildContext context) {
    return Container(
      child: Column(children: [
        RadioListTile(
          title: Text(
            "User Name",
            style: TextStyle(
              //color: Colors.white,
              fontFamily: "Roboto",
              //fontSize: 16,
              //fontWeight: FontWeight.bold,
            ),
          ),
          value: 1,
          groupValue: val,
          onChanged: (newValue) {
            setState(() {
              val = newValue;
            });
          },
        ),
        RadioListTile(
          title: Text(
            "Board",
            style: TextStyle(
              //color: Colors.white,
              fontFamily: "Roboto",
              //fontSize: 16,
              //fontWeight: FontWeight.bold,
            ),
          ),
          value: 2,
          groupValue: val,
          onChanged: (newValue) {
            setState(() {
              val = newValue;
            });
          },
        ),
        RadioListTile(
          title: Text(
            "Community",
            style: TextStyle(
              //color: Colors.white,
              fontFamily: "Roboto",
              //fontSize: 16,
              //fontWeight: FontWeight.bold,
            ),
          ),
          value: 3,
          groupValue: val,
          onChanged: (newValue) {
            setState(() {
              val = newValue;
            });
          },
        ),
      ]),
    );
  }
}
