import 'package:flutter/material.dart';
import 'package:get/get.dart';
import 'SearchField.dart';
import 'RadioList.dart';
import 'ResultsList.dart';

class SearchUI extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Container(
      height: Get.size.height,
      child: Column(
        mainAxisAlignment: MainAxisAlignment.start,
        children: [
          SearchField(),
          RadioList(),
          Text(
            "RESULTS\n",
            style: TextStyle(
                //color: Colors.white,
                fontFamily: "Roboto",
                //fontSize: 16,
                fontWeight: FontWeight.bold),
          ),
          Expanded(
            
            child: ResultsList(),
          ),
        ],
      ),
    );
  }
}
