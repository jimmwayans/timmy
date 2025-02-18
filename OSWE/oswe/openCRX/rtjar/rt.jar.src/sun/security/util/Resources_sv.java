/*     */ package sun.security.util;
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
/*     */ public class Resources_sv
/*     */   extends ListResourceBundle
/*     */ {
/*  35 */   private static final Object[][] contents = new Object[][] { { "invalid.null.input.s.", "ogiltiga null-indata" }, { "actions.can.only.be.read.", "åtgärder kan endast 'läsas'" }, { "permission.name.name.syntax.invalid.", "syntaxen för behörighetsnamnet [{0}] är ogiltig: " }, { "Credential.Class.not.followed.by.a.Principal.Class.and.Name", "Inloggningsuppgiftsklassen följs inte av klass eller namn för identitetshavare" }, { "Principal.Class.not.followed.by.a.Principal.Name", "Identitetshavareklassen följs inte av något identitetshavarenamn" }, { "Principal.Name.must.be.surrounded.by.quotes", "Identitetshavarenamnet måste anges inom citattecken" }, { "Principal.Name.missing.end.quote", "Identitetshavarenamnet saknar avslutande citattecken" }, { "PrivateCredentialPermission.Principal.Class.can.not.be.a.wildcard.value.if.Principal.Name.is.not.a.wildcard.value", "Identitetshavareklassen PrivateCredentialPermission kan inte ha något jokertecken (*) om inte namnet på identitetshavaren anges med jokertecken (*)" }, { "CredOwner.Principal.Class.class.Principal.Name.name", "CredOwner:\n\tIdentitetshavareklass = {0}\n\tIdentitetshavarenamn = {1}" }, { "provided.null.name", "null-namn angavs" }, { "provided.null.keyword.map", "nullnyckelordsmappning angavs" }, { "provided.null.OID.map", "null-OID-mappning angavs" }, { "NEWLINE", "\n" }, { "invalid.null.AccessControlContext.provided", "ogiltigt null-AccessControlContext" }, { "invalid.null.action.provided", "ogiltig null-funktion" }, { "invalid.null.Class.provided", "ogiltig null-klass" }, { "Subject.", "Innehavare:\n" }, { ".Principal.", "\tIdentitetshavare: " }, { ".Public.Credential.", "\tOffentlig inloggning: " }, { ".Private.Credentials.inaccessible.", "\tPrivat inloggning är inte möjlig\n" }, { ".Private.Credential.", "\tPrivat inloggning: " }, { ".Private.Credential.inaccessible.", "\tPrivat inloggning är inte möjlig\n" }, { "Subject.is.read.only", "Innehavare är skrivskyddad" }, { "attempting.to.add.an.object.which.is.not.an.instance.of.java.security.Principal.to.a.Subject.s.Principal.Set", "försök att lägga till ett objekt som inte är en instans av java.security.Principal till ett subjekts uppsättning av identitetshavare" }, { "attempting.to.add.an.object.which.is.not.an.instance.of.class", "försöker lägga till ett objekt som inte är en instans av {0}" }, { "LoginModuleControlFlag.", "LoginModuleControlFlag: " }, { "Invalid.null.input.name", "Ogiltiga null-indata: namn" }, { "No.LoginModules.configured.for.name", "Inga inloggningsmoduler har konfigurerats för {0}" }, { "invalid.null.Subject.provided", "ogiltig null-subjekt" }, { "invalid.null.CallbackHandler.provided", "ogiltig null-CallbackHandler" }, { "null.subject.logout.called.before.login", "null-subjekt - utloggning anropades före inloggning" }, { "unable.to.instantiate.LoginModule.module.because.it.does.not.provide.a.no.argument.constructor", "kan inte instansiera LoginModule, {0}, eftersom den inte tillhandahåller någon icke-argumentskonstruktor" }, { "unable.to.instantiate.LoginModule", "kan inte instansiera LoginModule" }, { "unable.to.instantiate.LoginModule.", "kan inte instansiera LoginModule: " }, { "unable.to.find.LoginModule.class.", "hittar inte LoginModule-klassen: " }, { "unable.to.access.LoginModule.", "ingen åtkomst till LoginModule: " }, { "Login.Failure.all.modules.ignored", "Inloggningsfel: alla moduler ignoreras" }, { "java.security.policy.error.parsing.policy.message", "java.security.policy: fel vid tolkning av {0}:\n\t{1}" }, { "java.security.policy.error.adding.Permission.perm.message", "java.security.policy: fel vid tillägg av behörighet, {0}:\n\t{1}" }, { "java.security.policy.error.adding.Entry.message", "java.security.policy: fel vid tillägg av post:\n\t{0}" }, { "alias.name.not.provided.pe.name.", "aliasnamn ej angivet ({0})" }, { "unable.to.perform.substitution.on.alias.suffix", "kan ej ersätta alias, {0}" }, { "substitution.value.prefix.unsupported", "ersättningsvärde, {0}, stöds ej" }, { "LPARAM", "(" }, { "RPARAM", ")" }, { "type.can.t.be.null", "typen kan inte vara null" }, { "keystorePasswordURL.can.not.be.specified.without.also.specifying.keystore", "kan inte ange keystorePasswordURL utan att ange nyckellager" }, { "expected.keystore.type", "förväntad nyckellagertyp" }, { "expected.keystore.provider", "nyckellagerleverantör förväntades" }, { "multiple.Codebase.expressions", "flera CodeBase-uttryck" }, { "multiple.SignedBy.expressions", "flera SignedBy-uttryck" }, { "duplicate.keystore.domain.name", "domännamn för dubbelt nyckellager: {0}" }, { "duplicate.keystore.name", "namn för dubbelt nyckellager: {0}" }, { "SignedBy.has.empty.alias", "SignedBy har ett tomt alias" }, { "can.not.specify.Principal.with.a.wildcard.class.without.a.wildcard.name", "kan inte ange identitetshavare med en jokerteckenklass utan ett jokerteckennamn" }, { "expected.codeBase.or.SignedBy.or.Principal", "förväntad codeBase eller SignedBy eller identitetshavare" }, { "expected.permission.entry", "förväntade behörighetspost" }, { "number.", "nummer" }, { "expected.expect.read.end.of.file.", "förväntade [{0}], läste [filslut]" }, { "expected.read.end.of.file.", "förväntade [;], läste [filslut]" }, { "line.number.msg", "rad {0}: {1}" }, { "line.number.expected.expect.found.actual.", "rad {0}: förväntade [{1}], hittade [{2}]" }, { "null.principalClass.or.principalName", "null-principalClass eller -principalName" }, { "PKCS11.Token.providerName.Password.", "Lösenord för PKCS11-token [{0}]: " }, { "unable.to.instantiate.Subject.based.policy", "kan inte instansiera subjektbaserad policy" } };
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
/* 169 */     return contents;
/*     */   }
/*     */ }


/* Location:              /Users/timmy/timmy/OSWE/oswe/openCRX/rt.jar!/sun/security/util/Resources_sv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */