package edu.escuelaing.arsw.boardUI.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "files")
public class File {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "file_id")
    private int fileId;

    @Column(name = "room_id")
    private int roomId;

    private String name;
    private String extension;
    private String content;

    @Column(name = "request_id")
    private int requestId;

    public File() {
    }

    public void setFileId(int fileId) {
        this.fileId = fileId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public String getContent() {
        return content;
    }

    public String getExtension() {
        return extension;
    }

    public int getFileId() {
        return fileId;
    }

    public String getName() {
        return name;
    }

    public int getRequestId() {
        return requestId;
    }

    public int getRoomId() {
        return roomId;
    }
}
