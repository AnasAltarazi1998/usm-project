import 'package:flutter/material.dart';
import 'package:get/get.dart';
import 'package:usm_mobile/Models/user_model.dart';

class Textfield_Builder extends StatefulWidget {
  final String label;
  final Color color;
  final bool hidetext;
  final String tag;
  const Textfield_Builder(
      {Key key, this.label, this.color, this.hidetext, this.tag})
      : super(key: key);

  @override
  _Textfield_BuilderState createState() => _Textfield_BuilderState(tag: tag);
}

class _Textfield_BuilderState extends State<Textfield_Builder> {
  final String tag;
  _Textfield_BuilderState({this.tag});
  @override
  Widget build(BuildContext context) {
    return Container(
      child: TextFormField(
          onSaved: (o) {
            UserModel u = Get.find(tag: 'userModelFromLoginForm');
            tag == 'email' ? u.email = o : u.password = o;
            Get.put(u, tag: 'userModelFromLoginForm');
          },
          // validator: widget.validator,
          // onSaved: widget.onSaved,
          style: TextStyle(color: Colors.white),
          keyboardType: TextInputType.emailAddress,
          obscureText: widget.hidetext ?? false,
          decoration: InputDecoration(
              labelText: widget.label ?? 'default',
              labelStyle: TextStyle(
                color: Colors.white,
                fontSize: 18,
              ),
              enabledBorder: UnderlineInputBorder(
                  borderSide: BorderSide(color: Colors.white)))),
    );
  }
}
