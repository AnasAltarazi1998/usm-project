import 'package:flutter/material.dart';
import 'package:get/get.dart';

import '../pages/Search_Page.dart';
import '../pages/community_page.dart';
import '../pages/university_search.dart';

class Tiles extends StatefulWidget {
  final selected;

  const Tiles({Key key, @required this.selected}) : super(key: key);
  @override
  _TilesState createState() => _TilesState();
}

class _TilesState extends State<Tiles> {
  @override
  Widget build(BuildContext context) {
    double targetValue = 54;
    return Column(
      crossAxisAlignment: CrossAxisAlignment.center,
      mainAxisAlignment: MainAxisAlignment.start,
      children: [
        Container(
          width: Get.width,
          padding: EdgeInsets.only(top: 15),
          child: TweenAnimationBuilder(
            tween: Tween<double>(begin: 38, end: targetValue),
            duration: Duration(milliseconds: 150),
            builder: (BuildContext context, double size, Widget child) {
              return IconButton(
                iconSize: widget.selected == 1 ? size : 38,
                color: Colors.white,
                onPressed: () {
                  Get.off(Community_Page(),
                      transition: Transition.noTransition);
                },
                icon: child,
              );
            },
            child: Icon(Icons.home_outlined),
          ),
        ),
        Container(
          width: Get.width,
          padding: EdgeInsets.only(top: 15),
          child: TweenAnimationBuilder(
            tween: Tween<double>(begin: 38, end: targetValue),
            duration: Duration(milliseconds: 150),
            builder: (BuildContext context, double size, Widget child) {
              return IconButton(
                iconSize: widget.selected == 2 ? size : 38,
                color: Colors.white,
                onPressed: () {
                  Get.off(University_Search(),
                      transition: Transition.noTransition);
                },
                icon: child,
              );
            },
            child: Icon(Icons.equalizer),
          ),
        ),
        Container(
          width: Get.width,
          padding: EdgeInsets.only(top: 15),
          child: TweenAnimationBuilder(
            tween: Tween<double>(begin: 38, end: targetValue),
            duration: Duration(milliseconds: 150),
            builder: (BuildContext context, double size, Widget child) {
              return IconButton(
                iconSize: widget.selected == 3 ? size : 38,
                color: Colors.white,
                onPressed: () {},
                icon: child,
              );
            },
            child: Icon(Icons.perm_identity_outlined),
          ),
        ),
        Container(
          width: Get.width,
          padding: EdgeInsets.only(top: 15),
          child: TweenAnimationBuilder(
            tween: Tween<double>(begin: 38, end: targetValue),
            duration: Duration(milliseconds: 150),
            builder: (BuildContext context, double size, Widget child) {
              return IconButton(
                iconSize: widget.selected == 4 ? size : 38,
                color: Colors.white,
                onPressed: () {
                  Get.off(Search_Page(),
                      transition: Transition.noTransition);
                },
                icon: child,
              );
            },
            child: Icon(Icons.search),
          ),
        ),
        Container(
          width: Get.width,
          padding: EdgeInsets.only(top: 15),
          child: TweenAnimationBuilder(
            tween: Tween<double>(begin: 38, end: targetValue),
            duration: Duration(milliseconds: 150),
            builder: (BuildContext context, double size, Widget child) {
              return IconButton(
                iconSize: widget.selected == 5 ? size : 38,
                color: Colors.white,
                onPressed: () {},
                icon: child,
              );
            },
            child: Icon(Icons.settings),
          ),
        ),
        Container(
          width: Get.width,
          padding: EdgeInsets.only(top: 15),
          child: TweenAnimationBuilder(
            tween: Tween<double>(begin: 38, end: targetValue),
            duration: Duration(milliseconds: 150),
            builder: (BuildContext context, double size, Widget child) {
              return IconButton(
                iconSize: widget.selected == 6 ? size : 38,
                color: Colors.white,
                onPressed: () {},
                icon: child,
              );
            },
            child: Icon(Icons.logout),
          ),
        ),
      ],
    );
  }
}
