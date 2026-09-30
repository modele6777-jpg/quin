package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF3' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xgh {
    public static final xgh a;
    public static final xgh[] b;
    public static final /* synthetic */ xgh[] c;
    private final char zzl;
    private final zgh zzm;
    private final int zzn;
    private final String zzo;

    /* JADX INFO: Fake field, exist only in values array */
    xgh EF0;

    /* JADX INFO: Fake field, exist only in values array */
    xgh EF1;

    /* JADX INFO: Fake field, exist only in values array */
    xgh EF2;

    /* JADX INFO: Fake field, exist only in values array */
    xgh EF3;

    static {
        xgh xghVar = new xgh("STRING", 0, 's', zgh.a, "-#", true);
        xgh xghVar2 = new xgh("BOOLEAN", 1, 'b', zgh.b, "-", true);
        xgh xghVar3 = new xgh("CHAR", 2, 'c', zgh.c, "-", true);
        zgh zghVar = zgh.d;
        xgh xghVar4 = new xgh("DECIMAL", 3, 'd', zghVar, "-0+ ,(", false);
        xgh xghVar5 = new xgh("OCTAL", 4, 'o', zghVar, "-#0(", false);
        xgh xghVar6 = new xgh("HEX", 5, 'x', zghVar, "-#0(", true);
        a = xghVar6;
        zgh zghVar2 = zgh.e;
        c = new xgh[]{xghVar, xghVar2, xghVar3, xghVar4, xghVar5, xghVar6, new xgh("FLOAT", 6, 'f', zghVar2, "-#0+ ,(", false), new xgh("EXPONENT", 7, 'e', zghVar2, "-#0+ (", true), new xgh("GENERAL", 8, 'g', zghVar2, "-0+ ,(", true), new xgh("EXPONENT_HEX", 9, 'a', zghVar2, "-#0+ ", true)};
        b = new xgh[26];
        for (xgh xghVar7 : values()) {
            b[(xghVar7.zzl | ' ') - 97] = xghVar7;
        }
    }

    public xgh(String str, int i, char c2, zgh zghVar, String str2, boolean z) {
        super(str, i);
        this.zzl = c2;
        this.zzm = zghVar;
        ygh yghVar = ygh.e;
        int i2 = true != z ? 0 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        for (int i3 = 0; i3 < str2.length(); i3++) {
            int iCharAt = ((int) ((ygh.d >>> ((str2.charAt(i3) - ' ') * 3)) & 7)) - 1;
            if (iCharAt < 0) {
                qc0.j("invalid flags: ".concat(str2));
                throw null;
            }
            i2 |= 1 << iCharAt;
        }
        this.zzn = i2;
        this.zzo = ub3.l(new StringBuilder(String.valueOf(c2).length() + 1), "%", c2);
    }

    public static xgh a(char c2) {
        xgh xghVar = b[(c2 | ' ') - 97];
        if ((c2 & ' ') != 0) {
            return xghVar;
        }
        if (xghVar == null || (xghVar.zzn & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
            return null;
        }
        return xghVar;
    }

    public static xgh[] values() {
        return (xgh[]) c.clone();
    }

    public final char b() {
        return this.zzl;
    }

    public final zgh c() {
        return this.zzm;
    }

    public final int d() {
        return this.zzn;
    }

    public final String e() {
        return this.zzo;
    }
}
