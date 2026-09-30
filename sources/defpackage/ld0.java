package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ld0 extends g2 {
    public int c = -1;
    public final /* synthetic */ md0 d;

    public ld0(md0 md0Var) {
        this.d = md0Var;
    }

    @Override // defpackage.g2
    public final void b() {
        int i;
        Object[] objArr;
        do {
            i = this.c + 1;
            this.c = i;
            objArr = this.d.a;
            if (i >= objArr.length) {
                break;
            }
        } while (objArr[i] == null);
        if (i >= objArr.length) {
            this.a = 2;
            return;
        }
        Object obj = objArr[i];
        obj.getClass();
        this.b = obj;
        this.a = 1;
    }
}
