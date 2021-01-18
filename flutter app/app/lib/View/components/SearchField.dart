import 'package:flutter/material.dart';
import 'package:get/get.dart';
import 'package:usm_mobile/Controllers/BoardController.dart';
import 'package:usm_mobile/Controllers/SearchController.dart';
import 'package:usm_mobile/Models/BoardModel.dart';
import 'package:usm_mobile/Repositories/BoardRepo.dart';

class SearchField extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Container(
      decoration: BoxDecoration(
        border: Border.all(
          color: Color(0xAA707070),
          width: 1,
        ),
      ),
      child: Padding(
        padding: const EdgeInsets.all(1.6),
        child: Row(
          children: [
            Container(
              child: Icon(
                Icons.search,
                //size: 20,
              ),
            ),
            Container(
              height: 20,
              child: VerticalDivider(
                // width: 20,
                thickness: 2,
              ),
            ),
            Container(
              child: Flexible(
                child: GetBuilder<SearchController>(
                  // specify type as Controller
                  init: SearchController(), // intialize with the Controller
                  builder: (val) => TextField(
                    onSubmitted: (value) {
                      print('click');
                      val.searchControl(value);
                    },
                    decoration: InputDecoration(
                      //prefixIcon: Icon(Icons.search),
                      hintText: 'What you looking for?',
                      hintStyle: TextStyle(
                        //color: Colors.white,
                        fontFamily: "Roboto",
                        //fontSize: 15,
                        //fontWeight: FontWeight.bold,
                      ),
                      border: InputBorder.none,
                    ),
                  ),
                ),
              ),
            ),
          ],
        ),
      ),
    );
  }
}
