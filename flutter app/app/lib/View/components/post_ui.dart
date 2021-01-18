import 'package:flutter/material.dart';
import 'package:usm_mobile/Models/PostModel.dart';
import 'package:usm_mobile/View/components/CommunityPostList.dart';
import 'package:usm_mobile/View/components/CustomAppBar.dart';

class Post_ui extends StatelessWidget {
  List<Post> firstList = [
    Post(
      id: 1,
      title: 'Title',
      description: 'Test',
      likes: 10,
      comments: 10,
    ),
    Post(
      id: 1,
      title: 'Title',
      description: 'Test',
    ),
    Post(
      id: 1,
      title: 'Title',
      description: 'Test',
    ),
    Post(
      id: 1,
      title: 'Title',
      description: 'Test',
    ),
    Post(
      id: 1,
      title: 'Title',
      description: 'Test',
      likes: 10,
    ),
  ];

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return  CommunityPostsBuilder(firstList: firstList);
  }
}
