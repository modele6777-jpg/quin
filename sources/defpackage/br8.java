package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class br8 implements ly1 {
    public final /* synthetic */ int a;
    public final String b;

    public /* synthetic */ br8(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.ly1
    public final /* bridge */ String b(if7 if7Var) {
        switch (this.a) {
            case 0:
                break;
        }
        return b21.E(this, if7Var);
    }

    @Override // defpackage.ly1
    public final String getDescription() {
        int i = this.a;
        return this.b;
    }
}
