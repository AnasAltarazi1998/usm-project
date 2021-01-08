import 'package:flutter/material.dart';
import 'package:get/get.dart';
import 'package:usm_mobile/View/components/CustomAppBar.dart';
import 'package:usm_mobile/View/components/side_bar.dart';
import 'package:usm_mobile/View/components/university.dart';

class University_Search extends StatefulWidget {
  University_Search({Key key}) : super(key: key);

  @override
  _University_SearchState createState() => _University_SearchState();
}

// ignore: camel_case_types
class _University_SearchState extends State<University_Search> {
  List<University> universityList = [University(), University(), University()];
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: CustomAppBar(),
      body: SingleChildScrollView(
        child: Row(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            new Side_bar(selected: 2),
            Container(
              width: Get.width * 0.8,
              padding: EdgeInsets.only(top: 30),
              child: Column(
                  crossAxisAlignment: CrossAxisAlignment.center,
                  mainAxisAlignment: MainAxisAlignment.center,
                  children: universityList),
            ),
          ],
        ),
      ),
    );
  }
}
