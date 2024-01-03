<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>Comment</title>
    <link rel="stylesheet" href="/assets/css/board/board.css">
</head>
<body>
<form> <input class='write-5' type="submit" value="돌아가기"> </form> <h1> 게시판 </h1>

<div class='form-0'>
    <div class="board-top">
        <form class='form-1' method="POST"  enctype="multipart/form-data">
            <input class='write-1' type="text" name="title" maxlegth="44"
                   placeholder="제목 입력, 최대 44자까지 가능합니다" required>
            <textarea class='write-2' name="detail" rows="20"
                      cols="20" maxlength="254" placeholder="내용 작성,최대 254자 가능합니다" required>
            </textarea>
<%--            <div class="filebox">--%>
<%--                <label for="file">파일찾기</label>--%>
<%--                <input type="file" id="file">--%>
<%--            </div>--%>
            <hr>
            <input class='write-4' type="submit" value="올리기">
        </form>

    </div>
</div>
<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
<br><br><br><br><br><br><br><br><br><br><br><br><br><br>
<hr>
<%--<input type="submit" value="댓글 목록">--%>
<h2>댓글 작성</h2>
<form method="post" action="">
    <textarea name="comment" rows="4" cols="50" placeholder="댓글을 작성하세요">
    </textarea><br>
    <input type="submit" value="댓글 등록">
<%--    <input type="submit" value="댓글 삭제">--%>
</form>
<%--댓글 띄우는 코드--%>
<div>
    <h3>댓글</h3>
    <ul id="commentList">
        <!-- 댓글 목록이 표시되는 부분 -->
<%--<!--<c:forEach var="comment" items="${commentList}">-->--%>
        <li>
            <p><strong>88888<!-- 여기에 댓글 작성자를 표시하는 코드를 넣으세요 --></strong>
                <!-- 여기에 댓글 내용을 표시하는 코드를 넣으세요 --></p>
            <button type="button" class="btn-comment-up">수정</button>
            <button type="button" class="btn-comment-delete">삭제</button>
        </li>
        <!-- <%--</c:forEach>--%>-->
    </ul>
</div>
</body>
</html>