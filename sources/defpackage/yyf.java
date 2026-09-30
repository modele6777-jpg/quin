package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yyf implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public /* synthetic */ yyf(int i, float f) {
        this.a = i;
        this.b = f;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        switch (this.a) {
            case 0:
                return new y72(y72.b(((y72) obj).a, this.b));
            default:
                return new y72(y72.b(((y72) obj).a, 0.35f * this.b));
        }
    }
}
