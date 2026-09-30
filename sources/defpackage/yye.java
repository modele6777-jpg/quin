package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yye {
    public static final yye a;
    public static final yye b;
    public static final yye c;
    public static final /* synthetic */ yye[] d;

    static {
        yye yyeVar = new yye("On", 0);
        a = yyeVar;
        yye yyeVar2 = new yye("Off", 1);
        b = yyeVar2;
        yye yyeVar3 = new yye("Indeterminate", 2);
        c = yyeVar3;
        d = new yye[]{yyeVar, yyeVar2, yyeVar3};
    }

    public static yye valueOf(String str) {
        return (yye) Enum.valueOf(yye.class, str);
    }

    public static yye[] values() {
        return (yye[]) d.clone();
    }
}
