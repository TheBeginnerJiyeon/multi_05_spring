package com.multi.spring.file.service;

import com.multi.spring.movie.model.dto.MovieDTO;

public interface FileService {

	void insertMovie(MovieDTO movieDTO) throws Exception;

}
