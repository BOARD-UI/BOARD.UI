package edu.escuelaing.arsw.boardUI.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Class that corresponds to the Rooms table in the database
 * 
 * @author Luis Amaya
 * @author Angie Medina
 * @author Sebastian Mina
 * @author Jose Perez
 * @version 1.0
 */

@Entity
@Table(name = "permissions")
public class Permission {

    @Id
    @Column(name = "permission_id")
    private int permissionId;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "room_id")
    private int roomId;

    private String type;

    public Permission() {
    }

    public int getRoomId() {
        return roomId;
    }

    public String getType() {
        return type;
    }

    public int getUserId() {
        return userId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setPermissionId(int permissionId) {
        this.permissionId = permissionId;
    }

    public int getPermissionId() {
        return permissionId;
    }

}