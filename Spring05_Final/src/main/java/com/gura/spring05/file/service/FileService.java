package com.gura.spring05.file.service;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.gura.spring05.file.dto.FileDto;

public interface FileService {
	public void getList(HttpServletRequest request);
	public void saveFile(FileDto dto, ModelAndView mView,
			HttpServletRequest request);
	public void getFileData(int num, ModelAndView mView);
	public void deleteFile(int num, HttpServletRequest request);
	
}
