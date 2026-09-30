package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public enum dgf {
    /* JADX INFO: Fake field, exist only in values array */
    UBYTE(mh3.z("kotlin/UByte", false)),
    /* JADX INFO: Fake field, exist only in values array */
    USHORT(mh3.z("kotlin/UShort", false)),
    /* JADX INFO: Fake field, exist only in values array */
    UINT(mh3.z("kotlin/UInt", false)),
    /* JADX INFO: Fake field, exist only in values array */
    ULONG(mh3.z("kotlin/ULong", false));

    private final j22 arrayClassId;
    private final j22 classId;
    private final t99 typeName;

    dgf(j22 j22Var) {
        this.classId = j22Var;
        t99 t99VarF = j22Var.f();
        this.typeName = t99VarF;
        this.arrayClassId = new j22(j22Var.a, t99.e(t99VarF.b() + "Array"));
    }

    public final j22 a() {
        return this.arrayClassId;
    }

    public final j22 b() {
        return this.classId;
    }

    public final t99 c() {
        return this.typeName;
    }
}
