import 'package:flutter/material.dart';
import 'package:get/get.dart';
import 'package:usm_mobile/Models/BoardModel.dart';
import 'package:usm_mobile/Models/profs_model.dart';
import 'package:usm_mobile/Models/scholarship_model.dart';
import 'package:usm_mobile/View/components/CustomAppBar.dart';
import 'package:usm_mobile/View/components/MyBoardComponent.dart';
import 'package:usm_mobile/view/components/tiles.dart';

import '../components/side_bar.dart';

class Board_Page extends StatefulWidget {
  Board_Page({Key key}) : super(key: key);

  @override
  _HomeState createState() => _HomeState();
}

//************************ for testing */

String image =
    "https://cdn.britannica.com/85/13085-050-C2E88389/Corpus-Christi-College-University-of-Cambridge-England.jpg";

String testo =
    "أسست جامعة الشام الخاصة بموجب المرسوم التشريعي رقم 97 تاريخ 28/7/2011 لتكون مؤسسة رائدة في التعليم العالي، رافدة له في المجالات العلمية المتقدمة والمتطورة، ومن أجل تحقيق أهدافها فإنها تتواصل مع مختلف القطاعات الحكومية والخاصة، بغرض المساهمة في التنمية المستدامة لهذه القطاعات، وهي تتطلع لتلبية احتياجات سوق العمل بالأطر العلمية المتخصصة والفعالة في بناء الاقتصاد الوطني وتطويره.\nتهنئ جامعة الشام الخاصة طلابها الجدد بانتسابهم اليها وترحب بهم أجمل الترحيب وتزهو باستقبالهم كطلبة مستجدين يشكلون دفعة جديدة من الملتحقين في الجامعة للعام الدراسي الجديد.\nلقد وضعت جامعة الشام كل امكانياتها من أجل خدمة طلابها، وتزويدهم بالمعرفة وتهيئة الأجواء الملائمة لإبداعهم، وحصولهم على المعلومات النظرية والعلمية المفيدة والمتطورة وفهم أحدث المعارف العلمية المتقدمة في مجال الاختصاص.\nوسنعمل على أن نقدم لأبنائنا الطلاب كل ما يؤهلهم لأن يكونوا روادً في مجال تخصصهم.";
List<Profs> testProfs = [
  Profs(
    image:
        "https://www.pngkey.com/png/full/114-1149878_setting-user-avatar-in-specific-size-without-breaking.png",
    name: "MR.TESTMAN",
    spec: "DOCTOR ?",
  ),
  Profs(
      image:
          "https://www.pngkey.com/png/full/114-1149878_setting-user-avatar-in-specific-size-without-breaking.png",
      name: "MR.TESTMAN",
      spec: "DOCTOR ?"),
  Profs(
      image:
          "https://www.pngkey.com/png/full/114-1149878_setting-user-avatar-in-specific-size-without-breaking.png",
      name: "MR.TESTMAN",
      spec: "DOCTOR ?"),
  Profs(
      image:
          "https://www.pngkey.com/png/full/114-1149878_setting-user-avatar-in-specific-size-without-breaking.png",
      name: "MR.TESTMAN",
      spec: "DOCTOR ?"),
  Profs(
      image:
          "https://www.pngkey.com/png/full/114-1149878_setting-user-avatar-in-specific-size-without-breaking.png",
      name: "MR.TESTMAN",
      spec: "DOCTOR ?"),
];

List<Scholarship> testScholarship = [
  Scholarship(
      title: "Holland scholarships",
      attach:
          "The Holland Scholarship is meant for international students from outside the European Economic Area (EEA) who want to do their bachelor’s or master’s in the Netherlands. Are you ready for the chance of a lifetime? Apply for the Holland Scholarship!"),
  Scholarship(
      title: "American University",
      attach:
          "The AU Emerging Global Leader Scholarship is targeted to high-achieving international students who wish to pursue a Bachelor’s Degree in the US and who are dedicated to positive civic and social change. It is intended for students who will be to returning home to improve under-resourced, underserved."),
  Scholarship(
      title: "Holland scholarships",
      attach:
          "The Holland Scholarship is meant for international students from outside the European Economic Area (EEA) who want to do their bachelor’s or master’s in the Netherlands. Are you ready for the chance of a lifetime? Apply for the Holland Scholarship!"),
];
//************************ */
BoardModel myBoard = BoardModel(
    image: image,
    description: testo,
    name: "ASPU",
    profs: testProfs,
    scholarship: testScholarship);

//************************ */
class _HomeState extends State<Board_Page> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: CustomAppBar(),
      body: Row(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: [
          new Side_bar(selected: 2),
          Container(width: Get.width * 0.8, child: MyBoardPage(myBoard)),
        ],
      ),
    );
  }
}
