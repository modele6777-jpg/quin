package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public enum jua {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");

    private final lw7 arrayTypeFqName$delegate;
    private final t99 arrayTypeName;
    private final lw7 typeFqName$delegate;
    private final t99 typeName;
    public static final Set a = qd0.I0(new jua[]{CHAR, BYTE, SHORT, INT, FLOAT, LONG, DOUBLE});

    jua(String str) {
        this.typeName = t99.e(str);
        this.arrayTypeName = t99.e(str.concat("Array"));
        iua iuaVar = new iua(this, 0);
        z18 z18Var = z18.b;
        this.typeFqName$delegate = eb3.N(z18Var, iuaVar);
        this.arrayTypeFqName$delegate = eb3.N(z18Var, new iua(this, 1));
    }

    public static final dx5 a(jua juaVar) {
        return tyd.k.a(juaVar.arrayTypeName);
    }

    public static final dx5 g(jua juaVar) {
        return tyd.k.a(juaVar.typeName);
    }

    public final dx5 b() {
        return (dx5) this.arrayTypeFqName$delegate.getValue();
    }

    public final t99 c() {
        return this.arrayTypeName;
    }

    public final dx5 d() {
        return (dx5) this.typeFqName$delegate.getValue();
    }

    public final t99 e() {
        return this.typeName;
    }
}
