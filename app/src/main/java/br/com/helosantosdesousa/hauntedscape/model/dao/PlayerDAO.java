package br.com.helosantosdesousa.hauntedscape.model.dao;

import java.sql.SQLException;

import br.com.helosantosdesousa.hauntedscape.model.bean.Player;
import br.com.helosantosdesousa.hauntedscape.model.connection.ConnectionFactory;

public class PlayerDAO extends DAO{
    public PlayerDAO(){
        this.connection = ConnectionFactory.getInstance().getConnection();
    }

    public void insertPlayer(Player player){
        int idPlayer=0;
        try{
            connection.setAutoCommit(false);

            sql = "insert into hs_results values(seq_hs.nextval, ?, ?)";
            ps = connection.prepareStatement(sql);
            ps.setInt(1,player.getIdPlayer());
            ps.setString(2, player.getName());
            ps.setInt(3,player.getPoints());
            ps.execute();
            connection.commit();

        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException e1){
                System.out.println("erro ao cadastrar o usuário\n" + e1);
            }
            System.out.println("erro ao cadastrar o usuário\n" + e);
        }
    }
}
