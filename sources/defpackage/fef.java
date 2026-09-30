package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fef implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pad b;
    public final /* synthetic */ Integer c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ a26 e;

    public /* synthetic */ fef(pad padVar, Integer num, boolean z, a26 a26Var, int i) {
        this.a = i;
        this.b = padVar;
        this.c = num;
        this.d = z;
        this.e = a26Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        a26 a26Var = this.e;
        boolean z = this.d;
        Integer num = this.c;
        pad padVar = this.b;
        switch (i) {
            case 0:
                g8d g8dVar = (g8d) obj;
                g8dVar.getClass();
                padVar.g(num.intValue(), g8dVar);
                if (!z) {
                    a26Var.d(num);
                }
                break;
            default:
                Bitmap bitmap = (Bitmap) obj;
                bitmap.getClass();
                int iIntValue = num.intValue();
                padVar.getClass();
                g8d g8dVar2 = (g8d) padVar.e.remove(num);
                if (g8dVar2 != null) {
                    g8dVar2.a();
                }
                padVar.a.c(num, bitmap);
                padVar.b.put(num, Integer.valueOf(padVar.i(iIntValue) + 1));
                if (!z) {
                    a26Var.d(num);
                }
                break;
        }
        return wefVar;
    }
}
