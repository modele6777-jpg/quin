package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class gy3 extends rx3 implements ym7, pn7 {
    public gy3() {
        super(dm7.j);
    }

    public abstract uxa H();

    public abstract uy3 I();

    @Override // defpackage.ym7
    public final boolean isExternal() {
        return H().g;
    }

    @Override // defpackage.ym7
    public final boolean isInfix() {
        H();
        return false;
    }

    @Override // defpackage.ym7
    public final boolean isInline() {
        return H().x;
    }

    @Override // defpackage.ym7
    public final boolean isOperator() {
        H();
        return false;
    }

    @Override // defpackage.cm7, defpackage.ym7
    public final boolean isSuspend() {
        H();
        return false;
    }

    @Override // defpackage.wnb
    public final sa1 n() {
        return null;
    }

    @Override // defpackage.wnb
    public final xm7 s() {
        return I().v;
    }

    @Override // defpackage.wnb
    public final Object x() {
        return I().y;
    }
}
