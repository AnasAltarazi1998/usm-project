package com.company.app.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.company.app.Models.BoardModel;
import com.company.app.Models.CommentModel;
import com.company.app.Models.CommunityModel;
import com.company.app.Models.PostModel;
import com.company.app.Models.ProfsModel;
import com.company.app.Models.ScholarshipModel;
import com.company.app.Models.UserModel;
import com.company.app.Repositories.CommunityRepo;
import com.company.app.entities.BoardEntity;
import com.company.app.entities.CommentEntity;
import com.company.app.entities.CommunityEntity;
import com.company.app.entities.LikeEntity;
import com.company.app.entities.PostEntity;
import com.company.app.entities.ProfsEntity;
import com.company.app.entities.ScholarEntity;
import com.company.app.entities.UserEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormService {
    @Autowired
    CommunityRepo communityRepo;

    public UserModel convertToUserResponseForm(UserEntity u) {
        UserModel response = new UserModel();
        response.setId(Math.toIntExact(u.getId()));
        response.setEmail(u.getEmail());
        response.setAge(u.getAge());
        response.setName(u.getName());
        response.setImg(u.getImg());
        response.setPassword(u.getPassword());
        response.setCommunity_name(u.getCommuninty().getName());
        response.setStart_year(u.getStart_year());
        response.setStudy_year(u.getStudy_year());
        response.setUniversity(u.getUniversity());
        return response;
    }

    public ProfsModel convertToProfResponseForm(ProfsEntity p) {
        ProfsModel response = new ProfsModel();
        response.setName(p.getName());
        response.setImage(p.getImage());
        response.setSpec(p.getSpec());
        return response;
    }

    public ScholarshipModel convertToScholarshipResponseForm(ScholarEntity s) {
        ScholarshipModel response = new ScholarshipModel();
        response.setTitle(s.getTitle());
        response.setAttach(s.getAttach());
        response.setDate(s.getDate());
        response.setExpiredDate(s.getExpire_date());
        return response;
    }

    public BoardModel convertToBoardResponseForm(BoardEntity b) {
        BoardModel response = new BoardModel();
        response.setName(b.getName());
        response.setImage(b.getImage());
        response.setDescription(b.getDescription());
        response.setProfs(new ArrayList<>());
        for (int i = 0; i < b.getProfs().size(); i++) {
            response.getProfs().add(convertToProfResponseForm(b.getProfs().get(i)));
        }
        response.setScholarship(new ArrayList<>());
        for (int i = 0; i < b.getScholarships().size(); i++) {
            response.getScholarship().add(convertToScholarshipResponseForm(b.getScholarships().get(i)));
        }
        return response;
    }

    public List<BoardModel> convertToListOfBoardResponseForm(List<BoardEntity> list) {
        List<BoardModel> response = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            response.add(convertToBoardResponseForm(list.get(i)));
        }
        return response;
    }

    public Iterator<BoardModel> convertToIteraatorOfBoardResponseForm(Iterator<BoardEntity> list) {
        List<BoardModel> response = new ArrayList<>();
        while (list.hasNext()) {
            response.add(convertToBoardResponseForm(list.next()));
        }
        return response.iterator();
    }

    public List<UserModel> convertToListOfUserResponseForm(List<UserEntity> list) {
        List<UserModel> response = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            response.add(convertToUserResponseForm(list.get(i)));
        }
        return response;
    }

    public CommunityModel convertToCommunityResponseForm(CommunityEntity c) {
        CommunityModel response = new CommunityModel();
        response.setName(c.getName());
        response.setImg(c.getImg());
        response.setDescription(c.getDescription());
        if (!(c.getUsers() == null))
            response.setUsers(convertToListOfUserResponseForm(c.getUsers()));
        return response;
    }

    public List<CommunityModel> convertToListOfCommunityResponseForm(List<CommunityEntity> list) {
        List<CommunityModel> response = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            response.add(convertToCommunityResponseForm(list.get(i)));
        }
        return response;
    }

    public List<UserModel> convertToListOfUsersModelsFromLikeEntitiesForm(List<LikeEntity> likeEntities) {
        List<UserModel> userModels = new ArrayList<>();
        for (LikeEntity likeEntity : likeEntities) {
            userModels.add(convertToUserResponseForm(likeEntity.getUEntity()));

        }
        return userModels;

    }

    public List<CommentModel> convertToListOfCommentModelFromCommentEntitiesForm(List<CommentEntity> commentEntities) {
        List<CommentModel> comments = new ArrayList<>();
        for (CommentEntity commentEntity : commentEntities) {
            CommentModel currentComment = new CommentModel(convertToUserResponseForm(commentEntity.getUEntity()),
                    commentEntity.getValue());
            comments.add(currentComment);

        }
        return comments;
    }

    public List<PostModel> convertToListOfPostResponseFromPostEntitiesForm(List<PostEntity> postEntities) {
        List<PostModel> postModels = new ArrayList<>();
        for (PostEntity postEntity : postEntities) {
            PostModel model = new PostModel();
            model.setId(Math.toIntExact(postEntity.getId()));
            model.setTitle(postEntity.getTitle());
            model.setUserImage(postEntity.getUEntity().getImg());
            model.setUserWhoMakeLike(convertToListOfUsersModelsFromLikeEntitiesForm(postEntity.getLikes()));
            model.setValue(postEntity.getValue());
            model.setAttach(postEntity.getAttach());
            model.setCommentsInfo(convertToListOfCommentModelFromCommentEntitiesForm(postEntity.getComments()));
            model.setCreated_at(postEntity.getCreated_at());
            postModels.add(model);
        }
        return postModels;
    }

    public PostModel convertToPostResponseFromPostEntitiesForm(PostEntity postEntity) {

        PostModel postModel = new PostModel();
        postModel.setId(Math.toIntExact(postEntity.getId()));
        postModel.setTitle(postEntity.getTitle());
        postModel.setUserImage(postEntity.getUEntity().getImg());
        postModel.setUserWhoMakeLike(convertToListOfUsersModelsFromLikeEntitiesForm(postEntity.getLikes()));
        postModel.setValue(postEntity.getValue());
        postModel.setAttach(postEntity.getAttach());
        postModel.setCommentsInfo(convertToListOfCommentModelFromCommentEntitiesForm(postEntity.getComments()));
        postModel.setCreated_at(postEntity.getCreated_at());

        return postModel;
    }

    public UserEntity convertToUserEntityFromUserModelForm(UserModel u) {
        UserEntity respons = new UserEntity();

        respons.setName(u.getName());
        respons.setEmail(u.getEmail());
        respons.setPassword(u.getPassword());
        respons.setUniversity(u.getUniversity());
        respons.setStart_year(u.getStart_year());
        respons.setStudy_year(u.getStudy_year());
        respons.setAge(u.getAge());
        respons.setImg(u.getImg());
        respons.setCommuninty(communityRepo.findByName(u.getCommunity_name()).get());
        respons.setBoards(new ArrayList<>());
        respons.setLikes(new ArrayList<>());
        respons.setPosts(new ArrayList<>());
        respons.setComments(new ArrayList<>());
        respons.setFlag(true);
        respons.setCreated_at(new Date());

        return respons;
    }

}
