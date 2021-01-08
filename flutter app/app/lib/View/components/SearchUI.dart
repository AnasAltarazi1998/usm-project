import 'package:flutter/material.dart';
import 'SearchField.dart';
import 'RadioList.dart';
import 'ResultsList.dart';

class SearchUI extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return SingleChildScrollView(
      child: Column(
        mainAxisAlignment: MainAxisAlignment.start,
        children: [
          SearchField(),
          RadioList(),
          Text(
            "RESULTS",
            style: TextStyle(
                //color: Colors.white,
                fontFamily: "Roboto",
                //fontSize: 16,
                fontWeight: FontWeight.bold),
          ),
          Padding(
            padding: const EdgeInsets.all(10),
            child: ResultsList(),
          ),
        ],
      ),
    );
  }
}
