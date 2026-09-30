package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ag7 extends cd {
    public static final ag7 d = new ag7("package", false);

    @Override // defpackage.cd
    public final Integer a(cd cdVar) {
        cdVar.getClass();
        if (this == cdVar) {
            return 0;
        }
        fl8 fl8Var = oyf.a;
        return (cdVar == jyf.d || cdVar == kyf.d) ? 1 : -1;
    }

    @Override // defpackage.cd
    public final String e() {
        return "public/*package*/";
    }

    @Override // defpackage.cd
    public final cd l() {
        return lyf.d;
    }
}
