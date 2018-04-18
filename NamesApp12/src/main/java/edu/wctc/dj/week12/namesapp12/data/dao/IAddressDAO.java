/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.dj.week12.namesapp12.data.dao;

import edu.wctc.dj.week12.namesapp12.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author tatum
 */
public interface IAddressDAO extends JpaRepository<Address, String>{
    
}
