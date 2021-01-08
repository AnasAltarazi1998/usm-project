import 'package:flutter/material.dart';
import 'package:get/get.dart';
import 'package:usm_mobile/View/components/LoginForm.dart';
import 'package:usm_mobile/View/components/RegisterForm.dart';

class Login extends StatefulWidget {
  Login({Key key}) : super(key: key);

  @override
  _LoginState createState() => _LoginState();
}

class _LoginState extends State<Login> {
  List<bool> isSelected;
  bool pressed = true;
  bool pressed2 = false;
  TextDecoration hide;
  TextDecoration hide1;

  @override
  void initState() {
    isSelected = [true, false];
    super.initState();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: SingleChildScrollView(
        child: Container(
          height: Get.height,
          decoration: BoxDecoration(
            image: DecorationImage(
                image: AssetImage('assets/images/login_background.jpg'),
                fit: BoxFit.cover),
          ),
          child: Center(
            child: Container(
              // width: Get.width * 0.8,
              //height: Get.height,
              margin: EdgeInsets.symmetric(
                  vertical: Get.height * 0.15, horizontal: Get.width * 0.12),
              color: Colors.black.withOpacity(0.65),
              child: Column(
                crossAxisAlignment: CrossAxisAlignment.center,
                mainAxisAlignment: MainAxisAlignment.start,
                children: [
                  Row(children: [
                    ToggleButtons(
                      fillColor: Colors.white.withOpacity(0),
                      renderBorder: false,
                      children: [
                        Padding(
                          padding: const EdgeInsets.all(8.0),
                          child: Text(
                            'SIGN IN',
                            style: TextStyle(
                                color: Color(0xff836FA9),
                                fontSize: 18,
                                decoration: hide ?? null),
                          ),
                        ),
                        Padding(
                          padding: const EdgeInsets.all(8.0),
                          child: Text(
                            'SIGN UP',
                            style: TextStyle(
                                color: Color(0xff836FA9),
                                fontSize: 18,
                                decoration: hide1 ?? null),
                          ),
                        ),
                      ],
                      onPressed: (int index) {
                        setState(() {
                          for (int i = 0; i < isSelected.length; i++) {
                            isSelected[i] = i == index;
                          }
                          if (index == 0) {
                            hide = TextDecoration.underline;
                            hide1 = null;
                            pressed = true;
                            pressed2 = false;
                          } else {
                            hide1 = TextDecoration.underline;
                            hide = null;
                            pressed = false;
                            pressed2 = true;
                          }
                        });
                      },
                      isSelected: isSelected,
                    )
                  ]),
                  Column(
                    mainAxisAlignment: MainAxisAlignment.center,
                    crossAxisAlignment: CrossAxisAlignment.center,
                    children: [
                      pressed ? LoginForm() : SizedBox(),
                      pressed2 ? RegisterForm() : SizedBox(),
                    ],
                  )
                ],
              ),
            ),
          ),
        ),
      ),
    );
  }
}
