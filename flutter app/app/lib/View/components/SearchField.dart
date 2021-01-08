import 'package:flutter/material.dart';

class SearchField extends StatelessWidget {
  const SearchField({Key key}) : super(key: key);

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
                child: TextField(
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
          ],
        ),
      ),
    );
  }
}
