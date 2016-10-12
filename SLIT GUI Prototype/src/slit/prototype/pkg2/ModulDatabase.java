/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slit.prototype.pkg2;

import java.util.HashMap;

/**
 *
 * @author mathiashartveit1
 * 
 * Works as a temporary database until we can start interacting with 
 * an actual database of information.
 * 
 */
public class ModulDatabase {
    
    String modul1Oppgave = "Læringsmål:\n\n" +
"Du har fullført modulen når du kan:\n" +
"   * Bruke BlueJ, bl.a. til å:\n" +
"       o Åpne, lagre, og lukke prosjekter.\n" +
"       o Lage objekter\n" +
"       o Kalle metoder i objektene, med og uten parametere\n" +
"       o Bruke editoren til å se på kildekoden til en klasse\n" +
"       o Kunne kompilere prosjektet\n" +
"   * Litt java, du skal f.eks.\n" +
"       o Kunne kjenne igjen en klassedefinisjon, og kunne finne navnet på klassen\n" +
"       o Kjenne til forskjellige typer data\n" +
"       o Kalle metoder med et objekt som parameter\n" +
"       o Kalle metoder som returnerer en verdi\n" +
"       o Kjenne forskjellen mellom klasser og objekter";
    
    String modul2Oppgave = "2";
    String modul3Oppgave = "3";
    String modul4Oppgave = "4";
    String modul5Oppgave = "5";
    String modul6Oppgave = "6";
    String modul7Oppgave = "7";
    String modul8Oppgave = "8";
    String modul9Oppgave = "9";
    String modul10Oppgave = "10";
    
    
    String modul1InfoLink = "";
    
    
    public HashMap<String, String> modulOppgaver = new HashMap();
    public HashMap<String, String> modulInfoLink = new HashMap();
    
    public ModulDatabase() {
        
        populateOppgaver();
        populateInfo();
        
    }
    
    // TODO: Better ways to load this!
    void populateOppgaver() {
        modulOppgaver.put("1", modul1Oppgave);
        modulOppgaver.put("2", modul2Oppgave);
        modulOppgaver.put("3", modul3Oppgave);
        modulOppgaver.put("4", modul4Oppgave);
        modulOppgaver.put("5", modul5Oppgave);
        modulOppgaver.put("6", modul6Oppgave);
        modulOppgaver.put("7", modul7Oppgave);
        modulOppgaver.put("8", modul8Oppgave);
        modulOppgaver.put("9", modul9Oppgave);
        modulOppgaver.put("10", modul10Oppgave);
    }
    
    // TODO: Better ways to load this!
    void populateInfo() {
        modulInfoLink.put("1", "https://dl.dropboxusercontent.com/u/753933/is-109/Moduler/Modul%201/Beskrivelse.xhtml");
    }
}
