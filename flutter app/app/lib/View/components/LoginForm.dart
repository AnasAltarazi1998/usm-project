import 'package:flutter/material.dart';
import 'package:get/get.dart';
import 'package:usm_mobile/Controllers/UserController.dart';
import 'package:usm_mobile/Models/user_model.dart';
import 'package:usm_mobile/View/components/Textfield_Builder.dart';
import 'package:usm_mobile/View/pages/interface_pro.dart';

class LoginForm extends StatefulWidget {
  LoginForm({Key key}) : super(key: key);

  @override
  _LoginFormState createState() => _LoginFormState();
}

class _LoginFormState extends State<LoginForm> {
  GlobalKey<FormState> key;
  UserModel userModel = Get.put(UserModel(), tag: 'userModelFromLoginForm');
  UserController userController =
      Get.put(UserController(), tag: 'userController');
  @override
  void initState() {
    // TODO: implement initState
    key = GlobalKey<FormState>();
    super.initState();
  }

  void setSignInAction() async {
    if (key.currentState.validate()) {
      key.currentState.save();
      UserModel u = Get.find(tag: 'userModelFromLoginForm');
      bool state = await userController.signinControl(u.email, u.password);
      if (state == true)
        Get.off(InterFacePro(selected: 3));
      else {
        UserController uc = Get.find(tag: 'userController');
        Get.snackbar('Error', uc.userinfo.name ?? 'something went wrong');
      }
    }
  }

  @override
  Widget build(BuildContext context) {
    return Form(
      key: key,
      child: Container(
        // height: MediaQuery.of(context).size.height,
        padding: EdgeInsets.symmetric(horizontal: 50),
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          crossAxisAlignment: CrossAxisAlignment.center,
          children: [
            SizedBox(
              height: MediaQuery.of(context).size.height * 0.13,
            ),
            Textfield_Builder(
              label: 'Email',
              tag: 'email',
            ),
            Textfield_Builder(
              label: 'Password',
              hidetext: true,
              tag: 'password',
            ),
            Padding(
              padding: EdgeInsets.only(top: Get.height * 0.06),
              child: FlatButton(
                onPressed: () => {setSignInAction()},
                height: 30,
                minWidth: 1,
                shape: RoundedRectangleBorder(
                    borderRadius: BorderRadius.circular(50)),
                child: Padding(
                  padding: const EdgeInsets.all(8.0),
                  child: Text(
                    'SIGN IN',
                    style: TextStyle(color: Colors.white, fontSize: 16),
                  ),
                ),
                color: Color(0xff836FA9),
              ),
            )
          ],
        ),
      ),
    );
  }
}
