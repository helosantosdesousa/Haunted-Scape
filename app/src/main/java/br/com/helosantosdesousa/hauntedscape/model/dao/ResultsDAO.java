package br.com.helosantosdesousa.hauntedscape.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.helosantosdesousa.hauntedscape.model.bean.Player;
import br.com.helosantosdesousa.hauntedscape.model.connection.ConnectionFactory;

public class ResultsDAO extends DAO{
    public ResultsDAO(){
        this.connection = ConnectionFactory.getInstance().getConnection();
    }
    public void updateResults(Player player){
        String sql = "update hs_results set points = ? where idPlayer = ? ";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, player.getPoints());
            ps.setInt(2, player.getIdPlayer());

            ps.execute();
        } catch (SQLException e) {
            System.out.println("erro ao atualizar dados do usuário\n" + e);
        }
    }


    }

