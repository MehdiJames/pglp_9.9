package dessin;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * Classe DAO abstraite.
 * @author Mehdi
 *
 * @param <T> pour mettre la classe du DAO qu'on souhaitre acc�der
 */
public abstract class DAO<T> {
    /**
     * Chaine de connexion precisant les informations pour
     * la connexion a la base de donnees.
     */
    private String dbUrl;
    /**
     * Permet l'interaction avec le JDBC.
     */
    private Connection connect;

    /**
     * Constructeur du DAO pour JDBC.
     * @throws SQLException Exception liee a l'acces a la base de donnees
     */
    public DAO() throws SQLException {
        dbUrl = "jdbc:derby:donneesPourDB\\jdbcDB;create=true";

        try {
            setConnect(DriverManager.getConnection(dbUrl));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /**
     * M�thode de cr�ation.
     * @param obj L'objet a� cr�er
     * @return T une classe donn�e
     * @throws IOException Exceptions li�es aux entr�es/sorties
     * @throws SQLException Exception liee a l'acces a la base de donnees
     */
    public abstract T create(T obj) throws IOException, SQLException;
    /**
     * M�thode pour effacer.
     * @param obj l'objet a� supprimer
     * @throws SQLException Exception liee a l'acces a la base de donnees
     */
    public abstract void delete(T obj) throws SQLException;
    /**
     * Méthode de mise à jour.
     * @param obj L'objet à mettre à jour
     * @throws IOException Exception liee aux entrees/sorties
     * @return T une instance de la classe donnée
     * @throws SQLException Exception liee a l'acces a la base de donnees
     */
    public abstract T update(T obj) throws IOException, SQLException;
    /**
     * Méthode de recherche des informations.
     * @param nom de l'information
     * @return T une classe donn�e
     * @throws FileNotFoundException Exception si le fichier n'existe pas
     * @throws IOException Exception liee aux entrees/sorties
     * @throws ClassNotFoundException Exception si la classe n'existe pas
     * @throws SQLException Exception liee a l'acces a la base de donnees
     */
    public abstract T find(String nom) throws FileNotFoundException,
    ClassNotFoundException, IOException, SQLException;
    /**
     * Methode pour recuperer connect.
     * @return connect.
     */
    public Connection getConnect() {
        return connect;
    }
    /**
     * Methode pour redefinir connect.
     * @param newCon a remplacer
     */
    public void setConnect(final Connection newCon) {
        this.connect = newCon;
    }
}
