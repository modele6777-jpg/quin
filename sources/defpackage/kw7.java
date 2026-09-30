package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kw7 extends i09 implements xz9 {
    public boolean E0;
    public float Z;

    @Override // defpackage.xz9
    public final Object b(sw3 sw3Var, Object obj) {
        r7c r7cVar = obj instanceof r7c ? (r7c) obj : null;
        if (r7cVar == null) {
            r7cVar = new r7c();
        }
        r7cVar.a = this.Z;
        r7cVar.b = this.E0;
        return r7cVar;
    }
}
