import 'package:flutter/material.dart';
import 'package:usm_mobile/Models/BoardModel.dart';
import 'package:usm_mobile/View/components/BoardImageWidget.dart';
import 'package:usm_mobile/View/components/BoardTitleWidget.dart';
import 'package:usm_mobile/View/components/DescriptionWidget.dart';
import 'package:usm_mobile/View/components/MyDividerWidget.dart';
import 'package:usm_mobile/View/components/ScholarShipsCardWidget.dart';
import 'package:usm_mobile/View/components/ScholarShipsTitleWidget.dart';
import 'package:usm_mobile/View/components/StaffWidget.dart';

class MyBoardPage extends StatelessWidget {
  BoardModel board;
  MyBoardPage(this.board);

  @override
  Widget build(BuildContext context) {
    return ListView(
      children: [
        BoardTitle(name: board.name),
        BoardImage(imgUrl: board.image),
        Description(description: board.description),
        (board.profs == null) ? Container() : MyDivider(),
        (board.profs == null)
            ? Container()
            : Align(
                alignment: Alignment.center,
                child: Staff(profs: board.profs),
              ),
        (board.scholarship == null) ? Container() : MyDivider(),
        (board.scholarship == null) ? Container() : ScholarShipsTitle(),
        (board.scholarship == null)
            ? Container()
            : Column(
                children: board.scholarship.map((e) {
                  return ScholarShipsCard(
                    img: "assets/images/logo.png",
                    title: e.title,
                    description: e.attach,
                  );
                }).toList(),
              ),
      ],
    );
  }
}
