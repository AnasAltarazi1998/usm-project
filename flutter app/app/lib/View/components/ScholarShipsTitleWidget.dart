import 'package:flutter/material.dart';
//import 'package:get/get.dart';

class ScholarShipsTitle extends StatelessWidget {
  const ScholarShipsTitle({Key key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Container(
      margin: const EdgeInsets.all(8.0),
      child: Stack(
        alignment: AlignmentDirectional.center,
        children: <Widget>[
          // Stroked text as border.
          Text(
            'ScholarShips',
            style: TextStyle(
              fontFamily: "Roboto",
              fontWeight: FontWeight.bold,
              fontStyle: FontStyle.italic,
              fontSize: 22,
              foreground: Paint()
                ..style = PaintingStyle.stroke
                ..strokeWidth = 1.2
                ..color = Color(0xAA836FA9),
            ),
          ),
          // Solid text as fill.
          RichText(
            text: TextSpan(
              text: 'Scholar',
              style: TextStyle(
                  fontFamily: "Roboto",
                  fontSize: 20,
                  fontStyle: FontStyle.italic,
                  color: Colors.black),
              children: <TextSpan>[
                TextSpan(
                    text: 'Ships',
                    style: TextStyle(
                      color: Color(0xAAB39DD8),
                      //fontWeight: FontWeight.bold,
                    )),
              ],
            ),
          ),
          // Container(
          //   width: Get.width*0.3,
          //   alignment: AlignmentDirectional.center,
          //   child: Row(
          //     // mainAxisAlignment: MainAxisAlignment.center,
          //     children: [
          //       Text(
          //         'Scholar',
          //         style: TextStyle(
          //             fontSize: 20,
          //             fontStyle: FontStyle.italic,
          //             color: Colors.black),
          //       ),
          //       Text(
          //         'Ships',
          //         style: TextStyle(
          //           color: Color(0xAAB39DD8),
          //           fontWeight: FontWeight.bold,
          //           fontSize: 20,
          //         ),
          //       ),
          //     ],
          //   ),
          // )
        ],
      ),
    );
  }
}
