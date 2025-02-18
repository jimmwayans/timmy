/*     */ package sun.security.tools.policytool;
/*     */ 
/*     */ import java.util.ListResourceBundle;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Resources_de
/*     */   extends ListResourceBundle
/*     */ {
/*  35 */   private static final Object[][] contents = new Object[][] { { "NEWLINE", "\n" }, { "Warning.A.public.key.for.alias.signers.i.does.not.exist.Make.sure.a.KeyStore.is.properly.configured.", "Warnung: Kein Public Key für Alias {0} vorhanden. Vergewissern Sie sich, dass der KeyStore ordnungsgemäß konfiguriert ist." }, { "Warning.Class.not.found.class", "Warnung: Klasse nicht gefunden: {0}" }, { "Warning.Invalid.argument.s.for.constructor.arg", "Warnung: Ungültige(s) Argument(e) für Constructor: {0}" }, { "Illegal.Principal.Type.type", "Unzulässiger Principal-Typ: {0}" }, { "Illegal.option.option", "Unzulässige Option: {0}" }, { "Usage.policytool.options.", "Verwendung: policytool [Optionen]" }, { ".file.file.policy.file.location", " [-file <Datei>]    Policy-Dateiverzeichnis" }, { "New", "&Neu" }, { "Open", "&Öffnen..." }, { "Save", "&Speichern" }, { "Save.As", "Speichern &unter..." }, { "View.Warning.Log", "&Warnungslog anzeigen" }, { "Exit", "B&eenden" }, { "Add.Policy.Entry", "Policy-Eintrag &hinzufügen" }, { "Edit.Policy.Entry", "Policy-Eintrag &bearbeiten" }, { "Remove.Policy.Entry", "Policy-Eintrag &entfernen" }, { "Edit", "&Bearbeiten" }, { "Retain", "Beibehalten" }, { "Warning.File.name.may.include.escaped.backslash.characters.It.is.not.necessary.to.escape.backslash.characters.the.tool.escapes", "Warnung: Möglicherweise enthält der Dateiname Escapezeichen mit Backslash. Es ist nicht notwendig, Backslash-Zeichen zu escapen (das Tool führt dies automatisch beim Schreiben des Policy-Contents in den persistenten Speicher aus).\n\nKlicken Sie auf \"Beibehalten\", um den eingegebenen Namen beizubehalten oder auf \"Bearbeiten\", um den Namen zu bearbeiten." }, { "Add.Public.Key.Alias", "Public Key-Alias hinzufügen" }, { "Remove.Public.Key.Alias", "Public Key-Alias entfernen" }, { "File", "&Datei" }, { "KeyStore", "&KeyStore" }, { "Policy.File.", "Policy-Datei:" }, { "Could.not.open.policy.file.policyFile.e.toString.", "Policy-Datei konnte nicht geöffnet werden: {0}: {1}" }, { "Policy.Tool", "Policy-Tool" }, { "Errors.have.occurred.while.opening.the.policy.configuration.View.the.Warning.Log.for.more.information.", "Beim Öffnen der Policy-Konfiguration sind Fehler aufgetreten. Weitere Informationen finden Sie im Warnungslog." }, { "Error", "Fehler" }, { "OK", "OK" }, { "Status", "Status" }, { "Warning", "Warnung" }, { "Permission.", "Berechtigung:                                                       " }, { "Principal.Type.", "Principal-Typ:" }, { "Principal.Name.", "Principal-Name:" }, { "Target.Name.", "Zielname:                                                    " }, { "Actions.", "Aktionen:                                                             " }, { "OK.to.overwrite.existing.file.filename.", "Vorhandene Datei {0} überschreiben?" }, { "Cancel", "Abbrechen" }, { "CodeBase.", "&CodeBase:" }, { "SignedBy.", "&SignedBy:" }, { "Add.Principal", "Principal &hinzufügen" }, { "Edit.Principal", "Principal &bearbeiten" }, { "Remove.Principal", "Principal ent&fernen" }, { "Principals.", "&Principals:" }, { ".Add.Permission", "  B&erechtigung hinzufügen" }, { ".Edit.Permission", "  Be&rechtigung bearbeiten" }, { "Remove.Permission", "Berec&htigung entfernen" }, { "Done", "Fertig" }, { "KeyStore.URL.", "KeyStore-&URL:" }, { "KeyStore.Type.", "KeyStore-&Typ:" }, { "KeyStore.Provider.", "KeyStore-&Provider:" }, { "KeyStore.Password.URL.", "KeyStore-Kenn&wort-URL:" }, { "Principals", "Principals" }, { ".Edit.Principal.", "  Principal bearbeiten:" }, { ".Add.New.Principal.", "  Neuen Principal hinzufügen:" }, { "Permissions", "Berechtigungen" }, { ".Edit.Permission.", "  Berechtigung bearbeiten:" }, { ".Add.New.Permission.", "  Neue Berechtigung hinzufügen:" }, { "Signed.By.", "Signiert von:" }, { "Cannot.Specify.Principal.with.a.Wildcard.Class.without.a.Wildcard.Name", "Principal kann nicht mit einer Platzhalterklasse ohne Platzhalternamen angegeben werden" }, { "Cannot.Specify.Principal.without.a.Name", "Principal kann nicht ohne einen Namen angegeben werden" }, { "Permission.and.Target.Name.must.have.a.value", "Berechtigung und Zielname müssen einen Wert haben" }, { "Remove.this.Policy.Entry.", "Diesen Policy-Eintrag entfernen?" }, { "Overwrite.File", "Datei überschreiben" }, { "Policy.successfully.written.to.filename", "Policy erfolgreich in {0} geschrieben" }, { "null.filename", "Null-Dateiname" }, { "Save.changes.", "Änderungen speichern?" }, { "Yes", "&Ja" }, { "No", "&Nein" }, { "Policy.Entry", "Policy-Eintrag" }, { "Save.Changes", "Änderungen speichern" }, { "No.Policy.Entry.selected", "Kein Policy-Eintrag ausgewählt" }, { "Unable.to.open.KeyStore.ex.toString.", "KeyStore kann nicht geöffnet werden: {0}" }, { "No.principal.selected", "Kein Principal ausgewählt" }, { "No.permission.selected", "Keine Berechtigung ausgewählt" }, { "name", "Name" }, { "configuration.type", "Konfigurationstyp" }, { "environment.variable.name", "Umgebungsvariablenname" }, { "library.name", "Library-Name" }, { "package.name", "Packagename" }, { "policy.type", "Policy-Typ" }, { "property.name", "Eigenschaftsname" }, { "provider.name", "Providername" }, { "url", "URL" }, { "method.list", "Methodenliste" }, { "request.headers.list", "Headerliste anfordern" }, { "Principal.List", "Principal-Liste" }, { "Permission.List", "Berechtigungsliste" }, { "Code.Base", "Codebase" }, { "KeyStore.U.R.L.", "KeyStore-URL:" }, { "KeyStore.Password.U.R.L.", "KeyStore-Kennwort-URL:" } };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object[][] getContents() {
/* 157 */     return contents;
/*     */   }
/*     */ }


/* Location:              /Users/timmy/timmy/OSWE/oswe/openCRX/rt.jar!/sun/security/tools/policytool/Resources_de.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */