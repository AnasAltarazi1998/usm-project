package com.company.app.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.company.app.Models.PostModel;
import com.company.app.entities.PostEntity;

import org.springframework.stereotype.Service;

@Service
public class PostServices {

    public List<PostModel> filterList(List<PostEntity> postsEntities) {
        FormService service = new FormService();
        Date date = new Date();
        List<PostModel> posts = service.convertToListOfPostResponseFromPostEntitiesForm(postsEntities);
        for (PostModel postModel : posts) {
            postModel.setRate(postModel.getLikeCount() + postModel.getCommentCount());
            Date proccesDate = postModel.getCreated_at();
            long dist = date.getTime() - proccesDate.getTime();
            if (dist == 86400000)
                postModel.setRate(postModel.getRate() + 5);
            else if (dist == 172800000)
                postModel.setRate(postModel.getRate() + 4);
            else if (dist == 259200000)
                postModel.setRate(postModel.getRate() + 3);
            else if (dist == 345600000)
                postModel.setRate(postModel.getRate() + 2);
            else if (dist == 432000000)
                postModel.setRate(postModel.getRate() + 1);
        }
        List<PostModel> procceList = new ArrayList<>();
        PostModel comparePost = null;
        int compare = 0;
        for (int i = 0; i < 3; i++) {
            for (PostModel postModel2 : posts) {
                if (postModel2.getRate() > compare) {
                    compare = postModel2.getRate();
                    comparePost = postModel2;
                }
                procceList.add(comparePost);
                posts.remove(comparePost);
            }

        }
        return procceList;
    }
}
