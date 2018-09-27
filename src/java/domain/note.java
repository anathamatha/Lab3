/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author 731866
 */
public class note {
private String noteT;
private String noteC;

    public void setNoteT(String noteT) {
        this.noteT = noteT;
    }

    public void setNoteC(String noteC) {
        this.noteC = noteC;
    }

    public String getNoteT() {
        return noteT;
    }

    public String getNoteC() {
        return noteC;
    }

    public note(String noteT, String noteC) {
        this.noteT = noteT;
        this.noteC = noteC;
    }

   
    
}
