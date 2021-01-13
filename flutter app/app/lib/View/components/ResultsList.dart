import 'package:flutter/material.dart';
import 'package:get/get.dart';
import 'package:usm_mobile/Controllers/BoardController.dart';

class ResultsList extends StatelessWidget {
  BoardController boardController = Get.find(tag: 'boardController');
  List<String> mylist = [
    "r1",
    "r2",
    "r3",
    "r4",
    "r5",
    "r6",
    "r7",
    "r8",
    "r9",
    "r10"
  ];

  @override
  Widget build(BuildContext context) {
    return GetBuilder<BoardController>(
      builder: (_) {
        int size = boardController.search_result.length;
        return ListView.builder(
          shrinkWrap: true,
          scrollDirection: Axis.vertical,
          itemCount: size,
          physics: NeverScrollableScrollPhysics(),
          itemBuilder: (BuildContext context, int index) {
            return Text("${boardController.search_result[index].name}");
            // return Container(
            //   decoration: BoxDecoration(
            //       border: Border.all(
            //         color: Color(0xAA707070),
            //         width: 1,
            //       ),
            //       borderRadius: BorderRadius.all(
            //         Radius.circular(
            //           20.0,
            //         ),
            //       )),
            //   child: ListTile(
            //     title: Center(
            //       child: Text(
            //         "${boardController.search_result[index].name}",
            //         style: TextStyle(
            //           //color: Colors.white,
            //           fontFamily: "Roboto",
            //           //fontSize: 16,
            //           //fontWeight: FontWeight.bold,
            //         ),
            //       ),
            //     ),
            //   ),
            // );
          },
        );
      },
    );
    // return ListView.builder(
    //   shrinkWrap: true,
    //   physics: NeverScrollableScrollPhysics(),
    //   //primary: false,
    //   scrollDirection: Axis.vertical,
    //   itemCount: mylist.length,
    //   itemBuilder: (BuildContext context, int index) {
    //     return Container(
    //       decoration: BoxDecoration(
    //           border: Border.all(
    //             color: Color(0xAA707070),
    //             width: 1,
    //           ),
    //           borderRadius: BorderRadius.all(
    //             Radius.circular(
    //               20.0,
    //             ),
    //           )),
    //       child: ListTile(
    //         title: Center(
    //           child: Text(
    //             "${mylist[index]}",
    //             style: TextStyle(
    //               //color: Colors.white,
    //               fontFamily: "Roboto",
    //               //fontSize: 16,
    //               //fontWeight: FontWeight.bold,
    //             ),
    //           ),
    //         ),
    //       ),
    //     );
    //   },
    // );
  }
}
