package com.xgmes.mapper;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.xgmes.model.Cheatlog;

public interface CheatlogMapper {
	
	public List<Cheatlog> queryList(Cheatlog cheatlog) throws DataAccessException;
	
	public int insertCheatlog(Cheatlog cheatlog) throws DataAccessException;

}
