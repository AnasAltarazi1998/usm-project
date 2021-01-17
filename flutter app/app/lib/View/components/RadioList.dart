import 'package:flutter/material.dart';
import 'package:get/get.dart';
import 'package:usm_mobile/Controllers/SearchController.dart';

class RadioList extends StatefulWidget {
  @override
  _RadioListState createState() => _RadioListState();
}

// int val = 0;


SearchController searchController = Get.find();
class _RadioListState extends State<RadioList> {
  @override
  Widget build(BuildContext context) {
    return Container(
      margin: EdgeInsets.fromLTRB(0, 2, 0, 15),
      child: Row(
        mainAxisAlignment: MainAxisAlignment.spaceAround,
        children: [
          ActionChip(
              avatar: CircleAvatar(
                  backgroundColor: Color.fromARGB(255, 60, 59, 84),
                  child:
                      (searchController.user) ? Icon(Icons.check) : Icon(Icons.close)),
              label: Text(
                "User",
                style: TextStyle(
                  fontFamily: "Roboto",
                  fontSize: 16,
                ),
              ),
              onPressed: () {
                setState(() {
                  searchController.user = !searchController.user;
                });
              }),
          ActionChip(
              avatar: CircleAvatar(
                  backgroundColor: Color.fromARGB(255, 60, 59, 84),
                  child:
                      (searchController.board) ? Icon(Icons.check) : Icon(Icons.close)),
              label: Text(
                "Board",
                style: TextStyle(
                  fontFamily: "Roboto",
                  fontSize: 16,
                ),
              ),
              onPressed: () {
                setState(() {
                  searchController.board = !searchController.board;
                });
              }),
          ActionChip(
              avatar: CircleAvatar(
                  backgroundColor: Color.fromARGB(255, 60, 59, 84),
                  child: (searchController.community)
                      ? Icon(Icons.check)
                      : Icon(Icons.close)),
              label: Text(
                "Community",
                style: TextStyle(
                  fontFamily: "Roboto",
                  fontSize: 16,
                ),
              ),
              onPressed: () {
                setState(() {
                  searchController.community = !searchController.community;
                });
              }),
        ],
      ),
      // child: Column(children: [
      //   RadioListTile(
      //     title: Text(
      //       "User Name",
      //       style: TextStyle(
      //         //color: Colors.white,
      //         fontFamily: "Roboto",
      //         //fontSize: 16,
      //         //fontWeight: FontWeight.bold,
      //       ),
      //     ),
      //     value: 1,
      //     groupValue: val,
      //     onChanged: (newValue) {
      //       setState(() {
      //         val = newValue;
      //       });
      //     },
      //   ),
      //   RadioListTile(
      //     title: Text(
      //       "Board",
      //       style: TextStyle(
      //         //color: Colors.white,
      //         fontFamily: "Roboto",
      //         //fontSize: 16,
      //         //fontWeight: FontWeight.bold,
      //       ),
      //     ),
      //     value: 2,
      //     groupValue: val,
      //     onChanged: (newValue) {
      //       setState(() {
      //         val = newValue;
      //       });
      //     },
      //   ),
      //   RadioListTile(
      //     title: Text(
      //       "Community",
      //       style: TextStyle(
      //         //color: Colors.white,
      //         fontFamily: "Roboto",
      //         //fontSize: 16,
      //         //fontWeight: FontWeight.bold,
      //       ),
      //     ),
      //     value: 3,
      //     groupValue: val,
      //     onChanged: (newValue) {
      //       setState(() {
      //         val = newValue;
      //       });
      //     },
      //   ),
      // ]),
    );
  }
}
