package defpackage;

import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class sjd implements uxe {
    private static final String NEGATIVE = "-";
    private static final Pattern PATTERN_MULTIPLE_WHITESPACES = Pattern.compile("\\s{2,}");
    public static final String QUANTITY = "%n";
    public static final String SIGN = "%s";
    public static final String UNIT = "%u";
    private Locale locale;
    private String singularName = "";
    private String pluralName = "";
    private String futureSingularName = "";
    private String futurePluralName = "";
    private String pastSingularName = "";
    private String pastPluralName = "";
    private String pattern = "";
    private String futurePrefix = "";
    private String futureSuffix = "";
    private String pastPrefix = "";
    private String pastSuffix = "";
    private int roundingTolerance = 50;

    public final String a(zq4 zq4Var, boolean z) {
        String str = ((cr4) zq4Var).a < 0 ? NEGATIVE : "";
        String gramaticallyCorrectName = getGramaticallyCorrectName(zq4Var, z);
        long quantity = getQuantity(zq4Var, z);
        String strReplace = getPattern(quantity).replace("%s", str);
        Locale locale = this.locale;
        return strReplace.replace("%n", locale != null ? String.format(locale, "%d", Long.valueOf(quantity)) : String.format("%d", Long.valueOf(quantity))).replace("%u", gramaticallyCorrectName);
    }

    @Override // defpackage.uxe
    public String decorate(zq4 zq4Var, String str) {
        StringBuilder sb = new StringBuilder();
        if (((cr4) zq4Var).c()) {
            ub3.v(sb, this.pastPrefix, " ", str, " ");
            sb.append(this.pastSuffix);
        } else {
            ub3.v(sb, this.futurePrefix, " ", str, " ");
            sb.append(this.futureSuffix);
        }
        return PATTERN_MULTIPLE_WHITESPACES.matcher(sb).replaceAll(" ").trim();
    }

    @Override // defpackage.uxe
    public String decorateUnrounded(zq4 zq4Var, String str) {
        return decorate(zq4Var, str);
    }

    @Override // defpackage.uxe
    public String format(zq4 zq4Var) {
        return a(zq4Var, true);
    }

    @Override // defpackage.uxe
    public String formatUnrounded(zq4 zq4Var) {
        return a(zq4Var, false);
    }

    public String getGramaticallyCorrectName(zq4 zq4Var, boolean z) {
        String str;
        String str2;
        String str3;
        cr4 cr4Var = (cr4) zq4Var;
        if (!cr4Var.b() || (str3 = this.futureSingularName) == null || str3.length() <= 0) {
            str = (!cr4Var.c() || (str2 = this.pastSingularName) == null || str2.length() <= 0) ? this.singularName : this.pastSingularName;
        } else {
            str = this.futureSingularName;
        }
        if (!isPlural(zq4Var, z)) {
            return str;
        }
        if (!cr4Var.b() || this.futurePluralName == null || this.futureSingularName.length() <= 0) {
            return (!cr4Var.c() || this.pastPluralName == null || this.pastSingularName.length() <= 0) ? this.pluralName : this.pastPluralName;
        }
        return this.futurePluralName;
    }

    public String getPattern(long j) {
        return this.pattern;
    }

    public long getQuantity(zq4 zq4Var, boolean z) {
        long jA;
        if (z) {
            jA = ((cr4) zq4Var).a(this.roundingTolerance);
        } else {
            jA = ((cr4) zq4Var).a;
        }
        return Math.abs(jA);
    }

    public boolean isPlural(zq4 zq4Var, boolean z) {
        long jAbs = Math.abs(getQuantity(zq4Var, z));
        return jAbs == 0 || jAbs > 1;
    }

    public sjd setFuturePluralName(String str) {
        this.futurePluralName = str;
        return this;
    }

    public sjd setFuturePrefix(String str) {
        this.futurePrefix = str.trim();
        return this;
    }

    public sjd setFutureSingularName(String str) {
        this.futureSingularName = str;
        return this;
    }

    public sjd setFutureSuffix(String str) {
        this.futureSuffix = str.trim();
        return this;
    }

    public /* bridge */ Object setLocale(Locale locale) {
        return mo31setLocale(locale);
    }

    public sjd setPastPluralName(String str) {
        this.pastPluralName = str;
        return this;
    }

    public sjd setPastPrefix(String str) {
        this.pastPrefix = str.trim();
        return this;
    }

    public sjd setPastSingularName(String str) {
        this.pastSingularName = str;
        return this;
    }

    public sjd setPastSuffix(String str) {
        this.pastSuffix = str.trim();
        return this;
    }

    public sjd setPattern(String str) {
        this.pattern = str;
        return this;
    }

    public sjd setPluralName(String str) {
        this.pluralName = str;
        return this;
    }

    public sjd setRoundingTolerance(int i) {
        this.roundingTolerance = i;
        return this;
    }

    public sjd setSingularName(String str) {
        this.singularName = str;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SimpleTimeFormat [pattern=");
        sb.append(this.pattern);
        sb.append(", futurePrefix=");
        sb.append(this.futurePrefix);
        sb.append(", futureSuffix=");
        sb.append(this.futureSuffix);
        sb.append(", pastPrefix=");
        sb.append(this.pastPrefix);
        sb.append(", pastSuffix=");
        sb.append(this.pastSuffix);
        sb.append(", roundingTolerance=");
        return tec.g(this.roundingTolerance, "]", sb);
    }

    public String getPattern() {
        return this.pattern;
    }

    /* JADX INFO: renamed from: setLocale */
    public sjd mo31setLocale(Locale locale) {
        this.locale = locale;
        return this;
    }
}
