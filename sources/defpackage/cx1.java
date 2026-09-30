package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class cx1 implements npa {
    public abstract boolean a(char c);

    @Override // defpackage.npa
    public final boolean apply(Object obj) {
        return a(((Character) obj).charValue());
    }
}
