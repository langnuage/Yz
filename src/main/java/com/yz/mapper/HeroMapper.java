package com.yz.mapper;

import java.util.List;

import com.yz.pojo.Hero;

public interface HeroMapper 
{
	public int add(Hero hero); 
    
    public void delete(int id); 
        
    public Hero get(int id); 
      
    public int update(Hero hero);  
        
    public List<Hero> list();
     
    public int count();

}
