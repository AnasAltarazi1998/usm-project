import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:flutter_datetime_picker/flutter_datetime_picker.dart';
import 'package:get/get.dart';
import 'package:usm_mobile/View/components/Textfield_Builder.dart';

class RegisterForm extends StatefulWidget {
  RegisterForm({Key key}) : super(key: key);

  @override
  _RegisterFormState createState() => _RegisterFormState();
}

class _RegisterFormState extends State<RegisterForm> {
  DateTime selectedDate = DateTime.now();
  var date1 = "Birth Date";
  var reg = "Registration Year";
  @override
  Widget build(BuildContext context) {
    return Form(
        child: Container(
      // height: Get.height,
      padding: EdgeInsets.symmetric(
        horizontal: 50,
      ),
      child: Column(
        children: [
          Textfield_Builder(
            label: 'User Name',
          ),
          Textfield_Builder(
            label: 'Email ID',
          ),
          Textfield_Builder(
            label: 'Password',
            hidetext: true,
          ),
          Textfield_Builder(
            label: 'Specialization',
          ),
          FlatButton(
            minWidth: Get.width,
            child: Container(
              width: Get.width,
              padding: EdgeInsets.symmetric(vertical: 20),
              decoration: BoxDecoration(
                border: Border(
                  bottom: BorderSide(
                    color: Colors.white,
                  ),
                ),
              ),
              child: Text(
                "$date1",
                style: TextStyle(
                  color: Colors.white,
                  fontSize: 16,
                ),
              ),
            ),
            onPressed: () {
              DatePicker.showDatePicker(context,
                  showTitleActions: true,
                  minTime: DateTime(1930, 1, 1),
                  maxTime: DateTime.now(), onChanged: (date) {
                setState(() {
                  date1 = date.day.toString() +
                      "/" +
                      date.month.toString() +
                      "/" +
                      date.year.toString();
                });
                print('change $date');
              }, onConfirm: (date) {
                print('confirm $date');
              }, currentTime: DateTime.now(), locale: LocaleType.en);
            },
          ),
          FlatButton(
            minWidth: Get.width,
            child: Container(
              width: Get.width,
              padding: EdgeInsets.symmetric(vertical: 20),
              decoration: BoxDecoration(
                border: Border(
                  bottom: BorderSide(
                    color: Colors.white,
                  ),
                ),
              ),
              child: Text(
                "$reg",
                style: TextStyle(
                  color: Colors.white,
                  fontSize: 16,
                ),
              ),
            ),
            onPressed: () {
              DatePicker.showDatePicker(context,
                  showTitleActions: true,
                  minTime: DateTime(1970, 1, 1),
                  maxTime: DateTime.now(), onChanged: (date) {
                setState(() {
                  reg = date.day.toString() +
                      "/" +
                      date.month.toString() +
                      "/" +
                      date.year.toString();
                });
                print('change $date');
              }, onConfirm: (date) {
                print('confirm $date');
              }, currentTime: DateTime.now(), locale: LocaleType.en);
            },
          ),
          Padding(
            padding: EdgeInsets.only(top: Get.height * 0.06),
            child: FlatButton(
              onPressed: () => {},
              height: 30,
              minWidth: 1,
              shape: RoundedRectangleBorder(
                  borderRadius: BorderRadius.circular(50)),
              child: Padding(
                padding: const EdgeInsets.all(8.0),
                child: Text(
                  'SIGN UP',
                  style: TextStyle(color: Colors.white, fontSize: 16),
                ),
              ),
              color: Color(0xff836FA9),
            ),
          ),
        ],
      ),
    ));
  }
}
