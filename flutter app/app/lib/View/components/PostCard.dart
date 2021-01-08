import 'package:flutter/material.dart';
import 'package:get/get.dart';
import 'package:usm_mobile/Models/PostModel.dart';

class PostCard extends StatelessWidget {
  final Post post;
  PostCard({Key key, this.post}) : super(key: key);
  @override
  Widget build(BuildContext context) {
    return Container(
      width: Get.width * 0.75,
      height: Get.height * 0.3,
      child: Card(
        child: Stack(
          children: [
            Column(
              mainAxisAlignment: MainAxisAlignment.spaceBetween,
              children: [
                Column(
                  children: [
                    Container(
                      height: Get.height * 0.15,
                      width: Get.width * 0.75,
                      child: Image.asset(
                        'assets/images/Univ.jpg',
                        fit: BoxFit.cover,
                      ),
                    ),
                    Padding(
                      padding: EdgeInsets.only(
                        left: 10,
                        top: 10,
                      ),
                      child: Row(
                        children: [
                          Text(
                            this.post.title != ''
                                ? this.post.title
                                : 'Default Title',
                            style: TextStyle(
                              color: Color(0xAAB39DD8),
                              fontSize: 14,
                              fontFamily: 'Roboto',
                              fontWeight: FontWeight.bold,
                            ),
                          ),
                        ],
                      ),
                    ),
                    Padding(
                      padding: EdgeInsets.only(left: 10, right: 10),
                      child: Row(
                        children: [
                          Flexible(
                            child: Text(
                              this.post.description != ''
                                  ? this.post.description
                                  : 'Default Description',
                              style: TextStyle(
                                color: Color(0xAA616161),
                                fontSize: 12,
                                fontFamily: 'Roboto',
                              ),
                            ),
                          )
                        ],
                      ),
                    ),
                  ],
                ),
                Padding(
                  padding: EdgeInsets.all(10),
                  child: Row(
                    mainAxisAlignment: MainAxisAlignment.spaceBetween,
                    children: [
                      Text(
                        '5 min ago',
                        style: TextStyle(fontSize: 10),
                      ),
                      Text(
                        (this.post.likes != 0
                                ? '${this.post.likes} likes '
                                : '') +
                            (this.post.comments != 0
                                ? '${this.post.comments} comments'
                                : ''),
                        style: TextStyle(fontSize: 10),
                      ),
                    ],
                  ),
                ),
              ],
            ),
            Positioned(
              right: 0,
              top: Get.height * 0.125,
              child: CircleAvatar(
                radius: 22,
                backgroundColor: Colors.white,
                child: CircleAvatar(
                  radius: 20,
                  backgroundImage: AssetImage('assets/images/2.png'),
                ),
              ),
            ),
          ],
        ),
      ),
    );
  }
}
