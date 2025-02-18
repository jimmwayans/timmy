/*     */ package com.sun.java.util.jar.pack;
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
/*     */ 
/*     */ public class DriverResource
/*     */   extends ListResourceBundle
/*     */ {
/*     */   public static final String VERSION = "VERSION";
/*     */   public static final String BAD_ARGUMENT = "BAD_ARGUMENT";
/*     */   public static final String BAD_OPTION = "BAD_OPTION";
/*     */   public static final String BAD_REPACK_OUTPUT = "BAD_REPACK_OUTPUT";
/*     */   public static final String DETECTED_ZIP_COMMENT = "DETECTED_ZIP_COMMENT";
/*     */   public static final String SKIP_FOR_REPACKED = "SKIP_FOR_REPACKED";
/*     */   public static final String WRITE_PACK_FILE = "WRITE_PACK_FILE";
/*     */   public static final String WRITE_PACKGZ_FILE = "WRITE_PACKGZ_FILE";
/*     */   public static final String SKIP_FOR_MOVE_FAILED = "SKIP_FOR_MOVE_FAILED";
/*     */   public static final String PACK_HELP = "PACK_HELP";
/*     */   public static final String UNPACK_HELP = "UNPACK_HELP";
/*     */   public static final String MORE_INFO = "MORE_INFO";
/*     */   public static final String DUPLICATE_OPTION = "DUPLICATE_OPTION";
/*     */   public static final String BAD_SPEC = "BAD_SPEC";
/*  50 */   private static final Object[][] resource = new Object[][] { { "VERSION", "{0} version {1}" }, { "BAD_ARGUMENT", "Bad argument: {0}" }, { "BAD_OPTION", "Bad option: {0}={1}" }, { "BAD_REPACK_OUTPUT", "Bad --repack output: {0}" }, { "DETECTED_ZIP_COMMENT", "Detected ZIP comment: {0}" }, { "SKIP_FOR_REPACKED", "Skipping because already repacked: {0}" }, { "WRITE_PACK_FILE", "To write a *.pack file, specify --no-gzip: {0}" }, { "WRITE_PACKGZ_FILE", "To write a *.pack.gz file, specify --gzip: {0}" }, { "SKIP_FOR_MOVE_FAILED", "Skipping unpack because move failed: {0}" }, { "PACK_HELP", { "Usage:  pack200 [-opt... | --option=value]... x.pack[.gz] y.jar", "", "Packing Options", "  -g, --no-gzip                   output a plain *.pack file with no zipping", "  --gzip                          (default) post-process the pack output with gzip", "  -G, --strip-debug               remove debugging attributes while packing", "  -O, --no-keep-file-order        do not transmit file ordering information", "  --keep-file-order               (default) preserve input file ordering", "  -S{N}, --segment-limit={N}      output segment limit (default N=1Mb)", "  -E{N}, --effort={N}             packing effort (default N=5)", "  -H{h}, --deflate-hint={h}       transmit deflate hint: true, false, or keep (default)", "  -m{V}, --modification-time={V}  transmit modtimes: latest or keep (default)", "  -P{F}, --pass-file={F}          transmit the given input element(s) uncompressed", "  -U{a}, --unknown-attribute={a}  unknown attribute action: error, strip, or pass (default)", "  -C{N}={L}, --class-attribute={N}={L}  (user-defined attribute)", "  -F{N}={L}, --field-attribute={N}={L}  (user-defined attribute)", "  -M{N}={L}, --method-attribute={N}={L} (user-defined attribute)", "  -D{N}={L}, --code-attribute={N}={L}   (user-defined attribute)", "  -f{F}, --config-file={F}        read file F for Pack200.Packer properties", "  -v, --verbose                   increase program verbosity", "  -q, --quiet                     set verbosity to lowest level", "  -l{F}, --log-file={F}           output to the given log file, or '-' for System.out", "  -?, -h, --help                  print this message", "  -V, --version                   print program version", "  -J{X}                           pass option X to underlying Java VM", "", "Notes:", "  The -P, -C, -F, -M, and -D options accumulate.", "  Example attribute definition:  -C SourceFile=RUH .", "  Config. file properties are defined by the Pack200 API.", "  For meaning of -S, -E, -H-, -m, -U values, see Pack200 API.", "  Layout definitions (like RUH) are defined by JSR 200.", "", "Repacking mode updates the JAR file with a pack/unpack cycle:", "    pack200 [-r|--repack] [-opt | --option=value]... [repackedy.jar] y.jar\n" } }, { "UNPACK_HELP", { "Usage:  unpack200 [-opt... | --option=value]... x.pack[.gz] y.jar\n", "", "Unpacking Options", "  -H{h}, --deflate-hint={h}     override transmitted deflate hint: true, false, or keep (default)", "  -r, --remove-pack-file        remove input file after unpacking", "  -v, --verbose                 increase program verbosity", "  -q, --quiet                   set verbosity to lowest level", "  -l{F}, --log-file={F}         output to the given log file, or '-' for System.out", "  -?, -h, --help                print this message", "  -V, --version                 print program version", "  -J{X}                         pass option X to underlying Java VM" } }, { "MORE_INFO", "(For more information, run {0} --help .)" }, { "DUPLICATE_OPTION", "duplicate option: {0}" }, { "BAD_SPEC", "bad spec for {0}: {1}" } };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Object[][] getContents() {
/* 118 */     return resource;
/*     */   }
/*     */ }


/* Location:              /Users/timmy/timmy/OSWE/oswe/openCRX/rt.jar!/com/sun/java/util/jar/pack/DriverResource.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */