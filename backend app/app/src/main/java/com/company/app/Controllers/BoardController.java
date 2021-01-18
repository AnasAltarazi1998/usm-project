package com.company.app.Controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.company.app.Models.BoardModel;
import com.company.app.Repositories.BoardRepo;
import com.company.app.Repositories.UserRepo;
import com.company.app.entities.BoardEntity;
import com.company.app.entities.UserEntity;
import com.company.app.services.FormService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/boards")
public class BoardController {
    @Autowired
    BoardRepo boardRepo;
    @Autowired
    FormService formService;
    @Autowired
    UserRepo UserRepo;

    @GetMapping(path = "/getbyname/{name}")
    public BoardModel getBoard(@PathVariable(name = "name") String name) {
        Optional<BoardEntity> b = boardRepo.findByName(name);
        if (b.isPresent())
            return formService.convertToBoardResponseForm(b.get());
        else {
            BoardModel res = new BoardModel();
            res.setName("board not found");
            return res;
        }
    }

    @GetMapping(path = "/boardbyuserid/{id}")
    public List<BoardModel> getBoardsByUserId(@PathVariable(name = "id") String id) {
        if (UserRepo.findById(Long.parseLong(id)).isPresent()) {
            List<BoardEntity> board_list = UserRepo.getBoards(Long.parseLong(id));
            if (board_list.size() > 0)
                return formService.convertToListOfBoardResponseForm(board_list);
            else {
                List<BoardModel> res = new ArrayList<>();
                res.add(new BoardModel());
                res.get(0).setName("no boards for this user");
                return res;
            }
        } else {
            List<BoardModel> res = new ArrayList<>();
            res.add(new BoardModel());
            res.get(0).setName("no user with this id");
            return res;
        }

    }

    @GetMapping(value = "/search/{val}")
    public List<BoardModel> searchList(@PathVariable(name = "val") String s) {

        return formService.convertToListOfBoardResponseForm(boardRepo.search(s));
    }

    @PostMapping(value = "/joinBoard/{id}/{board}")
    public BoardModel joinBoard(@PathVariable(name = "id") String id, @PathVariable(name = "board") String board) {
        Optional<UserEntity> u = UserRepo.findById(Long.parseLong(id));
        Optional<BoardEntity> b = boardRepo.findByName(board);
        if (u.isPresent() && b.isPresent()) {
            b.get().getUsers().add(u.get());
            BoardEntity res = boardRepo.save(b.get());
            return formService.convertToBoardResponseForm(res);
        } else {
            BoardModel res = new BoardModel();
            res.setName("there is an error while joining board");
            return res;
        }
    }

    @PostMapping(path = "/addboard")
    public boolean addNewBoard(@RequestBody BoardEntity b) {
        if (boardRepo.findByName(b.getName()).isPresent()) {
            return false;
        } else {
            b = boardRepo.save(b);
            return boardRepo.findById(b.getId()).isPresent();
        }
    }
}
