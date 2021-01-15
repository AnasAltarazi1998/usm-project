import 'package:flutter/material.dart';
import 'package:get/get.dart';
import 'package:usm_mobile/Models/PostModel.dart';
import 'PostCardsListView.dart';

class CommunityPostsBuilder extends StatelessWidget {
  const CommunityPostsBuilder({
    Key key,
    @required this.firstList,
  }) : super(key: key);

  final List<Post> firstList;

  @override
  Widget build(BuildContext context) {
    return SingleChildScrollView(
      child: Column(
        children: [
          PostCardsListView(
            mainList: this.firstList,
          ),
          Container(
            padding: EdgeInsets.only(
                top: 30,
                bottom: 10,
                left: Get.height * 0.1,
                right: Get.height * 0.1),
            child: Divider(
              color: Color(0xAAB39DD8),
              thickness: 5,
            ),
          ),
          Container(
            padding: EdgeInsets.only(bottom: 30),
            child: Text(
              'COMMUNITY POSTS',
              style: TextStyle(
                fontSize: 22,
                color: Color(0xAA616161),
              ),
            ),
          ),
          PostCardsListView(mainList: this.firstList),
        ],
      ),
    );
  }
}
