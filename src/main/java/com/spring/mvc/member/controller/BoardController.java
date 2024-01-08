package com.spring.mvc.member.controller;

import com.spring.mvc.member.dto.request.BoardRequestDTO;
import com.spring.mvc.member.dto.response.BoardDetailResponseDTO;
import com.spring.mvc.member.dto.response.RoomListPageResponseDTO;
import com.spring.mvc.member.entity.Board;
import com.spring.mvc.member.entity.Room;
import com.spring.mvc.member.repository.BoardMapper;
import com.spring.mvc.member.service.BoardService;
import com.spring.mvc.member.service.RoomService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/room/board")
public class BoardController {

    public final BoardService boardService;
    public final RoomService roomService;

    // 방안에 게시글 만들기 화면요청
    @GetMapping("/write")
     public String makeBoard(@RequestParam long roomId, Model model){
        log.info("bord/write GET roomId : {}",roomId);
        Room room = roomService.getRoomByRoomId(roomId);
        model.addAttribute("roomName",room.getRoomName());
        model.addAttribute("roomId",roomId);

        return "board/write";
    }


    // 게시글 상세 조회 요청
    @GetMapping("/detail")
    public String boardDetail(int boardId, Model model) {
        BoardDetailResponseDTO detail = boardService.getDetail(boardId);
        model.addAttribute("b", detail);
        return "board/detail";
    }

    // 게시글 수정 요청
    @GetMapping("/modify")
    public String boardModify(int boardId, Model model) {
        
        return "board/update";

    // 클릭한 게시물 상세보기
//     @GetMapping("/detail")
//     public String oneBoard(
//             @RequestParam long boardId,
//             Model model)
//     {
//         log.info("detail id={} : GET!",boardId);
//         Board board = boardService.findOneByBoard(boardId);

//         log.debug("board : {}",board);
//         model.addAttribute("boardId",board.getBoardId());
//         model.addAttribute("personId",board.getPersonId());
//         model.addAttribute("boardTitle",board.getBoardTitle());
//         model.addAttribute("boardContent",board.getBoardContent());
//         model.addAttribute("roomId",board.getRoomId());
//         model.addAttribute("viewCount",board.getViewCount());
//         model.addAttribute("regDate",board.getRegDate());

//         Room room = roomService.getRoomByRoomId(board.getRoomId());
//         model.addAttribute("roomName",room.getRoomName());
//         return "board/detail";
//     }

    @DeleteMapping("/write")
    public String deleteBoard(Long board){
        boardService.delete(board);
        return "board/write";
    }

}
