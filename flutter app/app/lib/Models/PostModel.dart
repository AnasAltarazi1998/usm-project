class Post {
  int id;
  String title;
  String description =
      'As the new year beginning we are more than glad to announce about our new Registration system to register for the new year in our university Please follow this steps 1.visit the student...';
  int likes = 0;
  int comments = 0;
  String image;

  Post(
      {this.id,
      this.title,
      this.description,
      this.image,
      this.likes = 0,
      this.comments = 0});
}
