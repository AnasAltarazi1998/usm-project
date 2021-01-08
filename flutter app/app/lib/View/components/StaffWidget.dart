import 'package:flutter/material.dart';
import 'package:usm_mobile/Models/profs_model.dart';

import 'CardProfsWidget.dart';

class Staff extends StatelessWidget {
  List<Profs> profs;
  Staff({Key key, this.profs}) : super(key: key);
  @override
  Widget build(BuildContext context) {
    Profs emptyProfe = Profs(image: "", name: "", spec: "");
    Tween<double> _scaletween = Tween<double>(begin: 0, end: 10);
    return Center(
      child: Stack(
        overflow: Overflow.visible,
        children: [
          //Center
          Container(
            padding: EdgeInsets.fromLTRB(0, 130, 0, 135),
            alignment: Alignment.center,
            child: StaffText(),
            width: 90,
          ),

          //2
          TweenAnimationBuilder(
              tween: _scaletween,
              curve: Curves.bounceOut,
              duration: Duration(milliseconds: 1600),
              child: CardPro(
                profs: (profs.length > 1) ? profs[1] : emptyProfe,
              ),
              builder: (context, scale, child) {
                return Transform.translate(
                    offset: Offset(7.6 * scale, 7 * scale), child: child);
              }),

          TweenAnimationBuilder(
              tween: _scaletween,
              curve: Curves.bounceOut,
              duration: Duration(milliseconds: 1600),
              child: CardPro(
                profs: (profs.length > 2) ? profs[2] : emptyProfe,
              ),
              builder: (context, scale, child) {
                return Transform.translate(
                    offset: Offset(-7.6 * scale, 7 * scale), child: child);
              }),

          //1
          TweenAnimationBuilder(
              tween: _scaletween,
              curve: Curves.bounceOut,
              duration: Duration(milliseconds: 1500),
              child: CardPro(
                profs: profs[0],
              ),
              builder: (context, scale, child) {
                return Transform.translate(offset: Offset(0, 0), child: child);
              }),

          //3
          TweenAnimationBuilder(
              tween: _scaletween,
              curve: Curves.bounceOut,
              duration: Duration(milliseconds: 1700),
              child: CardPro(
                profs: (profs.length > 3) ? profs[3] : emptyProfe,
              ),
              builder: (context, scale, child) {
                return Transform.translate(
                    offset: Offset(-4 * scale, 16 * scale), child: child);
              }),

          TweenAnimationBuilder(
              tween: _scaletween,
              curve: Curves.bounceOut,
              duration: Duration(milliseconds: 1700),
              child: CardPro(
                profs: (profs.length > 4) ? profs[4] : emptyProfe,
              ),
              builder: (context, scale, child) {
                return Transform.translate(
                    offset: Offset(4 * scale, 16 * scale), child: child);
              }),
        ],
      ),
    );
  }
}

class StaffText extends StatelessWidget {
  const StaffText({Key key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Container(
      child: Container(
        decoration: BoxDecoration(
          boxShadow: [
            BoxShadow(
              color: Color(0xAA1D17BC),
              offset: Offset(0, 2),
              blurRadius: 23,
              spreadRadius: 1,
            )
          ],
        ),
        child: Stack(
          children: <Widget>[
            // Stroked text as border.
            Text(
              'STAFF TEAM ',
              style: TextStyle(
                fontFamily: "Roboto",
                fontWeight: FontWeight.bold,
                fontSize: 11,
                foreground: Paint()
                  ..style = PaintingStyle.stroke
                  ..strokeWidth = 1
                  ..color = Color(0xAA707070),
              ),
            ),
            // Solid text as fill.
            Text(
              'STAFF TEAM ',
              style: TextStyle(
                fontFamily: "Roboto",
                fontSize: 11,
                color: Color(0xAAB39DD8),
              ),
            ),
          ],
        ),
      ),
    );
  }
}
