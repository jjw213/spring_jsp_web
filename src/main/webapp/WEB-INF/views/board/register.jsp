<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../includes/header.jsp"%>
<div class="row">
	<div class="col-lg-12">
		<h1 class="page-header">Board Register</h1>
	</div>
</div>
<div class="row">
	<div class="col-lg-12">
		<div class="panel panel-default">
			<div class="panel-heading">Board register page</div>
			<div class="panel-body">
				<form action="/board/register" method="post">
					<div class="form-group">
						<label>Title</label>
						<input class="form-control" name="title">
					</div>
					<div class="form-group">
						<label>Text area</label>
						<textarea class="form-control" rows="3" name="content"></textarea>
					</div>
					<div class="form-group">
						<label>Writer</label>
						<input class="form-control" name="writer">
					</div>
					<!-- 제출 -->
					<button type="submit" class="btn btn-default">Submit</button>
					<!-- 초기화 -->
					<button type="reset" class="btn btn-default">Reset</button>
				</form>
			</div>
		</div>
	</div>
</div>
<%@ include file="../includes/footer.jsp"%>