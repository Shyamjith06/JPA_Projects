package com.mindtree.comics.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.comics.dto.ComicsDto;
import com.mindtree.comics.entity.Comics;
import com.mindtree.comics.repository.ComicsRepository;
import com.mindtree.comics.service.ComicsService;


@Service
public class ComicsServiceImpl  implements ComicsService{
	
	@Autowired ComicsRepository comicsRepository;
	
	ModelMapper modelMapper=new ModelMapper();

	@Override
	public ComicsDto addComics(ComicsDto comicsDto) 
	{
		Comics comics=ConvertDtoToEntity(comicsDto);
		comics.getSuperHeroes().forEach(s ->{
			s.setComics(comics);
			s.getPowers().forEach(p -> {
				p.setSuperHero(s);
			});
		});
		
		Comics comic=comicsRepository.save(comics);
		return ConvertEntityToDto(comic);
		
		 
	}
	
	public Comics ConvertDtoToEntity(ComicsDto comicsDto)
	{
		return modelMapper.map(comicsDto, Comics.class);
	}
	public ComicsDto ConvertEntityToDto(Comics comics)
	{
		return modelMapper.map(comics, ComicsDto.class);
	}
}
